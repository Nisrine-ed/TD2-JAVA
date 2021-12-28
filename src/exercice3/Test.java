package exercice3;

public class Test {  
		
public static void main(String[] args) throws PopulationException {   
		
		try {
	    Ville ville1 = new Ville("Paris", -6895, "France");
		}
		catch (PopulationException a) {
	    System.out.println(a.getMessage());
		}
	  } 
}
