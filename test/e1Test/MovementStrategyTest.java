package e1Test;

import e1.KnightMovementStrategy;
import e1.MovementStrategy;
import e1.Pair;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MovementStrategyTest {

    private MovementStrategy movementStrategy;
    private Pair<Integer, Integer> startingPos;
    private static final int SIZE = 5;

    @BeforeEach
    void setUp() {
        this.movementStrategy = new KnightMovementStrategy();
        this.startingPos = new Pair<>(0, 0);
    }

    @Test
    void moveKnightFailTest() {
        Pair<Integer, Integer> failPos = new Pair<>(3, 3);
        assertNotEquals(failPos, this.movementStrategy.moveIfPossible(this.startingPos, failPos, this.SIZE));
    }

    @Test
    void moveKnightSuccTest() {
        Pair<Integer,Integer> correctPos = new Pair<>(1, 2);
        assertEquals(correctPos, this.movementStrategy.moveIfPossible(this.startingPos, correctPos, this.SIZE));
    }
}
