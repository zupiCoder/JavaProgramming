public class Urejanje {
  public static void uredi(int[] t) {
    for (int i = 1; i < t.length; i++) {
      //vstavimo element t[i] v ze ustrezno mesto v podtabeli
      
      int trenutni = t[i];
      int j = i - 1;
      while (j >= 0 && t[j] > trenutni) {
        t[j + 1] = t[j];
        j--;
      }
      t[j + 1] = trenutni;
    }
  }
  public static void main(String[] args) {
    int[] tabela = {80,50,75,30,45,60,95,20};
    
  }
}
