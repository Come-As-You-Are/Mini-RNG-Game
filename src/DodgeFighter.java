import java.util.Random;

public class DodgeFighter extends Fighters{
	double dodgePercent;
	
	Random rand = new Random();
	//import random variable
	
	public DodgeFighter(String name, int health, int attack, int block, double dodgePercent){
		super(name, health, attack, block);
		this.dodgePercent = dodgePercent;
		
		
		
		
	}
	
	public int blockDmg(){
		double chance = rand.nextDouble();
		if(chance <= dodgePercent){
			System.out.printf("%s has dodged the attack!\n\n",
					this.getName());
			return 1000000;
			//return a high value to ensure block damage exceeds damage dealt
		}
		else{
			return 1 + (int)(Math.random() * (attack - 1) + 1);
			//else stick to the default condition
		}
		
	}

}
