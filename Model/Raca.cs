using System;

namespace Vaca.Model
{
    public class Raca
    {
        public Raca(string nom, double litres)
        {
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
