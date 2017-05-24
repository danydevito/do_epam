import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by daniel on 2017-05-22.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int scoreX=0, scoreY=0;
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
                System.out.println("Kto zaczyna grę? (o/x)");
                choice = main.reading("o","x");
                Game game = new Game(choice);
                scoreX += game.getScoreX();
                scoreY += game.getScoreY();
                System.out.println("Aktualny wynik X-Y "+scoreX+" : "+scoreY);
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
                choice = br.readLine();
            }catch (IOException e){
                System.out.println("To nie jest dopuszczalna opcja!");
            }
            error++;
        }while (!(choice.equals(op1))&&!(choice.equals(op2)));
        return choice;
    }
}
