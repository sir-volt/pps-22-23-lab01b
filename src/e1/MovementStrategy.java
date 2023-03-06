package e1;

public interface MovementStrategy {

    Pair<Integer, Integer> moveIfPossible(Pair<Integer, Integer> pos, Pair<Integer, Integer> newPos, int size);

}
