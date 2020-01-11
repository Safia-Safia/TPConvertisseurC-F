package com.safia.tp;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        char mode =' ';
        char reponse= ' ';
        double aConvertir=0;
        double convertit=0;
        boolean hasError=true;
        String str1=new String(
                "Convetisseur de degrés celcius et de degrés fahrenheit");

        System.out.println("                                                 ");
        System.out.println(str1.toUpperCase());
        System.out.println("-------------------------------------------------\n");


        do { //Boucle principale
            String question= "Choisissez le mode de convertion:\n"+"1-Convertisseur Celsius-Fahrenheit\n"+"2-Convertisseur Fahrenheit-Celsius";
            mode=askQuestion(question,'1','2');

            //Température à convertir
            String question2= "Température à convertir";
            aConvertir= askTemperature(question2,0);



            //Mode de conversion
            if(mode == '1'){//Celcius to Fahrenheit
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.println(aConvertir + " °C correspond à : "+ convertit+ " °F.\n");
            }
            else{//Fahrenheit to Celcius
                convertit = ((aConvertir - 32) * 5) / 9;
                System.out.println(aConvertir + " °F correspond à : "+ convertit + " °C.\n");
            }

            reponse=askQuestion("Souhaitez-vous convertir une autre température ? (O/N)", 'O', 'N');

        }while(reponse == 'O' );

        System.out.println("Au revoir !");
    }
    /*methode poser question
    variable repoonse, scanner, questions, reponse autorisée
     */
    public static char askQuestion (String question, char reponse1, char reponse2){
        Scanner sc =new Scanner(System.in);
        char reponseChoisie= ' ';
        do{
            System.out.println(question);
            try{
                reponseChoisie= sc.nextLine().charAt(0);
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Veuillez réessayer.");
            }

        }while(reponseChoisie!= reponse1 && reponseChoisie != reponse2);
        return reponseChoisie;
    }


    public static double askTemperature (String question2,double temperatureChoisie){
        Scanner sc=new Scanner(System.in);
        boolean hasError= true;

        do{
            System.out.println(question2);
            try {
                temperatureChoisie = sc.nextDouble();
                hasError=false;
            } catch (InputMismatchException e) {
                System.out.println("Erreur, veuillez uniquement saisir des chiffres.\n");
            }
            sc.nextLine();
        }while(hasError);
        hasError=true;
        return temperatureChoisie;
    }
}//fermeture main class