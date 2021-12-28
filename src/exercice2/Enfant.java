package exercice2;

public class Enfant{
		
		protected int age;

		public final int getAge()
		{
			return age;
		}
		public Enfant (int age) throws AgeEnfantException
		{
			if (age >= 1 && age <= 10)
			{
				this.age = age;
			}
			else
			{
				throw new AgeEnfantException(age + " ans n'est pas un age valide !");
			} 
		}


		public Enfant()
		{}
		
		public String toString()
		{
			return " Age: " + age;
		}

}