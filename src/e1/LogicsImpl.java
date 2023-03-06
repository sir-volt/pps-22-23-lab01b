package e1;

import javax.swing.text.Position;
import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer,Integer> pawn;
	private Pair<Integer,Integer> knight;
	private final PositionStrategy positionStrategy = new RandomPositionStrategy();
	private final int size;
	 
    public LogicsImpl(int size){
    	this.size = size;
        this.pawn = this.positionStrategy.createPosition(size);
        this.knight = this.positionStrategy.createPosition(size);
    }

	public LogicsImpl(int size, Pair<Integer, Integer> initialKnightPos, Pair<Integer, Integer> initialPawnPos) {
		this.size = size;
		this.knight = initialKnightPos;
		this.pawn = initialPawnPos;
	}
    
	@Override
	public boolean hit(int row, int col) {
		if (row<0 || col<0 || row >= this.size || col >= this.size) {
			throw new IndexOutOfBoundsException();
		}
		// Below a compact way to express allowed moves for the knight
		int x = row-this.knight.getX();
		int y = col-this.knight.getY();
		if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
			this.knight = new Pair<>(row,col);
			return this.pawn.equals(this.knight);
		}
		return false;
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
