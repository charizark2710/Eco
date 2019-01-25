package control;
import java.util.*;
public class World {
	public int nRow;
	public int nColumn;
	private double[][] grass;
	int n;
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
	
	
}

