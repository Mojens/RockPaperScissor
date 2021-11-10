public class Game {

  private int humanPoints = 0;
  private int computerPoints = 0;

  void displayResult() {
    System.out.println("RESULTAT:\nHuman: " + humanPoints + "\nComputer: " + computerPoints + "\n");
    if (humanPoints > computerPoints)
      System.out.println("SÅDAN MAN DU VANDT!!!! WUhuuuuu");
    else if (humanPoints < computerPoints)
      System.out.println("Desværre min ven.. Du tabte!");
    else
      System.out.println("Det blev uafgjort, " +
          "Start spillet igen for at spille igen");
  }

  private void givePoint(Choice humanChoice, Choice computerChoice) {
    if (humanChoice.toString().equals("STEN")) {
      if (computerChoice.toString().equals("PAPIR")) {
        System.out.println("Point til Computer");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("SAKS")) {
        System.out.println("Point to dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("STEN")){
        System.out.println("Computeren valgte også STEN!, Prøv igen!");
      }
    }else if (humanChoice.toString().equals("PAPIR")) {
      if (computerChoice.toString().equals("SAKS")) {
        System.out.println("Point til Computer");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("STEN")) {
        System.out.println("Point to dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("PAPIR")){
        System.out.println("Computeren valgte også PAPIR!, Prøv igen!");
      }
    }else if (humanChoice.toString().equals("SAKS")) {
      if (computerChoice.toString().equals("STEN")) {
        System.out.println("Point til Computer");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("PAPIR")) {
        System.out.println("Point to dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("SAKS")) {
        System.out.println("Computeren valgte også SAKS!, Prøv igen!");
      }
    }
    }

        void play () {
          System.out.println("Velkommen til Sten saks og papir spillet!");
          System.out.println("Du skriver enten Sten, Saks eller papir " +
              "og så vil computeren svare tilbage");
          Player human = new Human();
          Player computer = new Computer();

          do {
            Choice humanChoice = (Choice) human.takeTurn();
            Choice computerChoice = (Choice) computer.takeTurn();
            givePoint(humanChoice, computerChoice);
          } while (computerPoints < 3 && humanPoints < 3);
          displayResult();
        }

        public static void main (String[]args){
          new Game().play();
        }
      }
