package com.example.performa_pitb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    CommoditiesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler_view = findViewById(R.id.recycler_view);
        setRecyclerview();
    }

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


}
