using System;
using Xunit;

namespace Vaques.Model
{
    public class RacaTests
    {
        [Fact]
        public void TestQueSiNoHiHaNomLiPosemDesconeguda()
        {
            // ARRANGE
            var sut = new Raca(null, 23);

            // ACT
            var resultat = sut.Nom;

            // ASSERT
            Assert.Equal(Raca.Desconeguda, resultat);

        }

        [Theory]
        [InlineData("Holdstein")]
        [InlineData("X")]
        [InlineData("XXXXXXXXXX")]
        public void testQueElNomEsElQueLiHemDonat(string nom)
        {
            // ARRANGE
            var sut = new Raca(nom, 5);

            // ACT
            var resultat = sut.Nom;

            // ASSERT
            Assert.Equal(nom, resultat);
        }

        [Theory]
        [InlineData("")]
        [InlineData("  ")]
        [InlineData("\t")]
        [InlineData("\n")]
        public void testQueSiElNomEsBuitRetornaRaçaDesconeguda(string nom)
        {
            // ARRANGE
            var sut = new Raca(nom, 10);

            // ACT
            var resultat = sut.Nom;

            // ASSERT
            Assert.Equal(Raca.Desconeguda, resultat);
        }





    }
}
