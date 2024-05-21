public class Vsota extends Zaporedje {

  private Zaporedje prvo;
  private Zaporedje drugo;

  @Override
  public Integer y(int x) {
    if(this.prvo.y(x) == null || this.drugo.y(x) == null) {
      return null;
    }
    return this.prvo.y(x) + this.drugo.y(x);
  }

  public Vsota(Zaporedje prvo, Zaporedje drugo) {
    //sestej y od this, interval povezi z zaporedjem
    //sestej parameter interval in sestej
    this.prvo = prvo;
    this.drugo = drugo;
   
  }
  
  
}
