import java.util.Scanner;

public class Prastevila4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(2);
        for(int kandidat = 3; kandidat <= n; kandidat += 2) {
            //za vsako stevilo izracunamo st deljiteljev
            if(jePrastevilo(kandidat)){
                //kandidat ima natanko dva deljitelja, zato je prastevilo
                System.out.println(kandidat);
            }    
        }
    }

    //vrne true natanko v primeru, ko je dano stevilo prastevilo
    //stevilo mora biti liho
    public static boolean jePrastevilo(int stevilo) {
        int meja = (int) Math.round(Math.sqrt(stevilo));
        for(int d = 3; d <= meja; d += 2) {
            System.out.println("D je " + d);
            if (stevilo % d == 0){      //preverimo koliko deljiteljev ima stevilo i znotraj meje
                return false;
            } 
        }
        //vemo da je stevilo prastevilo, saj stevilo ni deljivo z nobenim od stevil med 3 in korenom
        return true;
    }
}


//produkt dveh stevil mora biti enak kandidatu, ce je eno od teh stevil vecje od korena kandidata to pomeni, da more biti
//drugo manjse od kandidata. Zato lahko preverjamo le stevila do korena kandidata, ce najdemo stevilo, ki ga deli, potem 
//vemo, da to ni prastevilo.