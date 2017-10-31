package com.example.a2dam.actividad4di;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Actividad4DI extends AppCompatActivity{ //implements
        //CompoundButton.OnCheckedChangeListener, View.OnLongClickListener{

    private ToggleButton fondo, letra;
    private LinearLayout fondoRojo;
    private CheckBox mostrar;
    private TextView moculto;
    private TextView click;
    private RatingBar ratingBar;
    private TextView rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4_di);

        fondo = (ToggleButton) findViewById(R.id.fondo);
        letra = (ToggleButton) findViewById(R.id.letra);
        fondoRojo = (LinearLayout) findViewById(R.id.fondoRojo);
        click = (TextView) findViewById (R.id.click);
        mostrar = (CheckBox) findViewById(R.id.mostrar);
        moculto = (TextView) findViewById(R.id.moculto);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        rate = (TextView) findViewById(R.id.rate);

        moculto.setVisibility(View.INVISIBLE);

        fondo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // The toggle is enabled
                        fondoRojo.setBackgroundColor(Color.parseColor("#FFFF4444"));
                    } else {
                        fondoRojo.setBackgroundColor(Color.parseColor("#00000000"));
                    }
                }
            });

        letra.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    letra.setTextColor(Color.parseColor("#FFFF4444"));
                } else {
                    letra.setTextColor(Color.parseColor("#000000"));
                }
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float star, boolean b) {
                rate.setText("("+star+"/5)");
            }
        });

        click.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "¡Muchas Gracias!", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        mostrar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    moculto.setVisibility(View.VISIBLE);
                } else {
                    moculto.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}


