public class Cas2 {
  int ura;
  int minuta;

  public Cas(int h, int min) {
    this.ura = h;
    this.minuta = min;
  }
//metoda vrne nov objekt, ki predstavlja trenutek +h in + min
  public Cas plus(int h,int min) {
    int noviCas = 60 * (this.ura + h) + (this.minuta + min);
    noviCas = (noviCas % 1440 + 1440) % 1440;
    int novaUra = noviCas / 60;
    int novaMin = noviCas % 60;

    return new Cas(novaUra,novaMin);
  }
  public void izpisi() {
    System.out.printf("%d:%02d", this.ura, this.minuta);
  }

  public String toString() {
    return String.format("%d:%02d", this.ura, this.minuta);
  }


  public int razlikaMin(Cas drugi) {
    return 60 * (this.ura - drugi.ura) + (this.minuta - drugi.minuta);
  }

}

