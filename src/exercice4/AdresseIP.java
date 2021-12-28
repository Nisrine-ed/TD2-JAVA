package exercice4;

public class AdresseIP {
    
    private int[] octets;
    private String classe;

    public AdresseIP (int o1,int o2, int o3, int o4) throws AdresseIPException {
        
        if (o1 < 0 || o1 > 255)
            throw new AdresseIPException("valeur incorrecte pour le premier octet");
        if (o2 < 0 || o2 > 255)
            throw new AdresseIPException("valeur incorrecte pour le deuxi�me octet");
        if (o3 < 0 || o3 > 255)
            throw new AdresseIPException("valeur incorrecte pour le troisi�me octet");
        if (o4 < 0 || o4 > 255)
            throw new AdresseIPException("valeur incorrecte pour le quatri�me octet");

        octets = new int[] {o1,o2,o3,o4}; 
            }
   
    public String toString() {
        return octets[0] + "." + octets[1] + "." + octets[2] + "."+ octets[3] ; 
	}


   
}