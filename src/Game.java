public class Game {

  private int humanPoints = 0;
  private int computerPoints = 0;

  void displayResult() {
    System.out.println("\n"+"--------------------------"+"\n"+"RESULTAT:\nHuman: " + humanPoints +
        "\nComputer: " + computerPoints + "\n"+"--------------------------");
    if (humanPoints > computerPoints)
      System.out.println("SÅDAN MAN DU VANDT!!!! WUhuuuuu \uD83D\uDE04 \uD83D\uDE04 \uD83D\uDE04");
    else if (humanPoints < computerPoints)
      System.out.println("Desværre min ven.. Du tabte!☹ ☹ ☹");
    else
      System.out.println("Det blev uafgjort \uD83E\uDD37 \uD83E\uDD37 \uD83E\uDD37, " +
          "Start spillet igen for at spille igen");
  }

  private void givePoint(Choice humanChoice, Choice computerChoice) { //Hvis Enum HumanChoice er sten....
    if (humanChoice.toString().equals("STEN")) { //.toString da det er en enums, string værdi vi skal bruge
      System.out.print("\uD83D\uDC8E VS "); //unicode for sten
      if (computerChoice.toString().equals("PAPIR")) {
        System.out.print("\uD83D\uDCC4"+"\n");//unicode for papir
        System.out.println("Point til Computer");
        computerPoints++; //Hvis computer vinder opgøret så er det ++ for computerpoints da den stiger med 1
        // Det samme gælder for humanPoints
      }
      else if (computerChoice.toString().equals("SAKS")) {
        System.out.print("✂️"+"\n");//Unicode for saks
        System.out.println("\n"+"Point til dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("STEN")){
        System.out.print("\uD83D\uDC8E"); //Unicode for sten
        System.out.println("Computeren valgte også STEN!, Prøv igen!");
      }
    }else if (humanChoice.toString().equals("PAPIR")) {
      System.out.print("\uD83D\uDCC4 VS "); //Unicode for papir
      if (computerChoice.toString().equals("SAKS")) {
        System.out.print("✂️"+"\n"); //Unicode for saks
        System.out.println("Point til Computer");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("STEN")) {
        System.out.print("\uD83D\uDC8E"+"\n"); //unicode for sten
        System.out.println("\n"+"Point to dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("PAPIR")){
        System.out.print("\uD83D\uDCC4"); //Unicode for papir
        System.out.println("Computeren valgte også PAPIR!, Prøv igen!");
      }
    }
    else if (humanChoice.toString().equals("SAKS")) {
      System.out.print("✂️ VS "); //Unicode for saks
      if (computerChoice.toString().equals("STEN")) {
        System.out.print("\uD83D\uDC8E"+"\n"); //Unicode for sten
        System.out.println("Point til Computer");
        computerPoints++;
      }
      else if (computerChoice.toString().equals("PAPIR")) {
        System.out.print("\uD83D\uDCC4"); //Unicode for papir
        System.out.println("\n"+"Point to dig");
        humanPoints++;
      }else if (computerChoice.toString().equals("SAKS")) {
        System.out.println("✂️"); //Unicode for SAKS
        System.out.println("Computeren valgte også SAKS!, Prøv igen!");
      }
    }
    }

        void play () {
          System.out.println("Velkommen til Sten saks og papir spillet!");
          System.out.println("Du skriver enten Sten, Saks eller papir " +
              "og så vil computeren svare tilbage");
          Player human = new Human(); //Her kalder vi på objekterne af human og computer
          // hvor interface er datatypen
          Player computer = new Computer();

          do {//vi bruger en do while for at køre programmet,
            Choice humanChoice = (Choice) human.takeTurn();
            Choice computerChoice = (Choice) computer.takeTurn(); //Her refferer vi så til vores takeTurn() metode
            // vi har lavet i computer og human
            givePoint(humanChoice, computerChoice);//Her kalder vi på metoden givePoint som uddeller point ud fra
            //Klassernes valg
          } while (computerPoints < 3 && humanPoints < 3); //Programmer skal køre så længe
          // computer points og humanpoints er under 3
          displayResult(); //Til sidst skal den printe resultat ud, samt sige hvem der vandt.
        }

        public static void main (String[]args){
          new Game().play();
        }
      }
