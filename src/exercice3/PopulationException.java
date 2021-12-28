package exercice3;

public class PopulationException extends Exception {
	
	public PopulationException() 
	{
		super();
	}
	public String getMessage()
	{
		return "La population de la ville doit etre un nombre positif!";
	}  
	
}
