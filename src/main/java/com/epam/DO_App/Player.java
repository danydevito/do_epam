package com.epam.DO_App;

/**
 * Created by daniel on 2017-05-22.
 */
public class Player {

        int score;
//        String[][] fields = new String[size][size];
        String message1 = "Gracz X, podaj współrzędne pola (gracz O czeka na swój ruch)";
        String message2 = "Gracz O, podaj współrzędne pola (gracz X czeka na swój ruch)";
        StringBuilder chain1 = new StringBuilder();
        StringBuilder chain2 = new StringBuilder();
        int row;

    boolean isWin(String[][] winning,int size, String sign) {
        if (size==3) row=3;
        else if (size>3 & size<8) row=4;
        else row=5;
        int flag = 0;
        for (int i=0; i<size; i++){
            chain1.append(sign);
        }
        for (int i=0; i<size; i++){
            for (int j=0; j<size-row+1; j++){
                for (int r=j; r<row+j; r++){
                    chain2.append(winning[i][r]);
                }if (chain2.toString().equals(chain1.toString())){
                    flag=1;
                }
                else chain2.delete(0,row);
            }
        }
        chain1.delete(0,size);
        if (flag==1)return true;
        else return false;
//        if (winning[0][0].equals(winning[0][1]) && winning[0][0].equals(winning[0][2]) && winning[0][0].equals(sign)) {
//            return true;
//        } else if (winning[1][0].equals(winning[1][1]) && winning[1][0].equals(winning[1][2]) && winning[1][0].equals(sign)) {
//            return true;
//        } else if (winning[2][0].equals(winning[2][1]) && winning[2][0].equals(winning[2][2]) && winning[2][0].equals(sign)) {
//            return true;
//        } else if (winning[0][0].equals(winning[1][0]) && winning[0][0].equals(winning[2][0]) && winning[0][0].equals(sign)) {
//            return true;
//        } else if (winning[0][1].equals(winning[1][1]) && winning[0][1].equals(winning[2][1]) && winning[0][1].equals(sign)) {
//            return true;
//        } else if (winning[0][2].equals(winning[1][2]) && winning[0][2].equals(winning[2][2]) && winning[0][2].equals(sign)) {
//            return true;
//        } else if (winning[0][0].equals(winning[1][1]) && winning[0][0].equals(winning[2][2]) && winning[0][0].equals(sign)) {
//            return true;
//        } else if (winning[0][2].equals(winning[1][1]) && winning[0][2].equals(winning[2][0]) && winning[0][2].equals(sign)) {
//            return true;
//        } else return false;
    }
}



