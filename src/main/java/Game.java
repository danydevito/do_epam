import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by daniel on 2017-05-22.
 */
public class Game {

    int x,y, scoreX, scoreY;
    int playerNo, queue=0;
    boolean end = false;
    String[][] cells = new String[3][3];
    String message;
    Board board = new Board();
    Player playerX = new Player();
    Player playerO = new Player();


    public Game(String choice) throws IOException {

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
            if (queue<9) {
                playerNo = 1;
                board.drawBoard(cells, playerX.message1);
                translator(board.cell());
                playerX.fields[x][y] = new String("X");
                playerO.fields[x][y] = new String("X");
                cells[x][y] = "X";
                end = playerX.isWin(playerX.fields);
                queue++;
                if (end) scoreX++;
            }
            if ((!end)&&(queue<9)) {
                playerNo--;
                board.drawBoard(cells, playerX.message2);
                translator(board.cell());
                    playerO.fields[x][y] = new String("O");
                    playerX.fields[x][y] = new String("O");
                    cells[x][y] = "O";
                end = playerO.isWin(playerO.fields);
                if (end) scoreY++;
            }
            queue++;
            if ((queue>9)&&(!end)){
                System.out.println("Remis!");
            }
            else{
                if (playerNo==1) message = "Zwycięstwo odniósł gracz X!";
                else message = "Zwycięstwo odniósł gracz Y!";
            }
            board.drawBoard(cells,message);

        }while (((!end) && (queue<10)));





    }

    void translator(String answer){
        answer = answer.toLowerCase();
        if (answer.equals("a1")){x=0; y=0;}
        else if (answer.equals("a2")){x=1; y=0;}
        else if (answer.equals("a3")){x=2; y=0;}
        else if (answer.equals("b1")){x=0; y=1;}
        else if (answer.equals("b2")){x=1; y=1;}
        else if (answer.equals("b3")){x=2; y=1;}
        else if (answer.equals("c1")){x=0; y=2;}
        else if (answer.equals("c2")){x=1; y=2;}
        else if (answer.equals("c3")){x=2; y=2;}
        else System.out.println("zla wspolrzedna");
    }

    int getScoreX(){
        return scoreX;
    }
    int getScoreY(){
        return scoreY;
    }


}
