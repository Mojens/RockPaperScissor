import java.util.Scanner;

public class Human implements Player {
  @Override
  public Enum takeTurn() {
    Scanner input = new Scanner(System.in); //Scanner objekt
    String playerInput = input.nextLine(); // String playerInput som benytter sig af Scanner

    if (playerInput.equalsIgnoreCase("Sten")) {//Hvis input er sten om det er skrevet med stort eller småt
      // Så skal den return Enum værdi Sten
      return Choice.STEN;
    } else if (playerInput.equalsIgnoreCase("Papir")) {
      return Choice.PAPIR;
    } else
      return Choice.SAKS;
  }
}
