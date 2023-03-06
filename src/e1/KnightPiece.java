package e1;

public class KnightPiece {

    private Pair<Integer, Integer> pos;
    private MovementStrategy movementStrategy;

    public KnightPiece(Pair<Integer, Integer> pos) {
        this.pos = pos;
        this.movementStrategy = new KnightMovementStrategy();
    }

    public void move(int row, int col, int size) {
        this.movementStrategy.moveIfPossible(pos, new Pair<>(row, col), size);
    }
}
