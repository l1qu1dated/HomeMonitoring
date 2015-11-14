package com.example.igornaperkovskiy.dps924lab2;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by igornaperkovskiy on 2015-11-11.
 */
public class LocksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locks);

        final LocksData ld = new LocksData();

        final Button front_door = (Button)findViewById(R.id.front);
        final Button master = (Button)findViewById(R.id.master);
        final Button back = (Button)findViewById(R.id.back);
        final Button living = (Button)findViewById(R.id.living);
        final Button kitchen = (Button)findViewById(R.id.kitchen);
        final Button basement = (Button)findViewById(R.id.basement);


        if (ld.getFront() == true){
            front_door.setText("Front Door: Locked");
            front_door.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            front_door.setText("Front Door: Unlocked");
            front_door.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }
        if (ld.getMaster() == true){
            master.setText("M. Bedroom Door: Locked");
            master.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            master.setText("M. Bedroom Door: Unlocked");
            master.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }
        if(ld.getBack() == true){
            back.setText("Back Door: Locked");
            back.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            back.setText("Back Door: Unlocked");
            back.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }
        if(ld.getLiving() == true){
            living.setText("Living Room  Door: Locked");
            living.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            living.setText("Living Room  Door: Unlocked");
            living.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }
        if(ld.getKitchen() == true){
            kitchen.setText("Kitchen  Door: Locked");
            kitchen.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            kitchen.setText("Kitchen  Door: Unlocked");
            kitchen.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }
        if(ld.getBasement() == true){
            basement.setText("Basement  Door: Locked");
            basement.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
        }
        else{
            basement.setText("Basement  Door: Unlocked");
            basement.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        }


        front_door.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getFront();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setFront(true);
                    front_door.setText("Front Door: Locked");
                    front_door.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setFront(false);
                    front_door.setText("Front Door: Unlocked");
                    front_door.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        master.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getMaster();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setMaster(true);
                    master.setText("M. Bedroom Door: Locked");
                    master.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setMaster(false);
                    master.setText("M. Bedroom Door: Unlocked");
                    master.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getBack();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setBack(true);
                    back.setText("Back Door: Locked");
                    back.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setBack(false);
                    back.setText("Back Door: Unlocked");
                    back.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        living.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getLiving();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setLiving(true);
                    living.setText("Living Room Door: Locked");
                    living.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setLiving(false);
                    living.setText("Living Room Door: Unlocked");
                    living.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        kitchen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getKitchen();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setKitchen(true);
                    kitchen.setText("Kitchen Door: Locked");
                    kitchen.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setKitchen(false);
                    kitchen.setText("Kitchen Door: Unlocked");
                    kitchen.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });

        basement.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Boolean t = ld.getBasement();
                // TODO Auto-generated method stub
                if (t == false) {
                    ld.setBasement(true);
                    basement.setText("Basement Door: Locked");
                    basement.getBackground().setColorFilter(0xFF00FF00, PorterDuff.Mode.MULTIPLY);
                } else {
                    ld.setBasement(false);
                    basement.setText("Basement Door: Unlocked");
                    basement.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_report){
            Intent i = new Intent(getApplicationContext(),ReportActivity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_log_out) {
            return true;
        }
        if (id == R.id.action_feedback) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
