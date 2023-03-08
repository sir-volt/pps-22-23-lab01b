package e2Test;

import e2.MineGeneratorStrategy;
import e2.RandomMineStrategy;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MineGenerationTest {

    private MineGeneratorStrategy strategy;
    private static final int SIZE = 7;
    private static final int NUM_MINES = 9;

    @BeforeEach
    void setUp() {
        this.strategy = new RandomMineStrategy();
    }

    @Test
    void randomMinesTest() {
        assertEquals(NUM_MINES, this.strategy.createMines(SIZE, NUM_MINES).size());
    }
}
