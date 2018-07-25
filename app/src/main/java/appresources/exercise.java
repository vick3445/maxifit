package appresources;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import bodyExercise.lowerbody;
import bodyExercise.midbody;
import bodyExercise.upperbody;

public class exercise extends AppCompatActivity {
    Button upper, mid, lower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        upper = findViewById(R.id.Ubody);
        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(exercise.this, upperbody.class);
                startActivity(i);
            }
        });
        mid = findViewById(R.id.Mbody);
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(exercise.this, midbody.class);
                startActivity(i);
            }
        });
        lower = findViewById(R.id.Lbody);
        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(exercise.this, lowerbody.class);
                startActivity(i);
            }
        });
    }
}
