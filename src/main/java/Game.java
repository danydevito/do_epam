/**
 * Created by daniel on 2017-05-22.
 */
public class Game {

    int x,y;
    int playerNo;
    boolean end = false;
    String[][] cells = new String[3][3];
    Board board = new Board();
    Player playerX = new Player();
    Player playerO = new Player();

    public Game(){

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                cells[i][j] = " ";
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                playerX.fields[i][j] = i+" "+j;
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                playerO.fields[i][j] = i+" "+j;
            }
        }

        do {
            playerNo = 1;
            board.drawBoard(cells, playerX.message1, playerO.message2);
            translator(board.cell());
            playerX.fields[x][y] = new String("X");
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    System.out.print(playerX.fields[i][j]);
                }
                System.out.println();
            }
            end = playerX.isWin(playerX.fields);
            cells[x][y] = "X";
            playerNo--;
            board.drawBoard(cells, playerX.message2, playerO.message1);
            translator(board.cell());
            playerO.fields[x][y] = new String("O");
            end = playerO.isWin(playerO.fields);
            cells[x][y] = "O";

        }while (!end);



    }

    void translator(String answer){
        if (answer.equals("A1")){x=0; y=0;}
        else if (answer.equals("A2")){x=1; y=0;}
        else if (answer.equals("A3")){x=2; y=0;}
        else if (answer.equals("B1")){x=0; y=1;}
        else if (answer.equals("B2")){x=1; y=1;}
        else if (answer.equals("B3")){x=2; y=1;}
        else if (answer.equals("C1")){x=0; y=2;}
        else if (answer.equals("C2")){x=1; y=2;}
        else if (answer.equals("C3")){x=2; y=2;}
        else System.out.println("zle");
    }


}
