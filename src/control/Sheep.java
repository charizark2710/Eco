package control;
import java.util.*;

public class Sheep extends Animal{
	public static double lOSS_ENERGY=0.01;
	public Sheep(double energy, int speed, World world1, int Row, int Column){
		this.energy=energy;
		this.speed = speed;
		this.world1 = world1;
		this.CurrentRow=Row;
		this.CurrentColumn=Column;
		this.rd= new Random();
		this.iMale = rd.nextBoolean();
	
	}
	public Object move(Object o) {
		CurrentRow += rd.nextInt(2*speed+1)-speed;
		CurrentColumn += rd.nextInt(2*speed+1)-speed;
		if(CurrentRow >= world1.nRow) {
			CurrentRow -= world1.nRow;
		}
		if(CurrentRow<0) {
			CurrentRow +=world1.nRow;
		}
		if(CurrentColumn>=world1.nColumn) {
			CurrentColumn-=world1.nColumn;
		}
		if(CurrentColumn<0) {
			CurrentColumn +=world1.nColumn;
		}
		energy-=lOSS_ENERGY*speed;
		return null;
	}
	public void run() {
		while(true) {
			move(new Object());
			try {Thread.sleep(World.TIME_STEP);}
					catch(Exception e) {
						e.printStackTrace();
					}
		}
	}
}
