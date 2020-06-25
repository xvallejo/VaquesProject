using System;
using Xunit;

namespace Vaques.Model
{
    public class RacaTests
    {
        [Fact]
        public void TestQueSiNoHiHaNomLiPosemDesconeguda()
        {
            var sut = new Raca(null, 23);
            Assert.Equal(Raca.Desconeguda, sut.Nom);

        }

        [Theory]
        [InlineData("Holdstein")]
        [InlineData("X")]
        [InlineData("XXXXXXXXXX")]
        public void testQueElNomEsElQueLiHemDonat(string nom)
        {
            var sut = new Raca(nom, 5);
            Assert.Equal(nom, sut.Nom);
        }

        [Theory]
        [InlineData("")]
        [InlineData("  ")]
        [InlineData("\t")]
        [InlineData("\n")]
        public void testQueSiElNomEsBuitRetornaRaçaDesconeguda(string nom)
        {
            var sut = new Raca(nom, 10);
            Assert.Equal(Raca.Desconeguda, sut.Nom);
        }





    }
}
