package e2;

import java.util.HashSet;
import java.util.Set;

public class LogicsImpl implements Logics {

    private int size;
    private Set<Pair<Integer,Integer>> mines = new HashSet<>();
    private MineGeneratorStrategy mineStrategy;


    public LogicsImpl(int size, int mines) {
        this.size = size;
        this.mineStrategy = new RandomMineStrategy();
        this.mines.addAll(this.mineStrategy.createMines(size, mines));
    }

    public LogicsImpl(int size, Set<Pair<Integer, Integer>> mines) {
        this.size = size;
        this.mines.addAll(mines);
    }

    @Override
    public boolean mineHit(Pair<Integer, Integer> pos) {
        return this.mines.contains(pos);
    }
}
