package terrain;

import java.util.Random;

public class Runner {
	public static void main(String[] args)
	{
		
		Item i=new Item(10);//pass in how far you want the range of item
		Player p=new Player(0,0);//starting coordinates
		World w=new World(i,p);//pass in the player and item
		
	}
	
	
}
