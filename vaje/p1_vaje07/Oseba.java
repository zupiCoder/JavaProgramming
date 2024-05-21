public class Oseba {
  
  private String ime;
  private String priimek;
  private char spol;
  private int letoRojstva;
  private Oseba oce;
  private Oseba mati;

  //konstruktor, vraca naslov kjer je naredil objekt oseba
  public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
    this.ime = ime;
    this.priimek = priimek;
    this.spol= spol;
    this.letoRojstva = letoRojstva;
    this.oce = oce;
    this.mati = mati;
  }

  public Oseba(String ime, String priimek, char spol, int letoRojstva) {
    this(ime,priimek,spol,letoRojstva,null,null);
  }


  public String vrniIme(Oseba oseba) {
    return this.ime;
  }

  public void nastaviIme(String novoIme) {
    if (novoIme == null || novoIme.length() < 2) {
      return;
    }
    this.ime = novoIme;
  }

  @Override
  public String toString() {
    return String.format("%s %s (%c) %d",this.ime, this,priimek, this.spol, this.letoRojstva);
  }


  public int Starost(int leto) {
    return(leto - this.letoRojstva);
  }

  public boolean jeStarejsaOd(Oseba os) {
    return this.letoRojstva < os.letoRojstva;
  }

  //kar je staticnega se nahaja pri razredu Oseba
  public static Oseba starejsa(Oseba a, Oseba b) {
    if( a.jeStarejsaOd(b)) {
      return a;
    }
    if (b.jeStarejsaOd(a)) {
      return b;
    }
    return null;
  }

  public String imeOceta() {
    if(this.oce == null) {
      return null;
    } else {
      return this.oce.ime;
    }
  }

  //gledamo ce this.oce in os.oce kazeta na isti objekt, prav tako za mati
  public boolean jeBratAliSestraOd(Oseba os) {
    return((this.oce == os.oce) && (this.mati == os.mati));
  }


}

