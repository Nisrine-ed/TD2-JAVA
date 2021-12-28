package exercice7_serie2;

public class Article {
	
	protected double prixachat;
	protected double prixvente;
	protected String nomproduit;
	protected String fournisseur;
	
	public Article() {
		
	}

	public Article(String nomproduit, String fournisseur, double prixachat, double prixvente) {
		this.nomproduit = nomproduit;
		this.fournisseur = fournisseur;
		this.prixachat = prixachat;
		this.prixvente = prixvente;
	}
	
	
	
	public Article(String nomproduit, String fournisseur) {
		super();
		this.nomproduit = nomproduit;
		this.fournisseur = fournisseur;
	}

	public double TauxRendement() {
		
		return 0;
	}
	
	public String toString() {
		
		return "Article : " + "\nNom = " + nomproduit + "\nFournisseur = " + fournisseur + "\nPrix d'achat = " + prixachat + "\nPrix de vente = " + prixvente ;
	}

	public void lancerLeSolde(double pourcentage) {
		// TODO Auto-generated method stub
		
	}
	
	public void terminerLeSolde(double pourcentage) {
		// TODO Auto-generated method stub
		
	}

}
