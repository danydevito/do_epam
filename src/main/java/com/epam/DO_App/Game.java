package com.epam.DO_App;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by daniel on 2017-05-22.
 */
public class Game implements GameAble{

    int x,y, queue, size;
    boolean end = false;
//    String[][] cells = new String[9][9];
    String message, player;
    Board board = new Board();
    CellsCheck cellsCheck = new CellsCheck();
    Player playerX = new Player();
    Player playerO = new Player();
    Main main = new Main();

    public Game(String choice, int size) throws IOException {


        ArrayList<String> list = cellsCheck.fillList(size);
        String[][] cells = new String[size][size];
        if (choice.equals("x"))queue=0;
        else if (choice.equals("o"))queue=1;

        cells = createArrays(cells,0, size);

        do {
            if (((queue%2==0)||(queue>1))&&(!isFull(cells,size))) {
                board.drawBoard(cells, playerX.message1,size);
                translator(board.cell(size,list));
                cells[x][y] = "X";
                end = playerX.isWin(cells,size, "X");
                queue++;
                if (end) ending("X");
            }
            if ((!end)&&(!isFull(cells,size))) {
                board.drawBoard(cells, playerO.message2,size);
                translator(board.cell(size,list));
                    cells[x][y] = "O";
                end = playerO.isWin(cells,size, "O");
                if (end)ending("O");
            }
            queue++;
            if ((queue>9)&&(!end)){
                System.out.println("Remis!");
            }
            if (end){
                message = "Zwycięstwo odniósł gracz "+player+"!";
                board.drawBoard(cells,message,size);
            }
        }while (((!end) && (queue<(size*size+1))));
    }

    public void translator(String answer){
        answer = answer.toLowerCase();
        String fields1 = "abcdefghi";
        String fields2 = "123456789";
        char coord1 = answer.charAt(0);
        char coord2 = answer.charAt(1);
        y = fields1.indexOf(coord1);
        x = fields2.indexOf(coord2);
    }
    public void ending(String player){
        System.out.println("Wygrałeś!");
        if (player.equals("X"))playerX.score++;
        else playerO.score++;
        this.player=player;
    }
    String[][]  createArrays(String[][] array, int fill, int size){
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (fill==0){
                array[i][j] = " ";}
                else array[i][j] = i+" "+j;
            }
        }
        return array;
    }
    public boolean isFull(String[][] array, int size){
        boolean flag=true;
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (array[i][j].equals(" ")){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
    public int getScoreX(){
        return playerX.score;
    }
    public int getScoreO(){
        return playerO.score;
    }
}
