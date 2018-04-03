import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGodzilla {

    Godzilla godzilla;

    @Before
    public void before() {
        godzilla = new Godzilla("Mecha Godzilla", 500, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Mecha Godzilla", godzilla.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(500, godzilla.getHealthValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(100, godzilla.getAttackValue());
    }

}
