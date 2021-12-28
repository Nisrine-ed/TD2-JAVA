package exercice7_serie2;

import java.util.Date;

public class Primeurs extends Article {
	
	private Date dateperemption;

	public Primeurs() {}
	

	public Primeurs(Date dateperemption,String nomproduit, String fournisseur,double prixachat, double prixvente) {
		super(nomproduit, fournisseur,prixachat, prixvente );
		this.dateperemption = dateperemption;
	}
	
	public String toString() {
		return "Primeurs : " + "\nNom = " + nomproduit + "\nFournisseur = " + fournisseur + "\nPrix d'achat = " + prixachat + "\nPrix de vente = " + prixvente + "Date De Premetion = " + dateperemption ;
	}
}
