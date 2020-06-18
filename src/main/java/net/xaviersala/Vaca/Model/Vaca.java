package net.xaviersala.Vaca.Model;

public class Vaca {
	
	private String Nom;
    private double Pes;
    private Raca Raca;
    
    public Vaca(String nom, double pes, Raca raca)
    {
    	Nom = nom;
    	Pes = pes;
    	Raca = raca;
    }    

    public String getNom() {
		return Nom;
	}

	public double getPes() {
		return Pes;
	}

	public Raca getRaca() {
		return Raca;
	}

	public double GetLitres() {
    	return Pes * Raca.getLitresPerKg();
    }

    public String crida()
    {
        String crit = "";
        for (int i = 0; i < Pes; i += 100)
        {
            crit += " Mu";
        }
        return crit;
    }

    @Override
    public String toString()
    {
        return Nom +  " (" + Raca.getNom() + ") - pes:" + Pes;
    }


}
