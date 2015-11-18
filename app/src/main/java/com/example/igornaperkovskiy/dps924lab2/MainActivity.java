package com.example.igornaperkovskiy.dps924lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    static Boolean status = true; // monitoring status on/off

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise data classes
        LocksData ld = new LocksData();
        LightsData ls = new LightsData();
        ThermostateData td = new ThermostateData();

        //Initialise buttons and switch
        Switch on = (Switch)findViewById(R.id.switch1);
        final Button locks = (Button)findViewById(R.id.door_locks);
        final Button lights = (Button)findViewById(R.id.lights);
        final Button cameras = (Button)findViewById(R.id.camera);
        final Button thermostat = (Button)findViewById(R.id.thermostats);

        //setting buttons text
        locks.setText("Door Locks: " + ld.getCount() + " unlocked");
        lights.setText("Lights: " + ls.countLights() + " on");
        thermostat.setText("Thermostats: " + td.getCount() + " on");

        //Lock and unlock buttons
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(status == true){
                    status = false;
                    locks.setEnabled(false);
                    lights.setEnabled(false);
                    cameras.setEnabled(false);
                    thermostat.setEnabled(false);
                }
                else{
                    status = true;
                    locks.setEnabled(true);
                    lights.setEnabled(true);
                    cameras.setEnabled(true);
                    thermostat.setEnabled(true);
                }
            }
        });

        //Actions on button clicks
        locks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), LocksActivity.class);
                startActivity(i);
            }
        });

        cameras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(i);
            }
        });

        thermostat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ThermostateActivity.class);
                startActivity(i);
            }
        });

        lights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), LightsActivity.class);
                startActivity(i);
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
