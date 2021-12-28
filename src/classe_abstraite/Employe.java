package classe_abstraite;

import java.time.LocalDateTime;

public abstract class Employe {
	
	private int matricule;
	private String nom;
	private String prenom;
	private LocalDateTime datenaissance = LocalDateTime.MIN;

	public int getMatricule()
	{
		return matricule;
	}
	public void setMatricule(int matricule)
	{
		this.matricule = matricule;
	}

	public String getNom()
	{
		return nom;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return prenom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public LocalDateTime getDatenaissance()
	{
		return datenaissance;
	}
	public void setDatenaissance(LocalDateTime datenaissance)
	{
		this.datenaissance = datenaissance;
	}

	public Employe(int matricule, String nom, String prenom, LocalDateTime ddn)
	{
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		datenaissance = ddn;
	}

	
	public String toString()
	{
		return "\nMatricule: " + matricule + " \nNom: " + nom + " \nPrénom: " + prenom + " \nDate de naissance: " + datenaissance.getYear();
	}

	public abstract double GetSalaire();

}


