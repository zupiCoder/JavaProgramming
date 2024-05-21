import java.util.*;

public class Ulomek {

  private int stevec;
  private int imenovalec;

  public Ulomek(int st, int im) {
    int mutual = gcd(st,im);
    st = st / mutual;
    im = im / mutual;

    this.stevec = st;
    this.imenovalec = im;
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
  }

  public int getImenovalec(){
    return this.imenovalec;
  }

  public int getStevec(){
    return this.stevec;
  }

  public Ulomek plus(Ulomek drugi) {
    int st = this.imenovalec * drugi.stevec + drugi.imenovalec * this.stevec;
    int im = this.imenovalec * drugi.imenovalec;

    return new Ulomek(st, im);
  }

  public Ulomek negacija() {
    int stevec = this.stevec;
    if(this.imenovalec * this.stevec > 0) {
      stevec = -1 * this.stevec;
    }﻿
    if(this.imenovalec * this.stevec < 0) {
      stevec = -1 * this.stevec;
    }

    return new Ulomek(stevec,this.imenovalec);
  }

  public Ulomek minus(Ulomek drugi) {
    Ulomek newUlomek = drugi.negacija();

    return this.plus(newUlomek);
  }
}


