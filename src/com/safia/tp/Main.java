package com.safia.tp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        char mode =' ';
        char reponse= ' ';
        double aConvertir=0;
        double convertit=0;
        String str1=new String("Convetisseur de degrés celcius et de degrés fahrenheit");

        System.out.println("                                                 ");
        System.out.println(str1.toUpperCase());
        System.out.println("-------------------------------------------------\n");


        do { //Boucle principale
            do {
                System.out.println("Choisissez le mode de convertion:\n");
                System.out.println("1-Convertisseur Celsius-Fahrenheit");
                System.out.println("2-Convertisseur Fahrenheit-Celsius");
                mode=sc.nextLine().charAt(0);

                if (mode != '1' && mode !='2') {
                    System.out.println("Mode inconnus, veuillez choisir entre le mode 1 et le mode 2.");
                }
            } while (mode !='1' && mode !='2');

                System.out.println("Température à convertir :");
                aConvertir = sc.nextDouble();

                sc.nextLine();

                //Mode de conversion
            if(mode == '1'){//Celcius to Fahrenheit
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.println(aConvertir + " °C correspond à : "+ convertit+ " °F.\n");
            }
            else{//Fahrenheit to Celcius
                convertit = ((aConvertir - 32) * 5) / 9;
                System.out.println(aConvertir + " °F correspond à : "+ convertit + " °C.\n");
            }
                do {
                    System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
                    reponse =sc.nextLine().charAt(0);


                } while (reponse !='O' && reponse !='N');

        }while(reponse == 'O' );

        System.out.println("Au revoir !");
    }//FIn du programme

}
