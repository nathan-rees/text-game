package terrain;

import java.util.Random;

public class Item 
{
	private int x;
	private int y;
	public Item(int scale)//scale is a scale factor for the position of item 
	{
		Random rand=new Random();
		this.x=(int)((rand.nextDouble()+1)*scale);
		this.y=(int)((rand.nextDouble()+1)*scale);//positions
		
		
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
