public class Imenik extends Datoteka {
  private static final int METADATA = 256;

  private Datoteka[] datoteke;


  public Imenik(String ime, Datoteka[] datoteke) {
    super(ime);
    this.datoteke = datoteke;
  }
  
  @Override
  public int velikost() {
    int sumSize = 0;
    for (Datoteka file : this.datoteke) {
      sumSize += file.velikost();
    }
    return sumSize;
  }

  @Override
  public String opis() {
    return String.format("i %d",this.datoteke.length);
  }

  public int steviloVecjihSlik(int prag) {
    if(file instanceof SlikovnaDatoteka) {
      SlikovnaDatoteka image = (SlikovnaDatoteka)file;
      if(file.jeVelikaVsaj(prag)) {
        stSlik++;
      }
    }
  }

  private String poisci(String pot, String ime) {
    for(Datoteka file : this.datoteke) {
      String fileName = file.getIme();
      String candidatePath = String.format("s /%s", pot, ime);
      if(fileName.equals(ime)) {
        return candidatePath;
      }
    }
    if (file instanceof Imenik) {
      Imenik imenik = (imenik) file;
      return file.poisci(candidatePath, ime);
    }
  } 

  public String poisci(String ime) {
    //ce se stvar nahaja v korenu, vrnemo ./zabava.bmp

    return poisci(".",ime);
  }
}
