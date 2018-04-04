import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBuilding {

    Godzilla godzilla;
    Building skyScraper;

    @Before
    public void before() {
        godzilla = new Godzilla("Space Godzilla", 800, 200);
        skyScraper = new Building(1000);
    }

    @Test
    public void hasIntegrity() {
        assertEquals(1000, skyScraper.getIntegrity());
    }


}
