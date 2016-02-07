import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.validateMockitoUsage;

/**
 * Created by kanke on 07/02/2016.
 */


@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {

    String playerType = "Human v Computer";

    @After
    public void validate() {
        validateMockitoUsage();
    }

    @Before
    public void setup() {

    }


    @Test
    public void shouldReturnPlayerType() {
        Player mockPlayer = new Player();

        mockPlayer.setPlayerType(playerType);

        assertEquals(mockPlayer.getPlayerType(), this.playerType);
        assertTrue(mockPlayer.getPlayerType() == this.playerType);

    }

    @Test
    public void shouldNotReturnPlayerType() {
        Player mockPlayer = new Player();

        mockPlayer.setPlayerType("falsePlayerType");

        assertNotSame(mockPlayer.getPlayerType(), this.playerType);
        assertFalse(mockPlayer.getPlayerType() == this.playerType);

    }
}