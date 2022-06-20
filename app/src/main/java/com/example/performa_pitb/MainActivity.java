package com.example.performa_pitb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Spinner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;




public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    CommoditiesAdapter adapter;

    //    Start tick_cross code Here
    private ImageView tickCross;
    private AnimatedVectorDrawable tickToCross;
    private AnimatedVectorDrawable crossToTick;
    private boolean tick = true;
    private Bundle savedInstanceState;
    //    End tick_cross code Here


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //    Start Date_picker code Here
            this.savedInstanceState = savedInstanceState;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // initiate the date picker and a button
            date = (EditText) findViewById(R.id.date);
            // perform click event on edit text
            date.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // calender class's instance and get current date , month and year from calender
                    final Calendar c = Calendar.getInstance();
                    int mYear = c.get(Calendar.YEAR); // current year
                    int mMonth = c.get(Calendar.MONTH); // current month
                    int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                    // date picker dialog
                    datePickerDialog = new DatePickerDialog(MainActivity.this,
                            new DatePickerDialog.OnDateSetListener() {

                                @Override
                                public void onDateSet(DatePicker view, int year,
                                                      int monthOfYear, int dayOfMonth) {
                                    // set day of month , month and year value in the edit text
                                    date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                                }
                            }, mDay, mMonth, mYear);
                    datePickerDialog.show();
                }
            });




        //    End Date_picker code Here


//        Start here tick_cross

        setContentView(R.layout.activity_main);
        tickCross = findViewById(R.id.tick_cross);

        tickToCross = (AnimatedVectorDrawable)
                getDrawable(R.drawable.avd_tick_to_cross);

        crossToTick = (AnimatedVectorDrawable)
                getDrawable(R.drawable.avd_cross_to_tick);
//        End here tick_cross


        setContentView(R.layout.activity_main);
        Spinner staticSpinner = (Spinner) findViewById(R.id.classSpinner);
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter.createFromResource(this,
                R.array.division_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner.setAdapter(staticAdapter);









        //Recycler View Start
//        recycler_view = findViewById(R.id.recycler_view);
//        setRecyclerview();
    }



//    Start tick_cross code Here

        // This method help to animate our view.
        public void animate(View view)
        {
            AnimatedVectorDrawable drawable
                    = tick
                    ? tickToCross
                    : crossToTick;
            tickCross.setImageDrawable(drawable);
            drawable.start();
            tick = !tick;
        }


    //    Start Date_picker code Here

    EditText date;
    DatePickerDialog datePickerDialog;



    //    End tick_cross code Here



    private void setRecyclerview() {
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CommoditiesAdapter(this,getlist());
        recycler_view.setAdapter(adapter);
    }

    private List<CommoditiesModel> getlist(){
        List<CommoditiesModel> commoditiesModelList = new ArrayList<>();
        commoditiesModelList.add(new CommoditiesModel("01","Flour(Atta)","X","True","100","100"));
        commoditiesModelList.add(new CommoditiesModel("02","Suger","X","True","900","900"));
        commoditiesModelList.add(new CommoditiesModel("03","Chicken","True","X","7010","7010"));
        commoditiesModelList.add(new CommoditiesModel("04","Onion","True","X","900","900"));
        commoditiesModelList.add(new CommoditiesModel("05","Tomato","X","True","7010","7010"));
        commoditiesModelList.add(new CommoditiesModel("06","Daal Chana","X","True","900","900"));
        commoditiesModelList.add(new CommoditiesModel("07","Daal Moong","True","X","700","700"));
        commoditiesModelList.add(new CommoditiesModel("08","Potato","X","True","7010","7010"));
        commoditiesModelList.add(new CommoditiesModel("09","Ghee","X","True","500","500"));
    return commoditiesModelList;
    }
     //Recycler View End


}
