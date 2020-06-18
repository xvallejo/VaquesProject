package net.xaviersala.Vaca.Model;

import java.util.ArrayList;
import java.util.List;

public class Camio {
	
	
	private double PesMaxim;
    private double PesActual;
    private List<Vaca> Vaques;
    private double Litres;
	
    public Camio(double pesMax)
    {
        PesMaxim = pesMax;
        PesActual = 0;
        Vaques = new ArrayList<Vaca>();
    }
    
    
    public double getPesMaxim() {
		return PesMaxim;
	}


	public double getPesActual() {
		return PesActual;
	}


	public List<Vaca> getVaques() {
		return Vaques;
	}

	public double getLitres() {
		return Litres;
	}


	public double GetLitres() { 
    	return Vaques.stream().mapToDouble(i -> i.GetLitres()).sum();
    };

    public boolean EntraVaca(Vaca vaca)
    {
        if (PesActual + vaca.getPes() > PesMaxim)
        {
            return false;
        }

        Vaques.add(vaca);
        PesActual += vaca.getPes();
        return true;
    }

    public boolean TreuVaca(Vaca vaca)
    {
        boolean resultat = Vaques.remove(vaca);
        if (resultat) { PesActual -= vaca.getPes(); }
        return resultat;
    }

    @Override
    public String toString() {
    	return "Camio max: " + PesMaxim + "(" + PesActual + " - vaques: " + Vaques.size();
    }

}
