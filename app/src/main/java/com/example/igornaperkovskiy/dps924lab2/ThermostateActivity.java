package com.example.igornaperkovskiy.dps924lab2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

/**
 * Created by igornaperkovskiy on 2015-11-13.
 */
public class ThermostateActivity extends AppCompatActivity {

    private ThermostateData td = new ThermostateData();
    private static int mainVal = 21;
    private static int livingVal = 23;
    private static int kitchenVal = 21;


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

        main.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                if (td.getMainOn() == true) {
                    //inflate layout
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    //set title
                    builder.setTitle("Set Temperature:");

                    //Off button
                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setMainOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });

                    //create number picker view
                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    //initialise number picker
                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getMain());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            mainVal = newVal;
                        }
                    });

                    //Cancel and OK buttons
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setMain(mainVal);
                            finish();
                            startActivity(getIntent());
                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                } else {

                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getMain());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            mainVal = newVal;
                        }
                    });

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setMainOn(true);
                            td.setMain(mainVal);
                            finish();
                            startActivity(getIntent());
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
/**********************************************************************************************/
        living.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);
                if (td.getLivingOn() == true) {

                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Set Temperature:");

                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setLivingOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });

                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getLiving());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            livingVal = newVal;
                        }
                    });

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setLiving(livingVal);
                            finish();
                            startActivity(getIntent());
                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                } else {
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();

                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getLiving());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            livingVal = newVal;
                        }
                    });

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setLivingOn(true);
                            td.setLiving(livingVal);
                            finish();
                            startActivity(getIntent());
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
/**********************************************************************************************/
        kitchen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ThermostateActivity.this, AlertDialog.THEME_HOLO_LIGHT);

                if (td.getKitchenOn() == true) {
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Set Temperature:");


                    builder.setNeutralButton("Off", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setKitchenOn(false);
                            finish();
                            startActivity(getIntent());
                        }
                    });

                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getKitchen());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            kitchenVal = newVal;
                        }
                    });

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setKitchen(kitchenVal);
                            finish();
                            startActivity(getIntent());
                        }
                    })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                }
                            });
                    builder.show();
                } else {
                    LayoutInflater inflater = ThermostateActivity.this.getLayoutInflater();
                    builder.setTitle("Turn On?");
                    builder.setView(inflater.inflate(R.layout.spinner, null));

                    NumberPicker np = new NumberPicker(ThermostateActivity.this);
                    builder.setView(np);
                    np.setMinValue(14);
                    np.setMaxValue(30);
                    np.setValue(td.getKitchen());
                    np.setWrapSelectorWheel(true);
                    np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {

                        @Override
                        public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                            kitchenVal = newVal;
                        }
                    });

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            td.setKitchenOn(true);
                            td.setKitchen(kitchenVal);
                            finish();
                            startActivity(getIntent());
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
