package e1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomPositionStrategy implements PositionStrategy{

    private Random random = new Random();
    private Set<Pair<Integer, Integer>> previousPos = new HashSet<>();

    @Override
    public Pair<Integer, Integer> createPosition(int size) {
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(size),this.random.nextInt(size));
        // the recursive call below prevents clash avoiding immediate repetition
        if(!this.previousPos.isEmpty() && this.previousPos.contains(pos)) {
            return createPosition(size);
        }
        this.previousPos.add(pos);
        return pos;
    }
}
