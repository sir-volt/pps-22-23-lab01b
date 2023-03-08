package e2Test;

import e2.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class LogicsTest {

    private Logics logics;
    private static final int SIZE = 7;
    private static final int MINES = 9;
    private static final Pair<Integer, Integer> TEST_MINE_POS = new Pair<>(0, 0);

    private MineGeneratorStrategy mineStrategy = new RandomMineStrategy();
    private Set<Pair<Integer, Integer>> mines = new HashSet<>();

    @BeforeEach
    void setUp() {
        this.mines.addAll(this.mineStrategy.createMines(SIZE, MINES));
        this.mines.add(TEST_MINE_POS);
        this.logics = new LogicsImpl(SIZE, this.mines);
    }

    @Test
    void gameOverTest() {
        assertTrue(this.logics.mineHit(TEST_MINE_POS));
    }
}
