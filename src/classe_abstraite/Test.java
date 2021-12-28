package classe_abstraite;

import java.time.*;

public class Test {

	public static void main(String[] args) {
		
		Ouvrier o = new Ouvrier(1, "Nassima", "Mowssom", LocalDateTime.of(1980, 03, 25, 0, 0), LocalDateTime.of(2010, 12, 18, 0, 0)) ;
		System.out.println(o);
		System.out.println("Salaire de l'employé: " + o.GetSalaire());
		System.out.println("***********************************");
		Cadre c = new Cadre(2, "Salma", "nihal", LocalDateTime.of(1999, 04, 13, 0, 0), 1);
		System.out.println(c);
		System.out.println("Le salaire du cadre est: " + c.GetSalaire());
		System.out.println("***********************************");
		Associée.setChiffreaffaires(50000);
		Associée a = new Associée(3, "lamyae", "oumaima", LocalDateTime.of(2001, 8, 26, 0, 0), 2);
		System.out.println(a);
		System.out.println("Le salaire d'associée est: " + a.GetSalaire());

	}

}
