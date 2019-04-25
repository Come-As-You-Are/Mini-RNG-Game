
public class Fighting {
	public static void startFight(Fighters C, Fighters D) throws InterruptedException{
		while(true){
			//starts game for both sides until Game over is reached
			if(getFightResult(C, D).equals("Game Over")){
				System.out.println("Game Over");
				break;
			}
			if(getFightResult(D, C ).equals("Game Over")){
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	
	
	
	public static String getFightResult(Fighters A, Fighters B) throws InterruptedException{
		int attack4A = A.attackDmg();
		//define the variable attack level dmg amount for Warrior A
		int block4B = B.blockDmg();
		//in a fight, player B will be tanking the damage
		
		
		int dmg2B = attack4A - block4B;
		//sets the total damage as damage - block 
		if(dmg2B > 0){
			B.health = B.health - dmg2B;
			//if the damage inflicted is actually more than 0,
			//decrease B's total health
		} else dmg2B = 0;
		
		System.out.printf("%s Attacks %s and deals " + 
		"%d Damage\n", A.getName(), B.getName(), dmg2B );
		//%s substitute string values, $d for integer values
		
		System.out.printf("%s has %d amount of health left.\n\n", B.getName(), B.health);
		//displays how much health the second object in method has
		Thread.sleep(2000);
		//pause output for 2000 milliseconds so it looks better
		
		//check if total object health on either side falls below 0
		//if so, return game over message
		if(B.health <= 0){
			System.out.printf("%s has perished and %s is "
					+ "Victorious!\n", B.getName(), A.getName());
			
			return "Game Over";
		} else return "Fighting Again";
	}

}
