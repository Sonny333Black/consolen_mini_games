package SpieleImZug;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sonny on 25.01.2017.
 */
public class Mastermind {
    public Mastermind (int von,int bis){
        System.out.println("Raten sie die Zahl!!!");
        rate(gibRandomInt(von,bis));

    }

    protected int gibRandomInt(int von,int bis){
        Random rn = new Random();
        //random.nextInt(max - min + 1) + min
        int randomNumber = rn.nextInt(bis - von +1 ) + von;
        return randomNumber;
    }

    protected void rate(int zahl){
        Scanner scan = new Scanner(System.in);
        int myZahl = 0;
        int count = 0;
        while(myZahl!=zahl){
            System.out.println("Bitte geben Sie eine Vermutung ein (int)");
            myZahl = scan.nextInt();
            checkZahl(myZahl,zahl);
            count++;
        }
        scan.close();
        System.out.println("Zahl gefunden sie ist: "+myZahl + " mit "+count+ " Versuchen.");
    }

    private void checkZahl(int myZahl,int zahl) {
        if (myZahl < zahl){
            System.out.println("Zahl muss GRÖßER sein");
        }
        if (myZahl > zahl){
            System.out.println("Zahl muss Kleiner sein");
        }
    }
}
