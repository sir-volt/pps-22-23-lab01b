package e1Test;

import e1.Logics;

import e1.LogicsImpl;
import e1.Pair;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {

    private Logics logics;
    private final int size = 5;
    private final Pair<Integer, Integer> initialKnightPos = new Pair<>(3, 1);
    private final Pair<Integer, Integer> initialPawnPos = new Pair<>(size - 1, 3);

    @BeforeEach
    void beforeEach() {
        this.logics = new LogicsImpl(size, initialKnightPos, initialPawnPos);
    }

    @Test
    void testKnightFailMovement() {
        Pair<Integer, Integer> failTest = new Pair<>(0, 1);
        this.logics.hit(failTest.getX(), failTest.getY());
        assertFalse(this.logics.hasKnight(failTest.getX(), failTest.getY()));
        assertTrue(this.logics.hasKnight(this.initialKnightPos.getX(), this.initialKnightPos.getY()));
    }

    @Test
    void testSuccessKnightMovement() {
        Pair<Integer, Integer> succTest = new Pair<>(2, 3);
        this.logics.hit(succTest.getX(), succTest.getY());
        assertTrue(this.logics.hasKnight(succTest.getX(), succTest.getY()));
    }

    @Test
    void testPawnHit() {
        assertTrue(this.logics.hit(this.initialPawnPos.getX(), this.initialPawnPos.getY()));
    }
}
