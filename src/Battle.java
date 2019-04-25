
public class Battle {

	public static void main(String[] args) throws InterruptedException {
		
		Fighters hero = new Fighters("Hero", 500, 50, 50);
		Fighters villian = new DodgeFighter("Villian", 500, 60, 40, .25);
		//feel free to change these values for more RNG
		Fighting.startFight(hero, villian);
		
		// TODO Auto-generated method stub

	}

}
