public class Cas {

  private int ura; 
  private int minuta;

  public Cas(int h, int min) {
    this.ura = h;
    this.minuta = min;
  }

  public static void pristej1(Cas cas,int h, int m) {
    int newCas = h * 60 + m + cas.ura * 60 + cas.minuta;
    newCas = (newCas % 1440 + 1440) % 1440;

    cas.ura = newCas / 60;
    cas.minuta = newCas % 60;
  }

  public void pristej2(int h, int m) {
    int newCas = 60 * (this.ura + h) + this.minuta + m;
    newCas = (newCas % 1440 + 1440) % 1440;

    this.ura = newCas / 60;
    this.minuta = newCas % 60;
  }

  public Cas pristej3(int h, int m){
    int newCas = 60 * (this.ura + h) + this.minuta + m;
    newCas = (newCas % 1440 + 1440) % 1440;

    return new Cas(newCas /60, newCas % 60);
  }

  public int getHour() {
    return this.ura;
  }

  public int getMin() {
    return this.minuta;
  }

  public void setHour(int h) {
    this.ura = h;
  }

  public void setMinutes(int m) {
    this.minuta = m;
  }

  public void izpisi() {
    System.out.printf("%d:%02d", this.ura, this.minuta); 
  }

  public String toString() {
    return String.format("%d:%02d", this.ura, this.minuta);
  }

  public boolean jeEnakKot(Cas drugi) {
    return this.ura == drugi.ura && this.minuta == drugi.minuta;
    //ce se je v this skopiral enak kazalec kot je kazalec ki kaze na objekt drugi 
    //potem boolean vrne true else vrne false
  }

  public int casovnaRazlika(Cas drugi) {
    return (this.ura - drugi.ura) * 60 + this.minuta - drugi.minuta;
  }

  
}


