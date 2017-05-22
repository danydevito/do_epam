import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by daniel on 2017-05-22.
 */
public class Main {

    public int scoreX=0, scoreY=0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = "n";

        System.out.println("Kółko krzyżyk");
        System.out.println();
        while (choice!="q"){

            System.out.println("MENU");
            System.out.println("___Nowa gra___ (n)");
            System.out.println("___Zakończ____ (q)");
            System.out.println("Wybierz opcję i zatwierdz klikając ENTER: ");
                try {
                    choice = br.readLine();
                }catch (IOException e) {
                    System.out.println("Niewłaściwa opcja");
                }

            if (choice.equals("n")){
                Game game = new Game();
            }else if (choice.equals("q")){
                System.out.println("Koniec.");
            }
        }
    }
}
