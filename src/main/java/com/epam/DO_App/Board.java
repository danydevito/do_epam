package com.epam.DO_App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by daniel on 2017-05-22.
 */
public class Board {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    CellsCheck cellsCheck = new CellsCheck();
    ArrayList<String> list = cellsCheck.fillList();

    public void drawBoard(String[][] cells, String message, int size){
        String header = "      A   B   C   D   E   F   G   H   I";
        System.out.println(header.substring(1,(4*size+3)));
        System.out.print("   ");
        for (int k=0; k<size; k++){
            System.out.print(" ---");
        }
        System.out.println();
        for (int i=0; i<size; i++){
            System.out.print(" "+(i+1)+" |");
            for (int j=0; j<size; j++){
                System.out.print(" "+cells[i][j]+" |");
            }
            System.out.println();
            System.out.print("   ");
            for (int k=0; k<size; k++){
                System.out.print(" ---");
            }
            System.out.println();
        }
        System.out.println(message);
    }
    String cell() throws IOException {
        boolean flag;
        String answer;
        do {
            answer = br.readLine().toLowerCase();
            if (cellsCheck.checkListContain(list, answer)) {
                flag=true;
                cellsCheck.removeItem(answer);
            }
            else {
                System.out.println("Nie ma takiego pola lub jest już pełne! Podaj nową współrzędną:");
                flag=false;
            }
        }while (!flag);
        return answer;
    }
}
