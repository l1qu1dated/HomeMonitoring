package com.example.igornaperkovskiy.dps924lab2;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class LightsData {

    static Boolean frontDoor = true;
    static Boolean backDoor = true;
    static Boolean lv1 = false;
    static Boolean lv2 = true;
    static Boolean kitchen = false;
    static Boolean hallway = false;
    static Boolean bd1 = true;
    static Boolean bd2 = true;
    static Boolean basement = false;

    public Boolean getFrontDoor() { return frontDoor; }
    public Boolean getBackDoor() { return backDoor; }
    public Boolean getLv1() { return lv1; }
    public Boolean getLv2() { return lv2; }
    public Boolean getKitchen() { return kitchen; }
    public Boolean getHallway() { return hallway; }
    public Boolean getBd1() { return bd1; }
    public Boolean getBd2() { return bd2; }
    public Boolean getBasement() { return basement; }

    public void setFrontDoor(Boolean l) { frontDoor = l; }
    public void setBackDoor(Boolean l) { backDoor = l; }
    public void setLv1(Boolean l) { lv1 = l; }
    public void setLv2(Boolean l) { lv2 = l; }
    public void setKitchen(Boolean l) { kitchen = l; }
    public void setHallway(Boolean l) { hallway = l; }
    public void setBd1(Boolean l) { bd1 = l; }
    public void setBd2(Boolean l) { bd2 = l; }
    public void setBasement(Boolean l) {basement = l; }

    public int countLights() {
        Boolean list[] = new Boolean[9];

        list[0] = getFrontDoor();
        list[1] = getBackDoor();
        list[2] = getLv1();
        list[3] = getLv2();
        list[4] = getKitchen();
        list[5] = getHallway();
        list[6] = getBd1();
        list[7] = getBd2();
        list[8] = getBasement();

        int count = 0;

        for (int i = 0; i < 9; i++){
            if(list[i] == true){
                count++;
            }
        }
        return count;

    }

}
