package com.epam.DO_App;

/**
 * Created by daniel on 2017-05-24.
 */
public interface GameAble {

    void translator(String a);

    void ending(String a);

    int getScoreX();
    int getScoreO();
    boolean isFull(String[][] array, int size);
}
