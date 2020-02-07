package terrain;

import java.util.Random;

public class Frog extends Enemy
{
	private boolean frogLegsDropped=false;
	public Frog() {
		this.hp=2;
	}
	public void death() {
		System.out.println("The frog croaked his last time");
		itemDrop();
		
	}
	private void itemDrop() 
	{
		Random rand=new Random();
		if(rand.nextDouble()<0.4)
		{
			System.out.println("Its legs are still intact. You harvest its legs."
					+ "hint: frog legs increase movement speed (in combat)!");
			frogLegsDropped=true;
		}
	}
	
	public boolean isFrogLegsDropped() {
		return frogLegsDropped;
	}

	
}
