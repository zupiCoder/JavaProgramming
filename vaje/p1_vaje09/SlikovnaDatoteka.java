public class SlikovnaDatoteka extends Datoteka {
  public static final int METADATA = 54;

  private int sirina;
  private int visina;

  public SlikovnaDatoteka(String ime, int sirina, int visina) {
    super(ime);
    this.sirina = sirina;
    this.visina = visina;
  }

  @Override
  public int velikost() {
    return 3 * this.sirina * this.visina + SlikovnaDatoteka.METADATA; 
  }

  public String opis() {
    return String.format("s %d x %d", this.sirina,this.visina);
  }

  public boolean jeVelikaVsaj(int size) {
    return (this.sirina >= size && this.visina >= size);
  }


}
