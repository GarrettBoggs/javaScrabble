import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter your Scrabble word and we will give you what it's worth:");
    String inputWord = console.readLine().toLowerCase();

    Scrabble userWord = new Scrabble();
    userWord.calculateScore(inputWord);

    System.out.println("This word is worth: " + userWord.total + " points");


  }
}
