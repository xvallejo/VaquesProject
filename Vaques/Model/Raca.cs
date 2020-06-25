using System;

namespace Vaques.Model
{
    public class Raca
    {
        public const string Desconeguda = "Desconeguda";
        public Raca(string nom, double litres)
        {
            if (string.IsNullOrEmpty(nom))
            {
                nom = Desconeguda;
            }
            Nom = nom;
            LitresPerKg = litres;
        }

        public string Nom { get; }
        public double LitresPerKg { get; }

        public override string ToString()
        {
            return Nom;
        }
    }
}
