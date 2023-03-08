package e2;

import java.util.Set;

public interface MineGeneratorStrategy {

    public Set<Pair<Integer,Integer>> createMines(int size, int mines);
}
