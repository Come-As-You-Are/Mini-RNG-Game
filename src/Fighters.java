
public class Fighters {
	//define fighter's attributes
	protected String name = "Fighter";
	public int health = 0;
	public int attack = 0;
	public int block = 0;
	
	//at runtime, subclasses can define if they can teleport or not
	//instance of interface
	
	
	public Fighters(String name, int health, int attack, int block){
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.block = block;
	}
	//model capabilities of such fighters
	public int attackDmg(){
		return 1 + (int)(Math.random() * (attack - 1) + 1);
	

}
	public int blockDmg(){
		return 1 + (int)(Math.random() * (attack - 1) + 1);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	//dynamically change teleport capability
}
