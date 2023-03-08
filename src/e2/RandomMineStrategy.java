package e2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomMineStrategy implements MineGeneratorStrategy{

    private Random random = new Random();
    private Set<Pair<Integer, Integer>> mines = new HashSet<>();

    @Override
    public Set<Pair<Integer, Integer>> createMines(int size, int tot_mines) {
        while(this.mines.size() < tot_mines) {
            this.mines.add(new Pair<>(random.nextInt(size), random.nextInt(size)));
        }
        return this.mines;
    }
}
