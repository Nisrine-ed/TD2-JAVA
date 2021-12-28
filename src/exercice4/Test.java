package exercice4;

public class Test {
	
	public static void main(String[] args) {
        try {
            AdresseIP adrs = new AdresseIP(323, 156, 111, 147);
        } catch (AdresseIPException ex) {
          System.out.println("Erreur Construction");
          System.out.println(ex.getMessage());
          //ex.printStackTrace();
          System.exit(-1);
        }
        

    }

}
