import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJetJaguar {

    JetJaguar jetJaguar;

    @Before
    public void before() {
        jetJaguar = new JetJaguar("Jet Jaguar", 300, 70);
    }

    @Test
    public void hasName() {
        assertEquals("Jet Jaguar", jetJaguar.getName());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(300, jetJaguar.getHealthValue());
    }

}
