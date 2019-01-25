package control;
import java.util.*;

public class Sheep extends Animal{
	Sheep(double energy, int speed, World world1, int CurrentRow, int CurrentColumn){
		this.energy=energy;
		this.speed = speed;
		this.world1 = world1;
		this.CurrentRow=CurrentRow;
		this.CurrentColumn=CurrentColumn;
		this.rd= new Random();
		iMale = rd.nextBoolean();
	}
	public Object move(Object o) {
		int x;
		CurrentRow +=x = rd.nextInt(2*speed+1)-speed;
		CurrentColumn +=x = rd.nextInt(2*speed+1)-speed;
		if(CurrentRow >= world1.nRow) {
			CurrentRow=0;
		}
		if(CurrentColumn>=world1.nColumn) {
			CurrentColumn=0;
		}
		return null;
	}
}
