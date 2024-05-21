public class Oseba {

  private String ime;
  private String priimek;
  private char spol;
  private int letoRojstva;


  public void Oseba(String ime, String priimek, char spol, int letoRojstva) {
    this.ime = ime;
    this.priimek = priimek;
    this.spol = spol;
    this.letoRojstva = letoRojstva;
  }

  public String getIme() {
    return this.ime;
  }

  public String getPriimek() {
    return this.priimek;
  }

  public char getSpol() {
    return this.spol;
  }

  public int getLetoRojstva() {
    return this.letoRojstva;
  }

  public String toString() {
    return String.format("%S %S, %c, %d",this.ime, this.priimek, this.spol, this.letoRojstva);
  }
}
