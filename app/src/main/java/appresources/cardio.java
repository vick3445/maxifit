package appresources;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import cardios.ellipticalMachine;
import cardios.trendMill;

public class cardio extends AppCompatActivity {

    Button upper, mid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_workout);


        upper = findViewById(R.id.btnNeck1);
        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(cardio.this, ellipticalMachine.class);
                startActivity(i);
            }
        });
        mid = findViewById(R.id.btnNeck2);
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(cardio.this, trendMill.class);
                startActivity(i);
            }
        });
    }
}