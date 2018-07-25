package midbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import glutes.cableKickback;
import glutes.dumbellLunges;
import glutes.gluteKickback;
import glutes.legBridge;
import glutes.legSquats;

public class glutes extends AppCompatActivity {

    Button glute1, glute2, glute3, glute4, glute5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes);

        glute1 = findViewById(R.id.btnNeck1);
        glute1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(glutes.this, dumbellLunges.class);
                startActivity(i);
            }
        });
        glute2 = findViewById(R.id.btnNeck2);
        glute2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(glutes.this, cableKickback.class);
                startActivity(i);
            }
        });
        glute3 = findViewById(R.id.btnNeck3);
        glute3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(glutes.this, gluteKickback.class);
                startActivity(i);
            }
        });
        glute4 = findViewById(R.id.btnNeck4);
        glute4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(glutes.this, legBridge.class);
                startActivity(i);
            }
        });
        glute5 = findViewById(R.id.btnNeck5);
        glute5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(glutes.this, legSquats.class);
                startActivity(i);
            }
        });
    }
}
