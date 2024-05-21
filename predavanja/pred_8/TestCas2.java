public class TestCas2 {
  public static void main(String[] args) {
    Cas kosilo = new Cas(12,30);
    Cas vecerja = new Cas(19, 0);
    izpisi();

    System.out.println(vecerja.razlikaMin(kosilo));
  }
}
