package classe_abstraite;

import java.time.LocalDateTime;

public class Cadre extends Employe {
	
	private int indice;

	public int getIndice()
	{
		return indice;
	}
	public void setIndice(int indice)
	{
		this.indice = indice;
	}

	public Cadre(int matricule, String nom, String prenom, LocalDateTime ddn, int indice)
	{
		super(matricule, nom, prenom, ddn);
		this.indice = indice;
	}

	
	public String toString()
	{
		return "Cadre: " + " " + super.toString() + " Indice: " + indice;
	}

	
	public double GetSalaire()
	{
		if (indice == 1)
		{
			return 12000;
		}
		else if (indice == 2)
		{
			return 14000;
		}
		else if (indice == 3)
		{
			return 16000;
		}
		else if (indice == 4)
		{
			return 18000;
		}
		else
		{
			return -1; 
		}
	}

}
