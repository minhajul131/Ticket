package com.example.ticket;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AvailableBus extends AppCompatActivity {

    private ListView listViewBus;
    DatabaseReference reff;
    List<Bus> busList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_bus);

        listViewBus = (ListView) findViewById(R.id.listViewBus);

        listViewBus.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AvailableBus.this, Booking.class);
                startActivity(intent);
            }
        });

        reff = FirebaseDatabase.getInstance().getReference().child("Bus");

        busList = new ArrayList<>();


        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                boolean from = false;
                boolean to = false;
                boolean date = false;
                Toast.makeText(AvailableBus.this, MainActivity.from + MainActivity.to+MainActivity.date1, Toast.LENGTH_SHORT).show();
                for (DataSnapshot busSnapshot : dataSnapshot.getChildren()) {

                    try {
                        for (DataSnapshot ser : busSnapshot.getChildren()) {

                            if ("from".equals(ser.getKey()) && MainActivity.from.equals(ser.getValue())) {

                                from = true;

                            } else if ("to".equals(ser.getKey()) && MainActivity.to.equals(ser.getValue())) {

                                to = true;

                            } else if ("date".equals(ser.getKey()) && MainActivity.date1.equals(ser.getValue())) {

                              date = true;

                           }

                        }

                    } catch (Exception e) {
                        Toast.makeText(AvailableBus.this, "" + e.toString(), Toast.LENGTH_SHORT).show();

                    }
                    if (from && to && date) {

                        Bus bus = busSnapshot.getValue(Bus.class);
                        busList.add(bus);
                        from = false;
                        to = false;
                        date = false;

                    }
                    /**/
                }
                BusAdapter busAdapter = new BusAdapter(AvailableBus.this, busList);
                listViewBus.setAdapter(busAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                

            }
        });
    }
}