package upperbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import triceps.barTip;
import triceps.benchDip;
import triceps.kickBack;
import triceps.pushUps;
import triceps.ropeAttachment;

public class triceps extends AppCompatActivity {

    Button triceps1, triceps2, triceps3, triceps4, triceps5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);

        triceps1 = findViewById(R.id.btnNeck1);
        triceps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(triceps.this, barTip.class);
                startActivity(i);
            }
        });
        triceps2 = findViewById(R.id.btnNeck2);
        triceps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(triceps.this, benchDip.class);
                startActivity(i);
            }
        });
        triceps3 = findViewById(R.id.btnNeck3);
        triceps3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(triceps.this, pushUps.class);
                startActivity(i);
            }
        });
        triceps4 = findViewById(R.id.btnNeck4);
        triceps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(triceps.this, kickBack.class);
                startActivity(i);
            }
        });
        triceps5 = findViewById(R.id.btnNeck5);
        triceps5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(triceps.this, ropeAttachment.class);
                startActivity(i);
            }
        });
    }
}
