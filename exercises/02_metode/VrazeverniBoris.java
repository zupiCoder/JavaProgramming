import java.util.Scanner;
import java.util.Random;

public class VrazeverniBoris {
  
  //random kocka
  public static int met(Random rand) {
    return rand.nextInt(6) + 1;
  }

  public static char isItSunday(int day) {
    if(day % 7 == 0) {
      return 'N';
    } else {
      return 'D';
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
    int n = sc.nextInt();
    int numOfOdd = 0;
    int met = 0;
    int numOfmet = 0;
    Random rand = new Random(s);

    for(int height = 0; height < n; height++) {
      System.out.printf("%2d (%c): ", height + 1,isItSunday(height + 1));
      while(numOfOdd < 3) {
        met = met(rand);
        numOfmet++;
        if(met % 2 != 0) {
          numOfOdd++;
        }
        System.out.printf("%d ",met);
      }
      numOfOdd = 0;
      System.out.printf("[%d]",numOfmet);
      System.out.println();
      numOfmet = 0;
    }
    
  }
}
