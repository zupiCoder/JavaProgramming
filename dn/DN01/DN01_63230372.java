import java.util.Scanner;

public class DN01_63230372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// kvadrat s poljubno stranico n
		int st_kvadratkov = 0;
		for (int velikost_stranice = 1; a > velikost_stranice && b > velikost_stranice; velikost_stranice++) { 
			st_kvadratkov += (b - velikost_stranice) * (a - velikost_stranice);
		}
		System.out.println(st_kvadratkov);
	}
}

