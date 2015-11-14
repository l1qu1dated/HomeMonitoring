package com.example.igornaperkovskiy.dps924lab2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class ThermostateActivity extends AppCompatActivity {

    ThermostateData td = new ThermostateData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermostate);


        final Button main = (Button)findViewById(R.id.mainBedroom);
        Button living = (Button)findViewById(R.id.livingRoom);
        Button kitchen = (Button)findViewById(R.id.kitchen);

        if (td.getMainOn() == false ){
            main.setText("Main Bedroom: off");
        }
        else{
            main.setText("Main Bedroom: " + td.getMain() + "\u2103");
        }

        if (td.getLivingOn() == false){
            living.setText("Living Room: off");
        }
        else{
            living.setText("Living Room: " + td.getLiving() + "\u2103");
        }

        if (td.getKitchenOn() == false){
            kitchen.setText("Kitchen: off");
        }
        else{
            kitchen.setText("Kitchen: " + td.getKitchen() + "\u2103");
        }


        main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                registerForContextMenu(findViewById(R.id.mainBedroom));
                openContextMenu(findViewById(R.id.mainBedroom));
            }
        });

        living.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                registerForContextMenu(findViewById(R.id.livingRoom));
                openContextMenu(findViewById(R.id.livingRoom));
            }
        });

        kitchen.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                registerForContextMenu(findViewById(R.id.kitchen));
                openContextMenu(findViewById(R.id.kitchen));
            }
        });


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Turn on?");
        menu.add(menu.FIRST, v.getId(), 1, "Cancel");
        menu.add(menu.FIRST, v.getId(), 2, "OK");

    }
}
