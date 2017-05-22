import java.util.Scanner;

/**
 * Created by daniel on 2017-05-22.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        System.out.println("Kółko krzyżyk");
        System.out.println();
        while (choice != 2){

            System.out.println("MENU");
            System.out.println("___Nowa gra___ (1)");
            System.out.println("___Zakończ____ (2)");
            System.out.println("Wybierz opcję i zatwierdz klikając ENTER: ");
            choice = scanner.nextInt();

            if (choice==1){
                Game game = new Game();
            }else if (choice==2){
                System.out.println("Koniec.");
            }else {
                System.out.println("Niewłaściwa opcja! Spróbuj ponownie");
            }
        }
    }
}
