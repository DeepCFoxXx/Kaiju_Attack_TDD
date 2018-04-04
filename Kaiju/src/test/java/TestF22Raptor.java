import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestF22Raptor {

    Godzilla godzilla;
    F22Raptor f22Raptor;

    @Before
    public void before(){
        godzilla = new Godzilla("1999 Godzilla", 400, 50);
        f22Raptor = new F22Raptor("F22", 150, 10);
    }

    @Test
    public void hasName() {
        assertEquals("F22", f22Raptor.getType());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(150, f22Raptor.getHealth());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, f22Raptor.getAttackValue());
    }

}
