package com.example.dcp.custom_spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] type = {"Select User Type","Salesman","shop","Distributor"};
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner)findViewById(R.id.spinner_);



        Base_adapter_usertype base_adapter_usertype = new Base_adapter_usertype(getApplicationContext(),type);
        spinner.setAdapter(base_adapter_usertype);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(type.equals("Select User Type")){
                    //do nothing
                }
                else{
                    //do somthing
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
