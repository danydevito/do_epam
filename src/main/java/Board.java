import java.util.Scanner;

/**
 * Created by daniel on 2017-05-22.
 */
public class Board {

    Scanner scanner = new Scanner(System.in);

    public void drawBoard(String[][] cells, String message1, String message2 ){
        System.out.println("Zaczyna gracz X");
        System.out.println();
        System.out.println("     A   B   C");
        System.out.println("    --- --- --- ");
        System.out.println(" 1 | "+cells[0][0]+" | "+cells[0][1]+" | "+cells[0][2]+" |");
        System.out.println("    --- --- ---");
        System.out.println(" 2 | "+cells[1][0]+" | "+cells[1][1]+" | "+cells[1][2]+" |");
        System.out.println("    --- --- ---");
        System.out.println(" 3 | "+cells[2][0]+" | "+cells[2][1]+" | "+cells[2][2]+" |");
        System.out.println("    --- --- ---");
        System.out.println();
        System.out.println("Player X: "+message1);
        System.out.println("Player O: "+message2);
    }
    String cell(){
        String answer = scanner.nextLine();
        return answer;
    }
}
