import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGodzilla {

    Godzilla godzilla;
    Tank tank;

    @Before
    public void before() {
        godzilla = new Godzilla("Mecha Godzilla", 500, 100);
        tank = new Tank("Tank", 110, 15);

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

    @Test
    public void canRoar() {
        assertEquals("Roar!", godzilla.roar());
    }

    @Test
    public void canMove() {
        assertEquals("Godzillas feet damages everything in the area", godzilla.move());
    }

    @Test
    public void canAttackVehicle(){
        godzilla.attackVehicle(tank);
        assertEquals(10, tank.getHealth());
    }

}
