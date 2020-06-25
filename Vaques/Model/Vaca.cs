namespace Vaques.Model
{
    public class Vaca
    {
        public Vaca(string nom, double pes, Raca raca)
        {
            Nom = nom;
            Pes = pes;
            Raca = raca;
        }

        public string Nom { get; set; }
        public double Pes { get; }

        public Raca Raca { get; }

        public virtual double GetLitres() => Pes * Raca.LitresPerKg;

        public virtual string crida()
        {
            var crit = "";
            for (int i = 0; i < Pes; i += 100)
            {
                crit += " Mu";
            }
            return crit;
        }

        public override string ToString()
        {
            return $"{Nom} ({Raca.Nom}) - pes: {Pes}";
        }

    }
}