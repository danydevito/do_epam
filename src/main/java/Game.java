/**
 * Created by daniel on 2017-05-22.
 */
public class Game {

    int x,y, scoreX, scoreY;
    int playerNo;
    boolean end = false;
    String[][] cells = new String[3][3];
    String message, score;
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
//            for (int i=0; i<3; i++){
//                for (int j=0; j<3; j++){
//                    System.out.print(playerX.fields[i][j]);
//                }
//                System.out.println();
//            }
            end = playerX.isWin(playerX.fields);
            if (end) scoreX++;
            cells[x][y] = "X";
            if (!end) {
                playerNo--;
                board.drawBoard(cells, playerX.message2, playerO.message1);
                translator(board.cell());
                playerO.fields[x][y] = new String("O");
                end = playerO.isWin(playerO.fields);
                if (end) scoreY++;
                cells[x][y] = "O";
            }

        }while (!end);

        if (playerNo==1) message = "Zwycięstwo odniósł gracz X!";
        else message = "Zwycięztwo odniósł gracz Y!";
        score = "Aktualny wynik   "+scoreX+" : "+scoreY;
        board.winBoard(cells,message,score);



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
        else System.out.println("zle");
    }


}
