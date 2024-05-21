
public class Oseba {
  
  private String ime;
  private String priimek;
  private char spol;
  private int letoRojstva;
  private Oseba oce;
  private Oseba mati;
 

  public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
    this.ime = ime;
    this.prii mek = priimek;
    this.spol= spol;
    this.letoRojstva = letoRojstva;
    this.oce = oce;
    this.mati = mati;
  }

  public static Oseba  crea teOseba(Stri ng im e, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
   

  public Oseba(String ime, String priimek, char spol, int letoRojstva) {
    this(ime,priimek,spol,letoRojstva,null,null);
  }


  public String vrniIme() {
    return this.ime;
  }

  public void nastaviIme(String novoIme) {
    if (novoIme == null || novoIme.length() < 2) {
      return;
    }
    this.ime = novoIme;  
  }

  public String toString() {
    return  String.format("%s %s (%c) %d",this.ime, this,priimek, this.spol, this.letoRojstva);
  }

  public int starost(int leto) {
    return (leto - this.letoRojstva);
  }

  pu blic boolean jeStarejsaOd(Oseba os) {
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
    re turn null;
  }

  public String imeOceta() {
    if(this.oce == null) {
      return null;
    } else {
       return this.oce.ime;
    }
  } 


 

  public boolean jeSestraOd(Oseba os) {
    char spol = this.spol;
    char z = 'Z';
    return((jeBratAliSestraOd(os) && (spol == z)));
 
  }

 public boolean jeTetaOd(Oseba os) {
  return (os.oce != null && this.jeSestraOd(os.oce) || os.mati != null &&  this.jeSestraOd(os.mati));
 }

 public boolean jeOcetovskiPrednikOd(Oseba os) {
  Oseba p = os.oce;
  while(p != this && p != null) {
    p = p.oce;
  }
  return p == this;
  }
 //rekurzija
 public boolean jePrednikOd(Oseba os) {
  if(os == null) {
    return false;
  }
  if(os == this) {
    return true;
  }
  return jePrednikOd()
 }


}
