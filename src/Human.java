import java.util.Scanner;

public class Human implements Player{
  @Override
  public Enum takeTurn() {
    Scanner input = new Scanner(System.in);
    String playerInput = input.nextLine();

    if (playerInput.equalsIgnoreCase("Sten")){
      return Choice.STEN;
    }else if (playerInput.equalsIgnoreCase("Papir")){
      return Choice.PAPIR;
    }else
      return Choice.SAKS;
  }
}
