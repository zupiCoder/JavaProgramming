public class Inverz extends Zaporedje {

  private Zaporedje prvo;
  private Interval interval;


  public Inverz(Zaporedje prvo, Interval interval) {
    this.prvo = prvo;
    this.interval = interval;
  }
  @Override
  public Integer y(int x) {
    int zacetek = interval.vrniZacetek();
    int konec = interval.vrniKonec();
    for(int i = zacetek; i <= konec; i++) {
      Integer y = this.zaporedje.y(i);

      if(y != null && y == x) {
        return i;
      }
    }
    return null;
  }
}
