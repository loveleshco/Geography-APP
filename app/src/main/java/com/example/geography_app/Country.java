package com.example.geography_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;



public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        final ImageView countryImage = (ImageView) findViewById(R.id.showImage) ;
        final TextView countryInfo = (TextView) findViewById(R.id.textInfo);


        Spinner countryList = (Spinner) findViewById(R.id.countryList);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Country.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.countryNames)
        );
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item

        );
        countryList.setAdapter(myAdapter);
        countryList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        countryImage.setImageResource(R.drawable.india);
                        countryInfo.setText("This is India capital delhi");
                        break;
                    case 1:
                        countryImage.setImageResource(R.drawable.australia);
                        countryInfo.setText("This is Australia capital Sydney");
                        break;
                    case 2:
                        countryImage.setImageResource(R.drawable.canada);
                        countryInfo.setText("This is canada capital toronto");
                        break;
                    case 3:
                        countryImage.setImageResource(R.drawable.usa);
                        countryInfo.setText("This is usa capital washington");
                        break;
                    case 4:
                        countryImage.setImageResource(R.drawable.england);
                        countryInfo.setText("This is england capital london");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
