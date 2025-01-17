package e1Test;

import e1.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {

    private Logics logics;
    private static final int SIZE = 5;
    private final Pair<Integer, Integer> initialKnightPos = new Pair<>(3, 1);
    private final Pair<Integer, Integer> initialPawnPos = new Pair<>(SIZE - 1, 3);

    @BeforeEach
    void beforeEach() {
        this.logics = new LogicsImpl(SIZE, new KnightPiece(initialKnightPos), initialPawnPos);
    }

    @Test
    void knightFailMovementTest() {
        Pair<Integer, Integer> failTest = new Pair<>(0, 1);
        this.logics.hit(failTest.getX(), failTest.getY());
        assertFalse(this.logics.hasKnight(failTest.getX(), failTest.getY()));
        assertTrue(this.logics.hasKnight(this.initialKnightPos.getX(), this.initialKnightPos.getY()));
    }

    @Test
    void successKnightMovementTest() {
        Pair<Integer, Integer> succTest = new Pair<>(2, 3);
        this.logics.hit(succTest.getX(), succTest.getY());
        assertTrue(this.logics.hasKnight(succTest.getX(), succTest.getY()));
    }

    @Test
    void pawnHitTest() {
        assertTrue(this.logics.hit(this.initialPawnPos.getX(), this.initialPawnPos.getY()));
    }
}
