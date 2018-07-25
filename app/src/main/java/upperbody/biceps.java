package upperbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import biceps.concerntrationCurls;
import biceps.dumbellCurls;
import biceps.dumbellPress;
import biceps.hammerCurls;
import biceps.preacherCurls;

public class biceps extends AppCompatActivity {

    Button biceps1, biceps2, biceps3, biceps4, biceps5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);


        biceps1 = findViewById(R.id.btnNeck1);
        biceps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(biceps.this, dumbellPress.class);
                startActivity(i);
            }
        });
        biceps2 = findViewById(R.id.btnNeck2);
        biceps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(biceps.this, hammerCurls.class);
                startActivity(i);
            }
        });
        biceps3 = findViewById(R.id.btnNeck3);
        biceps3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(biceps.this, dumbellCurls.class);
                startActivity(i);
            }
        });
        biceps4 = findViewById(R.id.btnNeck4);
        biceps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(biceps.this, concerntrationCurls.class);
                startActivity(i);
            }
        });
        biceps5 = findViewById(R.id.btnNeck5);
        biceps5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(biceps.this, preacherCurls.class);
                startActivity(i);
            }
        });
    }
}
