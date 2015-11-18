package com.example.igornaperkovskiy.dps924lab2;

/**
 * Created by igornaperkovskiy on 2015-11-11.
 */
public class LocksData {

    static Boolean front = true;
    static Boolean master = false;
    static Boolean back = true;
    static Boolean living = true;
    static Boolean kitchen = true;
    static Boolean basement = true;


    public Boolean getFront(){
        return front;
    }
    public Boolean getMaster(){
        return master;
    }
    public Boolean getBack(){
        return back;
    }
    public Boolean getLiving(){
        return living;
    }
    public Boolean getKitchen(){
        return kitchen;
    }
    public Boolean getBasement(){
        return basement;
    }
    public int getCount(){
        Boolean list[] = new Boolean[6];
        list[0] = getFront();
        list[1] = getMaster();
        list[2] = getBack();
        list[3] = getLiving();
        list[4] = getKitchen();
        list[5] = getBasement();
        int c = 0;
        for (int i = 0; i < 6; i++){
            if (list[i] == false) c++;
        }

        return c;
    }


    public void setFront(Boolean f) { front = f; }
    public void setMaster(Boolean m) { master = m; }
    public void setBack(Boolean b) { back = b; }
    public void setLiving(Boolean l) { living = l; }
    public void setKitchen(Boolean k) { kitchen = k; }
    public void setBasement(Boolean b) { basement = b; }

}
