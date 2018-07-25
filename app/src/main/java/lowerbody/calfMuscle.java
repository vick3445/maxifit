package lowerbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import calfMuscle.calfRise;
import calfMuscle.jumpRope;
import calfMuscle.rockingRaise;
import calfMuscle.seatedRaise;
import calfMuscle.standingRaise;

public class calfMuscle extends AppCompatActivity {

    Button calf1, calf2, calf3, calf4, calf5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_muscle);

        calf1 = findViewById(R.id.btnNeck1);
        calf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(calfMuscle.this, calfRise.class);
                startActivity(i);
            }
        });
        calf2 = findViewById(R.id.btnNeck2);
        calf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(calfMuscle.this, jumpRope.class);
                startActivity(i);
            }
        });
        calf3 = findViewById(R.id.btnNeck3);
        calf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(calfMuscle.this, seatedRaise.class);
                startActivity(i);
            }
        });
        calf4 = findViewById(R.id.btnNeck4);
        calf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(calfMuscle.this, standingRaise.class);
                startActivity(i);
            }
        });
        calf5 = findViewById(R.id.btnNeck5);
        calf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(calfMuscle.this, rockingRaise.class);
                startActivity(i);
            }
        });
    }
}
