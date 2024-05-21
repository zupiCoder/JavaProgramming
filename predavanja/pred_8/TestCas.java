public class TestCas {
  
  public static void main(String[] args) {
    Cas kosilo = new Cas(12,30);
    Cas vecerja = new Cas(19,0);

    //Cas.pristejStatic(kosilo, 1, 50);
   
    kosilo.nastaviUro(18);
    //kosilo.pristej(1, 50); 
    //uporabimo metodo brez static samo void
    System.out.println(kosilo.ura);
  }
}
