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
        System.out.println("-------------------------------------------------");
        System.out.println("                                                 ");

        do { //Boucle principale
            do {
                System.out.println("Choisissez le mode de convertion");
                System.out.println("1-Convertisseur Celsius-Fahrenheit");
                System.out.println("2-Convertisseur Fahrenheit-Celsius");
                mode=sc.nextLine().charAt(0);

                if (mode != '1' && mode !='2') {
                    System.out.println("Mets 1 ou 2 frerr");
                }
            } while (mode !='1' && mode !='2');

                System.out.println("Température à convertir :");
                aConvertir = sc.nextDouble();

                sc.nextLine();


            if(mode == '1'){
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.print(aConvertir + " °C correspond à : ^"+ convertit+ " °F.");
            }
            else{
                convertit = ((aConvertir - 32) * 5) / 9;
                System.out.print(aConvertir + " °F correspond à : "+ convertit + " °C.");
            }
                do {
                    System.out.println("Souhaitez-vous convertir une autre température ? (O/N");
                    reponse =sc.nextLine().charAt(0);

                    if (reponse !='O' && reponse !='N');{
                        System.out.println("Veuillez bien répondre.");
                    }

                } while (reponse !='O' && reponse !='N');


        }while(reponse == 'O' );

        System.out.println("Bye.");
    }

        public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
        }
}
