package lowerbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import quadriceps.BarbellSquat;
import quadriceps.bodyWeightSquat;
import quadriceps.frontSquat;
import quadriceps.inclineLeg;
import quadriceps.plieSquat;

public class quadriceps extends AppCompatActivity {

    Button quad1, quad2, quad3, quad4, quad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadriceps);

        quad1 = findViewById(R.id.btnNeck1);
        quad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quadriceps.this, inclineLeg.class);
                startActivity(i);
            }
        });
        quad2 = findViewById(R.id.btnNeck2);
        quad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quadriceps.this, frontSquat.class);
                startActivity(i);
            }
        });
        quad3 = findViewById(R.id.btnNeck3);
        quad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quadriceps.this, BarbellSquat.class);
                startActivity(i);
            }
        });
        quad4 = findViewById(R.id.btnNeck4);
        quad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quadriceps.this, plieSquat.class);
                startActivity(i);
            }
        });
        quad5 = findViewById(R.id.btnNeck5);
        quad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(quadriceps.this, bodyWeightSquat.class);
                startActivity(i);
            }
        });
    }
}
