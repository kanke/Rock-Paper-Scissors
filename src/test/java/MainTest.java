//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.*;
//
///**
// * Created by kanke on 07/02/2016.
// */
//@RunWith(MockitoJUnitRunner.class)
//public class MainTest {
//
//    /*public static void main(String[] args) {
//
//        Game game = new Game();
//
//        game.gameInstructions();
//
//        game.playGame();
//
//    }
//    */
//
//
//    @Spy
//    @InjectMocks
//    Game game;
//
//    @Spy
//    @InjectMocks
//    Main main;
//
//    @After
//    public void validate() {
//        validateMockitoUsage();
//    }
//
//    @Before
//    public void setup() {
//
//
//
//    }
//
//    @Test
//    public void shouldCreateGame(){
//
//        Game mockGame = new Game();
//
//       // game.gameInstructions();
//
//        assertNotNull(mockGame);
//       // verify(game, atLeastOnce()).gameInstructions();
//    }
//
//    @Test
//    public void shouldGetGameInstructions(){
//
//        Game mockGame = Mockito.mock(Game.class);
//        Main mockMain = Mockito.mock(Main.class);
//
//        doNothing().when(mockGame).gameInstructions();
//        doNothing().when(mockGame).playGame();
//
//        mockMain.main(new String[] { "1", "1" });
//       // game.gameInstructions();
//
//       // Mockito.verify(launcher).run(new String[] { "test1", "test2" });
//        assertNotNull(mockGame);
//        verify(mockGame, atLeastOnce()).gameInstructions();
//        verify(mockGame, atLeastOnce()).playGame();
//    }
//
//
//}
