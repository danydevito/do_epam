package com.epam.DO_App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by daniel on 2017-05-22.
 */
public class Board {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    CellsCheck cellsCheck = new CellsCheck();
    ArrayList<String> list = cellsCheck.fillList();

    public void drawBoard(String[][] cells, String message){
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
