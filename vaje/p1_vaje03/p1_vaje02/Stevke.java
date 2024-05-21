import java.util.Scanner;

public class Stevke{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long stevilo = sc.nextLong();

        while(stevilo > 0){
            int stevka = (int)(stevilo % 10); //z modulom deset dobimo ostanek pri deljenju z 10
            System.out.println(stevka);
            stevilo = stevilo / 10; //stevilo za eno skrajsamo

        }
    }
}

// int more bit na obeh straneh, da program deluje

//uporabimo zanko while, saj nimamo tocno definirano, kolikokrat se mora zanka izvesti, 
//drugace uporabimo for loop