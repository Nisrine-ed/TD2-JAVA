package exercice2;

public class Test {
	
	public static void main(String[] args) throws AgeEnfantException {
		try {
		Enfant e = new Enfant(22);
		}
		catch (AgeEnfantException ex) {
		System.out.println(ex.getMessage());
		}
		
		
		
	}

}
