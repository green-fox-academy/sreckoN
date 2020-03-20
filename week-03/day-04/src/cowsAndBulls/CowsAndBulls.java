package cowsAndBulls;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class CowsAndBulls {

  private int numberToGuess;
  private int countGuesses;

  public CowsAndBulls() {
    this.numberToGuess = (int) ((Math.random() * 9999) + 1);
    this.countGuesses = 0;
  }

  public String guess(int guess) {
    if (guess == numberToGuess) {
      return "4 cows";
    }
    StringBuilder guessString = new StringBuilder(guess);
    StringBuilder numberToGuessString = new StringBuilder(numberToGuess);

    int cows = 0;
    int bulls = 0;

    for (int i = 0; i < guessString.length(); i++) {

      
    }
    return makeCowBullString(cows, bulls);
  }

  private String makeCowBullString(int cows, int bulls) {
    String result = "";

    if (cows == 1) {
      result += "1 cow, ";
    } else {
      result += cows + " cows, ";
    }

    if (bulls == 1) {
      result += "1 bull";
    } else {
      result += bulls + " bulls";
    }

    return result;
  }

  public static void main(String[] args) {
    CowsAndBulls c = new CowsAndBulls();

    System.out.println("***" + c.numberToGuess + "***");
    System.out.println(c.guess(1263));
    System.out.println(c.guess(5980));
  }
}
