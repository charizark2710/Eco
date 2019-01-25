package control;
import java.util.*;
public class World extends Thread{
	public int nRow;
	public int nColumn;
	private double[][] grass;
	private double grassGrowingSpeed = 0.1;
	public static int TIME_STEP=1000;
	World(int x, int y){
		nRow = x;
		nColumn = y;
		Random rd = new Random();
		grass = new double[x][y];
		for(int i = 0; i < x; i++) {
			for(int j =0; j<y; j++) {
				grass[i][j]=rd.nextDouble();
			}
		}
	}
	public double getGrass(int i, int j){
		return grass[i][j];
	}


	public void run() {
		while (true) {
			grow();
			try {Thread.sleep(World.TIME_STEP);}
					catch(Exception e) {
						e.printStackTrace();
					}
		}
	}
	
	private void grow() {
			Random rd = new Random();
			for(int i=0;i<nRow;i++) {
				for(int j=0; j<nColumn; j++) {
					double x = rd.nextDouble()*grassGrowingSpeed;
					grass[i][j] += x;
					grass[i][j] = (grass[i][j]>1) ? 1 : grass[i][j]  ;
					
				}
			}
	}

}

