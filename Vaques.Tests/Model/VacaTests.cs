using System;
using Moq;
using Xunit;

namespace Vaques.Model
{
    public class VacaTests
    {
        [Theory]
        [InlineData(23, 12)]
        [InlineData(10, 10)]
        [InlineData(1, 12)]
        public void TestQueCalculaBeElsLitres(double pes, double litres)
        {
            // ARRANGE: Crear Raca. Els paràmetres no importen perquè els falsifico
            var raca = new Mock<Raca>("No importa", 0);
            raca.Setup(r => r.LitresPerKg).Returns(litres);

            var sut = new Vaca("X", pes, raca.Object);

            // ACT
            var resultat = sut.GetLitres();

            // ASSERT
            Assert.Equal(pes * litres, resultat);

        }

    }
}
