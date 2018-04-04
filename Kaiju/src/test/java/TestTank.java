import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTank {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Godzilla", 300, 50);
        tank = new Tank("Tank", 100, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, tank.getHealth());
    }

}
