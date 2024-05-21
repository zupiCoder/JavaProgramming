import java.util.Scanner;

public class Izstevanka {
  public static String[] izstej(String[]t, int numOfWords) {
    String[] new_t = new String[t.length - 1];
    String izstevani = t[numOfWords % t.length - 1];
    for(int i = 0; i < t.length - 1; i++) {
      t[i] = t[i + 1];
    }
    t[t.length - 1] = izstevani;
    return new_t;
  }

  public static String izstevanec(String[]t, int numOfWords) {
    return t[t.length - 1];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numOfKids = sc.nextInt();
    int numOfWords = sc.nextInt();
    String[] t = new String[numOfKids];

    for(int i = 0; i < numOfKids;i++) {
      t[i] = sc.next();
    }
    
    while(t.length > 1) {
      System.out.println(izstevanec(t, numOfWords));
      t = izstej(t, numOfWords);
      numOfWords--;
    }


  }
}
