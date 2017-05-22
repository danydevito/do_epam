/**
 * Created by daniel on 2017-05-22.
 */
public class Player {

    String [][] fields = new String[3][3];
    String message1 = "(Podaj współrzędne pola)";
    String message2 = "(Czekaj na swoj ruch)";

    boolean isWin(String[][] winning){
        if (winning[0][0].equals(winning[0][1]) && winning[0][0].equals(winning[0][2])) {
            System.out.println("Wygrałeś!")
            ;return true;}
        else if (winning[1][0].equals(winning[1][1]) && winning[1][0].equals(winning[1][2])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[2][0].equals(winning[2][1]) && winning[2][0].equals(winning[2][2])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[0][0].equals(winning[1][0]) && winning[0][0].equals(winning[2][0])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[0][1].equals(winning[1][1]) && winning[0][1].equals(winning[2][1])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[0][2].equals(winning[1][2]) && winning[0][2].equals(winning[2][2])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[0][0].equals(winning[1][1]) && winning[0][0].equals(winning[2][2])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else if (winning[0][2].equals(winning[1][1]) && winning[0][2].equals(winning[2][0])) {
            System.out.println("Wygrałeś");
            return true;
        }
        else return false;
    }
}
