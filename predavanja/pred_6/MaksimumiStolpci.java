import java.util.Arrays;

public class MaksimumiStolpci {

  public static int[] indeksiMaksimumovStolpcev(int[][] t) {
    int stStolpcev = t[0].length;
    int[] iMax = new int[stStolpcev];
    //predpostavka t.length > 0
    //vse vrste imajo enako stevilo elementov
    //v tem primeru je smiselno govoriti o stolpcih
    for(int i = 0; i < stStolpcev; i++) {
      for (int j = 0; j < t.length;j++) {

      }
    }
  }
  public static void main(String[] args) {
    int[][] rezultati = {
      {60,50,10,50,10},
      {20,40,80,20,40},
      {70,40,70,60,50},
      {30,20,30,90,40}
    };

    int[] iMax = indeksiMaksimumovStolpcev(rezultati);
    System.out.println((Arrays.toString(iMax)));

  }
}
