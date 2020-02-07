package terrain;

public class Player {
	private int x;
	private int y;
	private int hp;
	private int damage;
	private int speed=1;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}




	public void damage(Enemy enemy)
	{
		enemy.setHp(enemy.getHp()-this.damage);
		this.hp=this.hp-enemy.getDamage();
		if(this.hp<1)
		{
			cleanUp();
		}
		
		if(enemy.hp<1)//if froge is kil
		{
			enemy.death();
			System.out.println("You took: "+enemy.damage+" damage from the enemy");
		}
		
	}
	
	
	
	
	private void cleanUp() {
		this.x=0;
		this.y=0;
		this.hp=100;
		this.damage=20;
		
	}




	public Player(int x,int y)
	{
		
		this.x=x;
		this.y=y;
		this.damage=20;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	
	public void north() {
		this.y +=1;
	}
	public void south() {
		this.y -=1;
	}
	
	public void east() {
		this.x+=1;
	}
	public void west() {
		this.x-=1;
	}

}
