package e1;

public class KnightMovementStrategy implements MovementStrategy{


    @Override
    public Pair<Integer, Integer> moveIfPossible(Pair<Integer, Integer> pos, Pair<Integer, Integer> newPos, int size) {
        int newPosRow = newPos.getX();
        int newPosCol = newPos.getY();

        if (newPosRow < 0 || newPosCol < 0 || newPosRow >= size || newPosCol >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Below a compact way to express allowed moves for the knight
        int x = newPosRow - pos.getX();
        int y = newPosCol - pos.getY();
        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
            return newPos;
        }
        return pos;
    }
}
