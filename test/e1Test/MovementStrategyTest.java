package e1Test;

import e1.KnightMovementStrategy;
import e1.MovementStrategy;
import e1.Pair;
import e1.RandomPositionStrategy;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MovementStrategyTest {

    private MovementStrategy movementStrategy;
    private Pair<Integer, Integer> startingPos;
    private int size;

    @BeforeEach
    void setUp() {
        this.movementStrategy = new KnightMovementStrategy();
        this.size = 5;
        this.startingPos = new Pair<>(0, 0);
    }

    @Test
    void moveKnightFail() {
        Pair<Integer, Integer> failPos = new Pair<>(3, 3);
        assertNotEquals(failPos, this.movementStrategy.moveIfPossible(this.startingPos, failPos, this.size));
    }

    @Test
    void moveKnightSucc() {
        Pair<Integer,Integer> correctPos = new Pair<>(1, 2);
        assertEquals(correctPos, this.movementStrategy.moveIfPossible(this.startingPos, correctPos, this.size));
    }
}
