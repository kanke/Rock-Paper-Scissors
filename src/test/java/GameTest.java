import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
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

   /* protected void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting game............Select?");


        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Choose players:");
        System.out.println("1. Human v Computer");
        System.out.println("2. Human v Human");
        System.out.println("3. Computer v Computer");


        System.out.println("-------------------------------------------------------------------------------------------");

        int playersSelection = scanner.nextInt();

        Player player = new Player();

        switch (playersSelection) {
            case 1:
                player.setPlayerType("Human v Computer");
                playerOptionName = player.getPlayerType();
                break;
            case 2:
                player.setPlayerType("Human v Human");
                playerOptionName = player.getPlayerType();

                break;
            case 3:
                player.setPlayerType("Computer v Computer");
                playerOptionName = player.getPlayerType();
                break;
        }

        printResults();

    }*/

    @Test
    public void shouldPlayGame() {

    }
}
