/**
 * 
 */
package net.xaviersala.Vaca.Model;

/**
 * @author xavier
 *
 */
public class Raca {
	
    private String Nom;    
    private double LitresPerKg;
	
    public Raca(String nom, double litres)
    {
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
