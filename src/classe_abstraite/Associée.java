
package classe_abstraite;

import java.time.LocalDateTime;

public class Associ�e extends Employe {
	
	private static double chiffreaffaires;
	private double pourcentage;
	
	public static double getChiffreaffaires() {
		return chiffreaffaires;
	}
	public static void setChiffreaffaires(double chiffreaffaires) {
		Associ�e.chiffreaffaires = chiffreaffaires;
	}

	public double getPourcentage()
	{
		return pourcentage;
	}
	public void setPourcentage(double pourcentage )
	{
		this.pourcentage = pourcentage ;
	}

	public Associ�e(int matricule, String nom, String prenom, LocalDateTime dn, double p)
	{
		super(matricule, nom, prenom, dn);
		pourcentage = p;
	}

	
	public String toString()
	{
		return "Associ�e: " + " " + super.toString() + " Pourcentage: " + pourcentage + "%";
	}

	
	public double GetSalaire()
	{
		return Double.isNaN(((chiffreaffaires * pourcentage / 100) / 12)) ? Double.NaN : Math.round(((chiffreaffaires * pourcentage / 100) / 12) * Math.pow(10, 2)) / Math.pow(10, 2);
	}
	

}
