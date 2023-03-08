package e1;

import javax.swing.text.Position;
import java.util.*;

public class LogicsImpl implements Logics {
	
	private final Pair<Integer, Integer> pawn;
	private KnightPiece knight;
	private PositionStrategy positionStrategy;
	private final int size;
	 
    public LogicsImpl(int size, PositionStrategy strategy){
    	this.size = size;
		this.positionStrategy = strategy;
        this.pawn = this.positionStrategy.createPosition(size);
        this.knight = new KnightPiece(this.positionStrategy.createPosition(size));
    }

	public LogicsImpl(int size, KnightPiece initialKnightPos, Pair<Integer, Integer> initialPawnPos) {
		this.size = size;
		this.knight = initialKnightPos;
		this.pawn = initialPawnPos;
	}
    
	@Override
	public boolean hit(int row, int col) {
		this.knight.move(row, col, this.size);
		return this.pawn.equals(this.knight.getPos());
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.getPos().equals(new Pair<>(row,col));
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.equals(new Pair<>(row,col));
	}
}
