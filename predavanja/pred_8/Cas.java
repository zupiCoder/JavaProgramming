public class Cas {
  int ura;
  int minuta;

  public Cas(int h, int min) {
    this.ura = h;
    this.minuta = min;
  }
  //posebna metoda, ki nima izhoda
  public static void pristejStatic(Cas cas, int h, int min) {
    //objektu na katerega kaze kazalec cas
    //objektu cas pristeje h ur min minut
    int noviCas = 60 *(cas.ura + h) + (cas.minuta + min);
    noviCas = (noviCas % 1440 + 1440) % 1440;
    cas.ura = noviCas / 60;
    cas.minuta = noviCas % 60;
  }

  public void pristej(int h, int min) {
    int noviCas = 60 *(this.ura + h) + (this.minuta + min);
    noviCas = (noviCas % 1440 + 1440) % 1440;
    this.ura = noviCas / 60;
    this.minuta = noviCas % 60;
  }
//nastavi atribut uro objekta, na katerega kaze this
  // public void nastaviUro(int h) {
  //   this.ura = h;
  // }

  //public static int vrniuroStatic(Cas cas), okej obstaja boljsa alternativa

  //ne potrebujemo parametra zaradi this.
  public int ura() {
    return this.ura;
  }

  public int minuta() {
    return this.minuta;
  }
}
