
public class Sprehod {
  public static void izpisi(int[] t) {
    for (int i = 0; i < t.length;i++) {
      System.out.println(t[i]);
    }

  }
  public static int indeksMax(int[] t) {
    int iMax= 0;
    for (int i = 1; i < t.length;i++) {
      if (t[i] > t[iMax]) {
        iMax = i;
      }
    }
    return iMax;
  }
  public static void izpisi2(int[] t) {
    for (int element : t) {
      System.out.println(element);
    }
  }
  public static void main(String[] args) {
    int[] t = {10,20,30,40,50};
    izpisi(t);
    System.out.println(indeksMax(t));
    izpisi2(t);
  }
}