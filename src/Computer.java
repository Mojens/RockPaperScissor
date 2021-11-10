public class Computer implements Player {

  public Enum takeTurn() {
    int rand = (int) (Math.random() * 3);
    if (rand == 0) {
      return Choice.STEN;
    } else if (rand == 1) {
      return Choice.PAPIR;
    } else
      return Choice.SAKS;
  }
  }





