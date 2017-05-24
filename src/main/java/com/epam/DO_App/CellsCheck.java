package com.epam.DO_App;

import java.util.ArrayList;

/**
 * Created by daniel on 2017-05-22.
 */
public class CellsCheck {

    ArrayList<String> cellsCheck = new ArrayList<String>();
    public ArrayList<String> fillList(){
        cellsCheck.add("a1");
        cellsCheck.add("a2");
        cellsCheck.add("a3");
        cellsCheck.add("b1");
        cellsCheck.add("b2");
        cellsCheck.add("b3");
        cellsCheck.add("c1");
        cellsCheck.add("c2");
        cellsCheck.add("c3");
        return cellsCheck;
    }
    public boolean checkListContain(ArrayList<String> list, String answer){
        if (list.contains(answer)) return true;
        else return false;
    }
    public void removeItem(String removal){
        cellsCheck.remove(removal);
    }
}
