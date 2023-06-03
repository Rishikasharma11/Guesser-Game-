import java.util.Scanner;

class Player
{
    int numGuess;
    public void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player, guess the number");
        numGuess=sc.nextInt();
       
    }
   
}

class Guesser
{
    int numGuess;
    public void guessNumber() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hey Guesser, guess the number");
      numGuess=sc.nextInt();
     
    }
    
}

class Umpire
{
    Guesser guesser;
    Player p1,p2,p3;
    public void getNumberFromGuesser() {
         guesser = new Guesser();
         guesser.guessNumber();
    }

    public void collectFromplayers() {
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();
         p1.guessNumber();
         p2.guessNumber();
         p3.guessNumber();
    }

    public void calcResult() {
        System.out.println(guesser.numGuess+ " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        if(guesser.numGuess==p1.numGuess)
        {
            if(guesser.numGuess==p2.numGuess && guesser.numGuess==p3.numGuess)
            System.out.println("Game tied all three players guessed correctly");
            else if(guesser.numGuess==p2.numGuess)
            System.out.println("Player 1 and Player2 won the game");
            else if(guesser.numGuess==p3.numGuess)
            System.out.println("Player 1 and Player3 won the game");
            else 
            System.out.println("Player 1 won the game");
        }
        else if(guesser.numGuess==p2.numGuess)
        {
            if(guesser.numGuess==p2.numGuess && guesser.numGuess==p3.numGuess)
            System.out.println("Player 2 and Player3 won the game");
            else if(guesser.numGuess==p3.numGuess)
            System.out.println("Player 3 won the game");
            else
            System.out.println("Player 2 won the game");
        }
        else if(guesser.numGuess==p3.numGuess)
        System.out.println("Player 3 won the game");
        else
        System.out.println("Game lost! try again");
    } 
}

public class LaunchGame {

    public static void main(String[] args) {

        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromplayers();
        umpire.calcResult();    
    } 
}
