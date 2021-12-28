package exercice7_serie2;

public class ArticlesElectroménagers extends Article implements ProduitSolde {
	
	private double voltage;
	private String marque;
	
	
	
	
	public ArticlesElectroménagers(double voltage, String marque) {
		super();
		this.voltage = voltage;
		this.marque = marque;
	}

	public ArticlesElectroménagers(String nomproduit, String fournisseur,double prixachat,double prixvente, double voltage, String marque) {
		super(nomproduit, fournisseur, prixachat, prixvente);
		this.voltage = voltage;
		this.marque = marque;
	}
	
	public String toString() {
		
		return "Electromenager : " + "\nNom = " + nomproduit + "\nFournisseur = " + fournisseur + "\nPrix d'achat = " + prixachat + "\nPrix de vente = " + prixvente + "\nvoltage = " + voltage + "\nmarque = " + marque ;
		
	}
	
	public void lancer_solde(double pourcentage) {
		
	}
	
    public void terminer_solde(double pourcentage) {
		
	}
	

}
