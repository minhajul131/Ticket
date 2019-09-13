package com.example.ticket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CutomerInfo extends AppCompatActivity {

    EditText name,phone;
    Button book;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cutomer_info);

        name = findViewById(R.id.cusName);
        phone = findViewById(R.id.cusPhn);
        book = findViewById(R.id.bookSeat);

        databaseReference =  FirebaseDatabase.getInstance().getReference("SeatBooking").child(BusAdapter.time).child(Booking.seat);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference.child("Book").setValue("false");
                databaseReference.child("Name").setValue(name.getText().toString());
                databaseReference.child("Phone").setValue(phone.getText().toString());
                startActivity(new Intent(CutomerInfo.this,Booking.class));
            }
        });
    }
}
