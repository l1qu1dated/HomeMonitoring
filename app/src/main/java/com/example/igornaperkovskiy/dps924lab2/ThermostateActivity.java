package com.example.igornaperkovskiy.dps924lab2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.Spinner;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class ThermostateActivity extends AppCompatActivity {

    private ThermostateData td = new ThermostateData();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermostate);

        final Button main = (Button)findViewById(R.id.mainBedroom);
        final Button living = (Button)findViewById(R.id.livingRoom);
        final Button kitchen = (Button)findViewById(R.id.kitchen);

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
        /*NumberPicker np;
        np = (NumberPicker) this.findViewById(R.id.number_picker);
        np.setMinValue(1);
        np.setMaxValue(31);
        np.setWrapSelectorWheel(false);*/


        main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //registerForContextMenu(findViewById(R.id.mainBedroom));
                //openContextMenu(findViewById(R.id.mainBedroom));
                //AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this,AlertDialog.THEME_HOLO_LIGHT);
                AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);




                if (td.getMainOn() == true){
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Turn Off?");
                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setMainOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                    }
                else{

                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();

                }
            }
        });

        living.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //registerForContextMenu(findViewById(R.id.livingRoom));
                //openContextMenu(findViewById(R.id.livingRoom));
                AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);
                if(td.getLivingOn() == true){
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Turn Off?");
                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setLivingOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                }
                else{
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                }

            }
        });

        kitchen.setOnClickListener(new View.OnClickListener() {
            AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);
            public void onClick(View v) {
                if(td.getKitchenOn() == true){
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Turn Off?");
                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setKitchenOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                }
                else{
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                }
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
