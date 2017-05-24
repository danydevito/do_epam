package com.epam.DO_App;

/**
 * Created by daniel on 2017-05-22.
 */
public class Player {

    int score;
    String [][] fields = new String[3][3];
    String message1 = "Gracz X, podaj współrzędne pola (gracz O czeka na swój ruch)";
    String message2 = "Gracz O, podaj współrzędne pola (gracz X czeka na swój ruch)";

    boolean isWin(String[][] winning){
        if (winning[0][0].equals(winning[0][1]) && winning[0][0].equals(winning[0][2])) {
            return true;}
        else if (winning[1][0].equals(winning[1][1]) && winning[1][0].equals(winning[1][2])) {
            return true;}
        else if (winning[2][0].equals(winning[2][1]) && winning[2][0].equals(winning[2][2])) {
            return true;}
        else if (winning[0][0].equals(winning[1][0]) && winning[0][0].equals(winning[2][0])) {
            return true;}
        else if (winning[0][1].equals(winning[1][1]) && winning[0][1].equals(winning[2][1])) {
            return true;}
        else if (winning[0][2].equals(winning[1][2]) && winning[0][2].equals(winning[2][2])) {
            return true;}
        else if (winning[0][0].equals(winning[1][1]) && winning[0][0].equals(winning[2][2])) {
            return true;}
        else if (winning[0][2].equals(winning[1][1]) && winning[0][2].equals(winning[2][0])) {
            return true;}
        else return false;
    }
}


