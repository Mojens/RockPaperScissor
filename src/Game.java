public class Game {

  private int humanPoints = 0;
  private int computerPoints = 0;

  void displayResult() {
    System.out.println("RESULT:\nHuman: " + humanPoints + "\nComputer: " + computerPoints + "\n");
    if (humanPoints > computerPoints)
      System.out.println("SÅDAN MAN DU VANDT!!!! WUhuuuuu");
    else if (humanPoints<computerPoints)
      System.out.println("Desværre min ven.. Du tabte!");
    else
      System.out.println("Det blev uafgjort");
  }

  private void givePoint(Choice humanChoice, Choice computerChoice) {
    if (humanChoice.toString().equals("STEN")) {
      if (computerChoice.toString().equals("PAPIR")) {
        System.out.println("Point til COMPUTER");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("SAKS")) {
        System.out.println("Point til Dig");
        humanPoints++;
      }
    } else if (humanChoice.toString().equals("PAPIR")) {
      if (computerChoice.toString().equals("SAKS")) {
        System.out.println("Point til COMPUTER");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("STEN")) {
        System.out.println("Point til Dig");
        humanPoints++;
      }
    } else { // humanChoice == SCISSORS
      if (computerChoice.toString().equals("STEN")) {
        System.out.println("Point til COMPUTER");
        computerPoints++;
      } else if (computerChoice.toString().equals("PAPIR")) {
        System.out.println("Point til Dig");
        humanPoints++;
      }
    }
  }

  void play() {
    Player human = new Human();
    Player computer = new Computer();

    do {
      Choice humanChoice = (Choice) human.takeTurn();
      Choice computerChoice = (Choice) computer.takeTurn();
      givePoint(humanChoice, computerChoice);
    } while (computerPoints < 3 && humanPoints < 3);
    displayResult();
  }

  public static void main(String[] args) {
    new Game().play();
  }
}

