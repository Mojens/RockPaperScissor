public class Computer implements Player {

  public Enum takeTurn() {
    int rand = (int) (Math.random() * 3); //Siger at rand er et tal random tal mellem 0-2
    if (rand == 0) { //Hvis 0 så skal den return ENum STEN
      return Choice.STEN;
    } else if (rand == 1) {
      return Choice.PAPIR;
    } else
      return Choice.SAKS;
  }
  }





