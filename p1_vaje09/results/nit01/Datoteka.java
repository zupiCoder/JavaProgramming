public abstract class Datoteka {

  private String ime;

  public Datoteka(String ime) {
    this.ime = ime;
  } 

  public String getIme() {
    return this.ime;
  }

  public abstract int velikost ();

  public abstract String opis();
    
  @Override
  public String toString() {
    return String.format("%s [%s]", this.ime, opis());

  }
}
