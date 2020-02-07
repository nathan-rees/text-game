package terrain;

public abstract class Enemy 
{
	protected int speed=2;
	protected int hp=100;
	protected int damage=1;
	
	public void death() {
		System.out.println("well done it is dead!");
	}
	public void battleCry() {
		System.out.println("AHHHH");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
