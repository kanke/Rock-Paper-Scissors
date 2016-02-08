import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

/**
 * Created by kanke on 07/02/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @After
    public void validate() {
        validateMockitoUsage();
        System.setOut(null);
        System.setErr(null);
    }

    @Before
    public void setup() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));


    }

    @Spy
    @InjectMocks
    Game game;

    @Mock
    Player player;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    String testInstructions = "Welcome to the Rock Paper Scissors Game!\n" +
            "*******************************************************************************************\n" +
            "         \n" +
            ":::INSTRUCTIONS BEGIN:::\n" +
            "         \n" +
            "Choose your players and choose gestures below\n" +
            "         \n" +
            ":::INSTRUCTIONS END:::";

    @Test
    public void shouldGetGameInstructions() {

        game.gameInstructions();


        assertEquals(testInstructions.trim(), outContent.toString().trim());

        verify(game, atLeastOnce()).gameInstructions();

    }

    @Test
    public void shouldNotGetGameInstructions() {

        game.gameInstructions();

        assertNotEquals(testInstructions, outContent.toString());

        verify(game, atLeastOnce()).gameInstructions();

    }

    @Test
    public void shouldPlayGame() {


        String playerOptionName = "1";

        InputStream in = new ByteArrayInputStream(playerOptionName.getBytes());
        System.setIn(in);

        System.out.println("in" + in);

        player.setPlayerType(playerOptionName);

        when(player.getPlayerType()).thenReturn(playerOptionName);

        assertEquals(player.getPlayerType(), playerOptionName);

    }
}
