package upperbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import forearmAndWrists.backWrist;
import forearmAndWrists.downBarbelWrist;
import forearmAndWrists.overBench;
import forearmAndWrists.pulleyWrist;
import forearmAndWrists.upBarbelWrist;

public class forearmAndWrists extends AppCompatActivity {

    Button arm1, arm2, arm3, arm4, arm5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearm_and_wrists);

        arm1 = findViewById(R.id.btnNeck1);
        arm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(forearmAndWrists.this, upBarbelWrist.class);
                startActivity(i);
            }
        });
        arm2 = findViewById(R.id.btnNeck2);
        arm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(forearmAndWrists.this, overBench.class);
                startActivity(i);
            }
        });
        arm3 = findViewById(R.id.btnNeck3);
        arm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(forearmAndWrists.this, pulleyWrist.class);
                startActivity(i);
            }
        });
        arm4 = findViewById(R.id.btnNeck4);
        arm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(forearmAndWrists.this, backWrist.class);
                startActivity(i);
            }
        });
        arm5 = findViewById(R.id.btnNeck5);
        arm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(forearmAndWrists.this, downBarbelWrist.class);
                startActivity(i);
            }
        });
    }
}
