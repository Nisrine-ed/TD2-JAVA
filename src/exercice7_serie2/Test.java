package exercice7_serie2;

public class Test {
	
	public static void main(String[] args) {
		 Article article1=new Article("Montre","Shein",8.50,24.03);
		 System.out.println(article1.toString());
		 System.out.println("                   ");
		 System.out.println("***********************************");
		 System.out.println("                   ");
		 Article article2=new Article("Robe","Shein",6.2,2.99);
		 System.out.println(article2.toString());
		 System.out.println("                   ");
		 System.out.println("***********************************");
		 System.out.println("                   ");
		 Article article3=new Article("Chemise","Shein",1.01,5.101);
		 System.out.println(article3.toString());
		 System.out.println("                   ");
		 System.out.println("                   ");  
		 System.out.println("                   ");  
		 ArticlesElectroménagers electro1=new ArticlesElectroménagers("Téléphone","HUAWEI",2000,2400,60,"AI54E");
		 System.out.println(electro1.toString());
		 System.out.println("                   ");
		 System.out.println("***********************************");
		 System.out.println("                   ");
	     ArticlesElectroménagers electro2=new ArticlesElectroménagers("Caméra","Amazon",500,1000,50,"ID75T");
	     System.out.println(electro2.toString());
	}
	

}
