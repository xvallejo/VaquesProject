/**
 * 
 */
package net.xaviersala.Vaca.Model;

/**
 * @author xavier
 *
 */
public class Raca {
	
	public static String desconeguda = "Desconeguda";
	
    private String Nom;    
    private double LitresPerKg;
	
    public Raca(String nom, double litres)
    {
    	if (nom == null || nom.isBlank() || nom.isEmpty()) {
    		nom = desconeguda;
    	}
        Nom = nom;
        LitresPerKg = litres;
    }

    public String getNom() {
		return Nom;
	}
    
	public double getLitresPerKg() {
		return LitresPerKg;
	}

	@Override
	public String toString()
    {
        return Nom;
    }

}
