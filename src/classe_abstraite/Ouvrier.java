package classe_abstraite;

import java.time.LocalDateTime;

public class Ouvrier extends Employe {

	private LocalDateTime dateentree = LocalDateTime.MIN;
	private static double SMIG = 3000;

	public static double getSMIG()
	{
		return SMIG;
	}


	public LocalDateTime getDateentree()
	{
		return dateentree;
	}
	public final void setDatedentree(LocalDateTime dateentree)
	{
		this.dateentree = dateentree;
	}

	public Ouvrier(int m, String n, String p, LocalDateTime ddn, LocalDateTime de)
	{
		super(m, n, p, ddn);
		dateentree = de;
	}

	
	public String toString()
	{
		return "Employé:" + " " + super.toString() + " Date d'entrée: " + dateentree.getYear();
	}

	
	public double GetSalaire()
	{
		double salaire;
		int Anciennete = LocalDateTime.now().getYear() - dateentree.getYear();
		LocalDateTime.now();
		if (dateentree.plusYears(Anciennete).compareTo(LocalDateTime.MIN) > 0)
		{
			Anciennete--;
		}
		if (SMIG + Anciennete * 100 <= 2 * SMIG)
		{
			salaire = SMIG + Anciennete * 100;
		}
		else
		{
			salaire = SMIG * 2;
		}

		return salaire;
	}
}
