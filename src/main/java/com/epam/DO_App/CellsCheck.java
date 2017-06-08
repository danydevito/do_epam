package com.epam.DO_App;

import java.util.ArrayList;

/**
 * Created by daniel on 2017-05-22.
 */
public class CellsCheck {

    ArrayList<String> cellsCheck = new ArrayList<String>();
    public ArrayList<String> fillList(int size){
        String fields1 = "abcdefghi";
        String fields2 = "123456789";
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                String coordX = fields1.substring(i,i+1);
                String coordY = fields2.substring(j,j+1);
                String coord = coordX+coordY;
                cellsCheck.add(coord);
            }
        }
        return cellsCheck;
    }
    public boolean checkListContain(ArrayList<String> list, String answer){
        if (list.contains(answer)) return true;
        else return false;
    }
    public void removeItem(ArrayList<String> list, String removal){
        list.remove(removal);
    }
}
