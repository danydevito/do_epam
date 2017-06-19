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
        int blank=0;
        switch (size){
            case 3: {
                row=sign+sign+sign;
                blank=2;
            }
            break;
            case 4: {
                blank=3;
                row=sign+sign+sign+sign;
            }
            break;
            case 5: {
                blank=3;
                row=sign+sign+sign+sign;
            }
            break;
            case 6: {
                blank=3;
                row=sign+sign+sign+sign;
            }
            break;
            case 7: {
                blank=3;
                row=sign+sign+sign+sign;
            }
            break;
            case 8: {
                blank=4;
                row=sign+sign+sign+sign+sign;
            }
            break;
            case 9: {
                blank=4;
                row=sign+sign+sign+sign+sign;
            }
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
        for (int i=0; i<size-blank; i++) {
            for (int j = blank; j < size; j++) {
                if (winning[i][j].equals(sign)) {
                    if (winning[i][j].equals(winning[i + 1][j - 1])) {
                        if (winning[i + 1][j - 1].equals(winning[i + 2][j - 2])) {
                            if (blank==2) flag = true;
                            else if (winning[i+2][j-2].equals(winning[i+3][j-3])){
                                if (blank==3){
                                    flag=true;
                                }
                                else if (winning[i+3][j-3].equals(winning[i+4][j-4])){
                                    if (blank==4) flag=true;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i=0; i<size-blank; i++) {
            for (int j = 0; j < size-blank; j++) {
                if (winning[i][j].equals(sign)) {
                    if (winning[i][j].equals(winning[i + 1][j + 1])) {
                        if (winning[i + 1][j + 1].equals(winning[i + 2][j + 2])) {
                            if (blank==2) flag = true;
                            else if (winning[i+2][j+2].equals(winning[i+3][j+3])){
                                if (blank==3){
                                    flag=true;
                                }
                                else if (winning[i+3][j+3].equals(winning[i+4][j+4])){
                                    if (blank==4) flag=true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }
}



