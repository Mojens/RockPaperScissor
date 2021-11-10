import java.util.Random;
public class Computer implements Player {

  public Enum takeTurn() {
    int rand = (int) (Math.random() * 3);
    //Convert the random number to a string using conditionals and print the opponent's move
    String opponentMove = "";
    if (rand == 0) {
      return Choice.STEN;
    } else if (rand == 1) {
      return Choice.PAPIR;
    } else
      return Choice.SAKS;
  }
  }





