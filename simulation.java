package exercice0;

import java.util.Scanner;

public class simulation {
    public static void main(String[] args) {
        int i = 1;

        while(i<10)
        {
           
            Scanner scan = new Scanner(System.in);
            System.out.println("votre name: ");
            String name = scan.nextLine();
            System.out.println("votre prenom: ");
            String lastname = scan.nextLine();

            System.out.println("Bonjour "+ name + " "+ lastname);
            System.out.println("combien d'heures de travail?");
            int nbrHours = Integer.parseInt(scan.nextLine());
            // si le nbr hour entre 60h et 40h par semain
            float tarif = 0;
            if(nbrHours < 40)
            {
                System.out.println("votre taux horaire: ");
                float rate = Float.parseFloat(scan.nextLine());
                tarif = rate * nbrHours;

                System.out.println("votre compensation est "+ tarif +" MAD");
            }
            else if(nbrHours<= 60 && nbrHours >= 40)
            {
                System.out.println("We want to ask you for your hourly rate: ");
                float rate = Float.parseFloat(scan.nextLine());
                tarif = rate * nbrHours;
                double tarifExtra = (((nbrHours-40)*(rate))*0.5) + tarif ;
                System.out.println("votre compensation est "+ tarifExtra +" MAD");
            }
            else //Over 60h
                System.out.println("mauvaise information!");
            System.out.println("Réessayer" );
            i = Integer.parseInt(scan.nextLine());
        }

    }
}