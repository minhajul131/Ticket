package com.example.ticket;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ticket.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

//spinner
    Spinner s1,s2;

//for next page button
    Button go;

    public static String from,to,date1;

//date
    private static final String TAG = "MainActivity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDAteSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//database
        go = (Button)findViewById(R.id.buttonGo);

//spinner
        s1 = (Spinner)findViewById(R.id.spnner1);
        s2 = (Spinner)findViewById(R.id.spnner2);
        s1.setOnItemSelectedListener(this);
        s2.setOnItemSelectedListener(this);

//date
        mDisplayDate = (TextView)findViewById(R.id.textView3);
        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,android.R.style.Theme_Material_Dialog_MinWidth,
                        mDAteSetListener,year,month,day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.BLACK));
                dialog.show();
            }
        });
        mDAteSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month+1;
                Log.d(TAG, "onDateSet: dd/mm/yyyy" + dayOfMonth + "/" + month + "/" + year);
                String date =  dayOfMonth + "/" + month + "/" + year;
                mDisplayDate.setText(date);
                date1 = date;
            }
        };

//for next activity
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAvailablePage();
            }
        });

    }

//button for next activity
    private void openAvailablePage() {
            Intent intend = new Intent(this, AvailableBus.class);
            startActivity(intend);
    }

//spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spin = (Spinner)parent;
        if(spin.getId() == R.id.spnner1) {
             from = parent.getItemAtPosition(position).toString();
             Toast.makeText(this,"from",Toast.LENGTH_SHORT).show();
        }
        else if(spin.getId() == R.id.spnner2){
             to = parent.getItemAtPosition(position).toString();
            Toast.makeText(this,"to",Toast.LENGTH_SHORT).show();

        }

    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
