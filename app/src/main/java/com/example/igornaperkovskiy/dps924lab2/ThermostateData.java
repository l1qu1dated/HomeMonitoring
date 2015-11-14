package com.example.igornaperkovskiy.dps924lab2;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class ThermostateData {

    static int main = 21;
    static int living = 21;
    static int kitchen = 21;
    static Boolean mainOn = true;
    static Boolean livingOn = true;
    static Boolean kitchenOn = false;

    public int getMain() { return main; }
    public int getLiving() { return living; }
    public int getKitchen() { return kitchen; }

    public Boolean getMainOn() { return mainOn; }
    public Boolean getLivingOn() { return livingOn; }
    public Boolean getKitchenOn() { return kitchenOn; }

    public void setMain(int m) { main = m; }
    public void setLiving(int l) { living = l; }
    public void setKitchen(int k) { kitchen = k; }
    public void setMainOn(Boolean m) { mainOn = m; }
    public void setLivingOn(Boolean l) { livingOn = l; }
    public void setKitchenOn(Boolean k) { kitchenOn = k; }

    public int getCount() {
        Boolean list[] = new Boolean[3];
        int count = 0;

        list[0] = mainOn;
        list[1] = livingOn;
        list[2] = kitchenOn;

        for (int i = 0; i < 3; i++){
            if (list[i] == false){
                count++;
            }
        }
        return count;
    }


}
