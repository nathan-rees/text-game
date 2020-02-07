package terrain;

import java.util.Random;
import java.util.Scanner;

public class World implements Level
{
	
	public World(Item thing,Player player) 
	{
		this.player=player;
		this.thing=thing;
		startUp();
		while(true)
		{
			turn();
			
		}
	}
	//private static World world=null;
	Item thing;
	Player player;
	
	
	public void intro() {
		System.out.println("You frantically rumage within your pocket, searching your ticket out of this murkey dungeon"
				+ " a wave of relief of hope and gratitude engulfs your body. Steve did not die in vein"
				+ "The magic, battlescarred compass dial twitched iracically between numbers. 'What does this stupid thing even do?"
				+ " You shake it up and down, as"
				+ "your patience slowly wears down. Still revealing none of its secrets to the way out of here,"
				+ " you find yourself lost; and the dark heavy fog wraps itself around"
				+ "you... ");
		System.out.println("a large thicc frog called gamatatsu emerges from floor and calls you silly and you realise the compass is showing the distance for something."
				+ " Its sheer repulsivness forces "
				+ "you to punch"
				+ " the frog in its plump belly. It just looks at you for and then tears well up in its eyes."
				+ " The well intentioned frog waddles away from you as fast as his chicken wing legs would allow him."
				+ " Just as he was dissapearing into the darkness, he falls over "
				+ ", scraping his slimy face against the corrosive floor.");
		System.out.println("You try not to laugh at this rather cute but pathetic little creature but you cannot help yourself :("
				+ "");
		System.out.println("he hears you and simply rolls away, trying his best to hide the pain.");
	}
	
	
	
	
	private void startUp()
	{
		intro();
		readDial();
		System.out.println("Enter where you would like to go");
		changeLocation();
	}
	
	
	
	public void changeLocation() 
	{
		
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		
		input=input.toUpperCase();
		if(input.equals("NORTH")||input.equals("N"))
		{
			player.north();
		}else if(input.equals("EAST")||input.equals("E"))
		{
			player.east();
		}else if(input.equals("SOUTH")||input.equals("S"))
		{
			player.south();
		}else if(input.equals("WEST")||input.equals("W"))
		{
			player.west();
		}else
		{
		System.out.println("Your legs start moving North because your brain did not decide");
		player.north();
		}
		
		
				
	}
	public void encounter()
	{
		Scanner scan =new Scanner(System.in);
		Random rand =new Random();
		if(rand.nextDouble()>0.65&&rand.nextDouble()<0.7)
		{
			System.out.println("Easter egg");
		}
		if(rand.nextDouble()<0.3) //when you encounter a frog
		{
			Frog enemy=new Frog();
			System.out.println("You are being attacked by a frog!");
			System.out.println("Attack? (y/n)");
			if(scan.hasNext("y")) {
				player.damage((Frog)enemy);
				
			}
			
			else {//if you try to run
				System.out.println("trying to run monkaS");
				if(enemy.speed<player.getSpeed())
				{
					System.out.println("Got away saftely!");
				}else
				{
					System.out.println("The frog jumps on your and force a fight");
					player.damage((Frog)enemy);
				}
			}
		}
	}
	
	public void turn() {
		readDial();//also checks if you win
		changeLocation();
		encounter();
		
	}
	public void cleanUp() {
		//toDO
		
	}
	public void readDial() {
		float distance=(float)hypotenuse(thing.getX()-player.getX(),thing.getY()-player.getY());//just passes in the difference in distance for item,player
		if(distance==0) //when you find it!!
		{
			System.out.println("The end well done Chris enjoy ur weekend :p");
			cleanUp();
		}else
		{
			
			System.out.println("The dial reads: "+distance);
		}

	}
	
	public double hypotenuse(int a, int b)
	{
		return Math.sqrt((a*a)+(b*b));
	}
	
	
	
//	public static World makeWorld()//:)
//	{
//		if(world!=null)
//		{
//			world=new World();
//			return world;
//		}else
//		{
//			return world;
//		}
//	}
//	public static World getWorld() {
//		return world;
//		
//	}
//	private World()
//	{
//		Random rand=new Random();
//		int n=rand.nextInt();
//		System.out.println(n);
//	}
	

}
