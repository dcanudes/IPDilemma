package cat.udl.ipdilemma;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefectAlwaysStrategyTest {

    DefectAlwaysStrategy defectStrategy;

    @Before
    public void initialize() {
        defectStrategy = new DefectAlwaysStrategy();
    }

    /**
     * Basic Test: Testing if strategy will be able to betray its partner once.
     */
    @Test
    public void testGetNextActionOnce() {
        assertEquals(PlayerAction.DEFECTION, defectStrategy.getNextAction());
    }

    /**
     * Basic Test: Testing if strategy will be able to betray its partner twice.
     */
    @Test
    public void testGetNextActionMoreThanOnce() {
        PlayerAction pa = defectStrategy.getNextAction();
        pa = defectStrategy.getNextAction();
        assertEquals(PlayerAction.DEFECTION, pa);
    }

    /**
     * Basic Test: Testing if our strategy will be able to give us a copy of itself.
     */
    @Test
    public void testCopy() {
        assertEquals(defectStrategy, defectStrategy.copy());
    }
}
