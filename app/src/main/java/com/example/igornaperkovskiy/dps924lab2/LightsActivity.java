package com.example.igornaperkovskiy.dps924lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class LightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        final LightsData ls = new LightsData();

        final Switch front = (Switch)findViewById(R.id.front);
        final Switch back = (Switch)findViewById(R.id.back);
        final Switch lv1 = (Switch)findViewById(R.id.lv1);
        final Switch lv2 = (Switch)findViewById(R.id.lv2);
        final Switch kitchen = (Switch)findViewById(R.id.kitchen);
        final Switch hallway = (Switch)findViewById(R.id.hallway);
        final Switch bd1 = (Switch)findViewById(R.id.bd1);
        final Switch bd2 = (Switch)findViewById(R.id.bd2);
        final Switch basement = (Switch)findViewById(R.id.basement);


        if (ls.getFrontDoor() == true) {
            front.setChecked(true);
        }
        else{
            front.setChecked(false);
        }

        if (ls.getBackDoor() == true) {
            back.setChecked(true);
        }
        else{
            back.setChecked(false);
        }
        if (ls.getLv1() == true) {
            lv1.setChecked(true);
        }
        else{
            lv1.setChecked(false);
        }
        if (ls.getLv2() == true) {
            lv2.setChecked(true);
        }
        else{
            lv2.setChecked(false);
        }
        if (ls.getKitchen() == true) {
            kitchen.setChecked(true);
        }
        else{
            kitchen.setChecked(false);
        }
        if (ls.getHallway() == true) {
            hallway.setChecked(true);
        }
        else{
            hallway.setChecked(false);
        }
        if (ls.getBd1() == true) {
            bd1.setChecked(true);
        }
        else{
            bd1.setChecked(false);
        }
        if (ls.getBd2() == true) {
            bd2.setChecked(true);
        }
        else{
            bd2.setChecked(false);
        }
        if (ls.getBasement() == true) {
            basement.setChecked(true);
        }
        else{
            basement.setChecked(false);
        }

        front.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getFrontDoor();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setFrontDoor(true);

                } else {
                    ls.setFrontDoor(false);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getBackDoor();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setBackDoor(true);
                } else {
                    ls.setBackDoor(false);
                }
            }
        });
        lv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getLv1();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setLv1(true);
                } else {
                    ls.setLv1(false);
                }
            }
        });
        lv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getLv2();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setLv2(true);
                } else {
                    ls.setLv2(false);
                }
            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getKitchen();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setKitchen(true);
                } else {
                    ls.setKitchen(false);
                }
            }
        });
        hallway.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getHallway();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setHallway(true);
                } else {
                    ls.setHallway(false);
                }
            }
        });
        bd1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getBd1();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setBd1(true);
                } else {
                    ls.setBd1(false);
                }
            }
        });
        bd2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getBd2();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setBd2(true);
                } else {
                    ls.setBd2(false);
                }
            }
        });
        basement.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ls.getBasement();
                // TODO Auto-generated method stub
                if (t == false) {
                    ls.setBasement(true);

                } else {
                    ls.setBasement(false);
                }
            }
        });
    }
}
