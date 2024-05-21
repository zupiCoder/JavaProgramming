public class Iskanje {
  public static int poisci(int[] t, int x) {
    for ( int i = 0; i < t.length; i++) {
      if (t[i] == x) {
        return i;
      }
    }
    return -1;
  }

  public static int poisci2(int[] t, int x) {
    int i = 0;
    while (i < t.length && t[i] < x) {
      i++;
    }
    return(i < t.length && t[i] == x) ? (i) : (-1);
  }
  
  public static int poisciDvojisko(int[] t, int x) {
    int lm = 0;
    int dm = t.length - 1;
    while (lm <= dm) {
      int s = (lm + dm) / 2; //indeks sredinskega elementa
      if (t[s] == x) {
        return s;
      }
      if (t[s] < x) {
        lm = s + 1; //levo polovico zavrzemo
      } else {
        dm = s - 1;
      }
    }
    return -1;
    //bistveno hitreje od drugega programa, pri vsakem koraku zmanjsamo za 2
  }
  public static void main(String[] args) {

    int[] t = {7,10,15,21,27,36,42,50,60};
    System.out.println(poisciDvojisko(t, 42));
    System.out.println(poisciDvojisko(t, 29));
  }
}
