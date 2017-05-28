package com.epam.DO_App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by daniel on 2017-05-22.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int scoreX=0, scoreO=0;
        String choice="";
        Main main = new Main();

        System.out.println("Kółko krzyżyk");
        System.out.println();
        while (!(choice.equals("q"))){

            System.out.println("MENU");
            System.out.println("___Nowa gra___ (n)");
            System.out.println("___Zakończ____ (q)");
            System.out.println("Wybierz opcję i zatwierdz klikając ENTER: ");
            choice = main.reading("n","q");
            if (choice.equals("n")){
                System.out.println();
                System.out.println("Podaj wymiar planszy (3-9)");
                int size = main.readingSize();
                System.out.println("Kto zaczyna grę? (o/x)");
                choice = main.reading("o","x");
                Game game = new Game(choice, size);
                scoreX += game.getScoreX();
                scoreO += game.getScoreO();
                System.out.println("Aktualny wynik X-O "+scoreX+" : "+scoreO);
            }else if (choice.equals("q")){
                System.out.println("Koniec.");
            }
        }
    }

    String reading(String op1, String op2) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        int error=0;
        do{
            if (error>0) System.out.println("Niewłaściwa opcja. Spróbuj ponownie.");
            try {
                choice = br.readLine().toLowerCase();
            }catch (IOException e){
                System.out.println("To nie jest dopuszczalna opcja!");
            }
            error++;
        }while (!(choice.equals(op1))&&!(choice.equals(op2)));
        return choice;
    }
    int readingSize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        int error=0;
        do{
            if (error>0) System.out.println("Podana wartość musi być liczbą z zakresu (3-9)! Spróbuj ponownie.");
            try {
                choice = Integer.parseInt(br.readLine());
            }catch (NumberFormatException e){
                System.out.println("To nie jest liczba!");
            }
            error++;
        }while (!((choice>2)&&(choice<10)));
        return choice;
    }
}
