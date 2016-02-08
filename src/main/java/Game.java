import java.util.Random;
import java.util.Scanner;

/**
 * Created by kanke on 06/02/2016.
 */
public class Game {

    String playerOptionName;

    protected String getComputerSelection() {

        int computerSelection = getRandomNumberInRange(1, 3);
        String computerSelectionName = "";
        Rock rock = new Rock();
        Paper paper = new Paper();
        Scissors scissors = new Scissors();

        switch (computerSelection) {
            case 1:
                rock.setName("Rock");
                computerSelectionName = rock.getName();
                break;
            case 2:
                paper.setName("Paper");
                computerSelectionName = paper.getName();
                break;
            case 3:
                scissors.setName("Scissors");
                computerSelectionName = scissors.getName();
                break;
        }
        return computerSelectionName;
    }


    protected String getGestureSelection() {

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Choose gesture:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");


        System.out.println("-------------------------------------------------------------------------------------------");


        Scanner scanner = new Scanner(System.in);

        int gestureSelection = scanner.nextInt();
        String gestureSelectionName = "";
        Rock rock = new Rock();
        Paper paper = new Paper();
        Scissors scissors = new Scissors();

        switch (gestureSelection) {
            case 1:
                rock.setName("Rock");
                gestureSelectionName = rock.getName();
                break;
            case 2:
                paper.setName("Paper");
                gestureSelectionName = paper.getName();
                break;
            case 3:
                scissors.setName("Scissors");
                gestureSelectionName = scissors.getName();
                break;
        }
        scanner.close();
        return gestureSelectionName;
    }


    protected void playGame() {
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
        scanner.close();

        printResults();

    }


    protected void printResults() {

        StringBuilder sb = new StringBuilder();
        String result = "";
        String[] playerSelection = playerSelection(playerOptionName);
        String player1Result = playerSelection[0];
        String player2Result = playerSelection[1];

        if (player1Result.equals(player2Result)) {
            result = "The result is a tie!";
        } else {
            if (player1Result.equals("Rock")) {
                if (player2Result.equals("Paper")) {
                    result = "Paper beats rock. Player2 Wins.";
                } else {
                    result = "Rock beats scissors. Player 1(You) Wins.";

                }
            } else {
                if (player1Result.equals("Paper")) {
                    if (player2Result.equals("Rock")) {
                        result = "Paper beats rock. Player 1(You) Wins.";
                    } else {
                        result = "Scissors beat paper. Player2 Wins.";
                    }

                }
                if (player1Result.equals("Scissors")) {
                    if (player2Result.equals("Rock")) {
                        result = "Rock beats scissors. Player2 Wins.";
                    } else {
                        result = "Scissors beat paper. Player 1(You) Wins.";
                    }

                }
            }
        }


        sb.append(System.getProperty("line.separator"));
        sb.append("You are playing:- " + playerOptionName);
        sb.append(System.getProperty("line.separator"));
        sb.append("Result is:::: " + result);

        System.out.println(sb.toString());

    }


    protected String[] playerSelection(String playerOptionName) {

        String resolveSelectionName = playerOptionName;

        String[] playerSelectionResults = new String[]{};

        switch (resolveSelectionName) {
            case "Human v Computer":
                playerSelectionResults = resolveSelection(getGestureSelection(), getComputerSelection());
                break;
            case "Human v Human":
                playerSelectionResults = resolveSelection(getGestureSelection(), getGestureSelection());
                break;
            case "Computer v Computer":
                playerSelectionResults = resolveSelection(getComputerSelection(), getComputerSelection());
                break;
        }

        return playerSelectionResults;
    }


    protected String[] resolveSelection(String player1, String player2) {

        String player1Selection = player1;

        String player2Selection = player2;

        String[] resolveSelectionResults = {player1Selection, player2Selection};

        return resolveSelectionResults;
    }


    protected void gameInstructions() {
        System.out.println("Welcome to the Rock Paper Scissors Game!");
        System.out.println("*******************************************************************************************");
        System.out.println("         ");
        System.out.println(":::INSTRUCTIONS BEGIN:::");

        System.out.println("         ");

        System.out.println("Choose your players and choose gestures below");

        System.out.println("         ");
        System.out.println(":::INSTRUCTIONS END:::");
        System.out.println("         ");
    }


    protected static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}
