package com.epam.DO_App;

/**
 * Created by daniel on 2017-05-22.
 */
public class Player {

        int score;
//        String[][] fields = new String[size][size];
        String message1 = "Gracz X, podaj współrzędne pola (gracz O czeka na swój ruch)";
        String message2 = "Gracz O, podaj współrzędne pola (gracz X czeka na swój ruch)";

    boolean isWin(String[][] winning,int size, String sign) {
        String row=" ", chain;
        boolean flag=false;
        switch (size){
            case 3: row=sign+sign+sign;
            break;
            case 4: row=sign+sign+sign+sign;
            break;
            case 5: row=sign+sign+sign+sign;
            break;
            case 6: row=sign+sign+sign+sign;
            break;
            case 7: row=sign+sign+sign+sign;
            break;
            case 8: row=sign+sign+sign+sign+sign;
            break;
            case 9: row=sign+sign+sign+sign+sign;
            break;
        }
        for (int i=0; i<size; i++){
            chain = " ";
            for (int j=0; j<size; j++){
                chain += winning[i][j];
                if (chain.contains(row)) flag=true;
            }
        }
        for (int i=0; i<size; i++){
            chain = " ";
            for (int j=0; j<size; j++){
                chain += winning[j][i];
                if (chain.contains(row)) flag=true;
            }
        }
        return flag;
    }
}



