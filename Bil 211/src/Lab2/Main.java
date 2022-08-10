package Lab2;
public class Main {
	public static void main(String [] args ) {
		Human[] Humans = new Human[5];

		Humans[0] = new Archer(4, 8);  
		Humans[1] = new Archer(4, 4);	
		Humans[2] = new Axeman(1, 10);
		Humans[3] = new Brute(2, 5); 
		Humans[4] = new Spearman(4, 4);

		Human[] Humans2 = new Human[4];

		Humans2[0] = new Archer(5, 7);
		Humans2[1] = new Axeman(1, 10);
		Humans2[2] = new Spearman(4, 8);
		Humans2[3] = new Spearman(10, 1);

		System.out.println(Humans2[2]);

		Army army = new Army(Humans);
		Army army2 = new Army(Humans2);

		army.totalDamage();
		army.totalHealth(); 

		army2.totalDamage(); 
		army2.totalHealth();

		army2.addSoldier(new Brute(1, 3));
		army2.totalDamage(); 
		army2.totalHealth(); 

		army.addSoldier(new Spearman(5, 5)); 
		army.totalDamage(); 
		army.totalHealth(); 
		
		army.attack(army2);
		
		army.totalHealth(); 
		army2.totalHealth(); 

	}

	

}