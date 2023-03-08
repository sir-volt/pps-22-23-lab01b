package e1Test;

import e1.Pair;
import e1.PositionStrategy;
import e1.RandomPositionStrategy;
import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class PositionStrategyTest {

    private static final int SIZE = 5;
    private static final int NUM_ELEMENTS = 10;
    private PositionStrategy positionStrategy;
    private Set<Pair<Integer,Integer>> elements;

    @BeforeEach
    void setUp() {
        this.positionStrategy = new RandomPositionStrategy();
        this.elements = new HashSet<>();
    }

    @Test
    void randomPositionStrategyTest() {
        for(int i = 0; i < NUM_ELEMENTS; i++){
            this.elements.add(this.positionStrategy.createPosition(SIZE));
        }
        assertEquals(NUM_ELEMENTS, this.elements.size());
    }
}
