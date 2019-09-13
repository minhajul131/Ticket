package com.example.ticket;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Booking extends AppCompatActivity {

    Button btn_a1,btn_a2,btn_a3,btn_a4,
            btn_b1,btn_b2,btn_b3,btn_b4,
            btn_c1,btn_c2,btn_c3,btn_c4,
            btn_d1,btn_d2,btn_d3,btn_d4,
            btn_e1,btn_e2,btn_e3,btn_e4,
            btn_f1,btn_f2,btn_f3,btn_f4,
            btn_g1,btn_g2,btn_g3,btn_g4,
            btn_h1,btn_h2,btn_h3,btn_h4,
            btn_i1,btn_i2,btn_i3,btn_i4,
            btn_j1,btn_j2,btn_j3,btn_j4;

    public static String seat;

    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        databaseReference =  FirebaseDatabase.getInstance().getReference("SeatBooking").child(BusAdapter.time);

        btn_a1 = (Button)findViewById(R.id.a1);
        btn_a2 = (Button)findViewById(R.id.a2);
        btn_a3 = (Button)findViewById(R.id.a3);
        btn_a4 = (Button)findViewById(R.id.a4);
        btn_b1 = (Button)findViewById(R.id.b1);
        btn_b2 = (Button)findViewById(R.id.b2);
        btn_b3 = (Button)findViewById(R.id.b3);
        btn_b4 = (Button)findViewById(R.id.b4);
        btn_c1 = (Button)findViewById(R.id.c1);
        btn_c2 = (Button)findViewById(R.id.c2);
        btn_c3 = (Button)findViewById(R.id.c3);
        btn_c4 = (Button)findViewById(R.id.c4);
        btn_d1 = (Button)findViewById(R.id.d1);
        btn_d2 = (Button)findViewById(R.id.d2);
        btn_d3 = (Button)findViewById(R.id.d3);
        btn_d4 = (Button)findViewById(R.id.d4);
        btn_e1 = (Button)findViewById(R.id.e1);
        btn_e2 = (Button)findViewById(R.id.e2);
        btn_e3 = (Button)findViewById(R.id.e3);
        btn_e4 = (Button)findViewById(R.id.e4);
        btn_f1 = (Button)findViewById(R.id.f1);
        btn_f2 = (Button)findViewById(R.id.f2);
        btn_f3 = (Button)findViewById(R.id.f3);
        btn_f4 = (Button)findViewById(R.id.f4);
        btn_g1 = (Button)findViewById(R.id.g1);
        btn_g2 = (Button)findViewById(R.id.g2);
        btn_g3 = (Button)findViewById(R.id.g3);
        btn_g4 = (Button)findViewById(R.id.g4);
        btn_h1 = (Button)findViewById(R.id.h1);
        btn_h2 = (Button)findViewById(R.id.h2);
        btn_h3 = (Button)findViewById(R.id.h3);
        btn_h4 = (Button)findViewById(R.id.h4);
        btn_i1 = (Button)findViewById(R.id.i1);
        btn_i2 = (Button)findViewById(R.id.i2);
        btn_i3 = (Button)findViewById(R.id.i3);
        btn_i4 = (Button)findViewById(R.id.i4);
        btn_j1 = (Button)findViewById(R.id.j1);
        btn_j2 = (Button)findViewById(R.id.j2);
        btn_j3 = (Button)findViewById(R.id.j3);
        btn_j4 = (Button)findViewById(R.id.j4);

        btn_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "A1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "A2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "A3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "A4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "B1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "B2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "B3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "B4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "C1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "C2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "C3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "C4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "D1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "D2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "D3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "D4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "E1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "E2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "E3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "E4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "F1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "F2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "F3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "F4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "G1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "G2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "G3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_g4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "G4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "H1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "H2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "H3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "H4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "I1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "I2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "I3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "I4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        btn_j1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "J1";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_j2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "J2";
                startActivity(new Intent(Booking.this,CutomerInfo.class));

            }
        });
        btn_j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "J3";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });
        btn_j4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seat = "J4";
                startActivity(new Intent(Booking.this,CutomerInfo.class));
            }
        });

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                  if("A1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_a1.setTextColor(Color.RED);
                              }
                              else btn_a1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("A2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_a2.setTextColor(Color.RED);
                              }
                              else btn_a2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("A3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_a3.setTextColor(Color.RED);
                              }
                              else btn_a3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("A4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_a4.setTextColor(Color.RED);
                              }
                              else btn_a4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("B1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_b1.setTextColor(Color.RED);
                              }
                              else btn_b1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("B2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_b2.setTextColor(Color.RED);
                              }
                              else btn_b2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("B3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_b3.setTextColor(Color.RED);
                              }
                              else btn_b3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("B4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_b4.setTextColor(Color.RED);
                              }
                              else btn_b4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("C1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_c1.setTextColor(Color.RED);
                              }
                              else btn_c1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("C2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_c2.setTextColor(Color.RED);
                              }
                              else btn_c2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("C3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_c3.setTextColor(Color.RED);
                              }
                              else btn_c3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("C4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_c4.setTextColor(Color.RED);
                              }
                              else btn_c4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("D1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_d1.setTextColor(Color.RED);
                              }
                              else btn_d1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("D2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_d2.setTextColor(Color.RED);
                              }
                              else btn_d2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("D3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_d3.setTextColor(Color.RED);
                              }
                              else btn_d3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("D4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_d4.setTextColor(Color.RED);
                              }
                              else btn_d4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("E1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_e1.setTextColor(Color.RED);
                              }
                              else btn_e1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("E2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_e2.setTextColor(Color.RED);
                              }
                              else btn_e2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("E3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_e3.setTextColor(Color.RED);
                              }
                              else btn_e3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("E4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_e4.setTextColor(Color.RED);
                              }
                              else btn_e4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("F1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_f1.setTextColor(Color.RED);
                              }
                              else btn_f1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("F2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_f2.setTextColor(Color.RED);
                              }
                              else btn_f2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("F3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_f3.setTextColor(Color.RED);
                              }
                              else btn_f3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("F4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_f4.setTextColor(Color.RED);
                              }
                              else btn_f4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("G1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_g1.setTextColor(Color.RED);
                              }
                              else btn_g1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("G2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_g2.setTextColor(Color.RED);
                              }
                              else btn_g2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("G3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_g3.setTextColor(Color.RED);
                              }
                              else btn_g3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("G4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_g4.setTextColor(Color.RED);
                              }
                              else btn_g4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("H1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_h1.setTextColor(Color.RED);
                              }
                              else btn_h1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("H2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_h2.setTextColor(Color.RED);
                              }
                              else btn_h2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("H3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_h3.setTextColor(Color.RED);
                              }
                              else btn_h3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("H4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_h4.setTextColor(Color.RED);
                              }
                              else btn_h4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("I1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_i1.setTextColor(Color.RED);
                              }
                              else btn_i1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("I2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_i2.setTextColor(Color.RED);
                              }
                              else btn_i2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("I3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_i3.setTextColor(Color.RED);
                              }
                              else btn_i3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("I4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_i4.setTextColor(Color.RED);
                              }
                              else btn_i4.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("J1".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_j1.setTextColor(Color.RED);
                              }
                              else btn_j1.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("J2".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_j2.setTextColor(Color.RED);
                              }
                              else btn_j2.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("J3".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_j3.setTextColor(Color.RED);
                              }
                              else btn_j3.setTextColor(Color.GREEN);

                          }
                      }

                  }

                  else if("J4".equals(dataSnapshot1.getKey())){

                      for (DataSnapshot dataSnapshot2 : dataSnapshot1.getChildren()){
                          if("Book".equals(dataSnapshot2.getKey())){

                              if("false".equals(dataSnapshot2.getValue().toString())){
                                  btn_j4.setTextColor(Color.RED);
                              }
                              else btn_j4.setTextColor(Color.GREEN);

                          }
                      }

                  }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
