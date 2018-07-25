package upperbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import chest.benchPress;
import chest.butterflyPress;
import chest.dumbbellPress;
import chest.inclineBench;
import chest.parallelBars;

public class chest extends AppCompatActivity {

    Button chest1, chest2, chest3, chest4, chest5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        chest1 = findViewById(R.id.btnNeck1);
        chest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(chest.this, benchPress.class);
                startActivity(i);
            }
        });
        chest2 = findViewById(R.id.btnNeck2);
        chest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(chest.this, dumbbellPress.class);
                startActivity(i);
            }
        });
        chest3 = findViewById(R.id.btnNeck3);
        chest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(chest.this, parallelBars.class);
                startActivity(i);
            }
        });
        chest4 = findViewById(R.id.btnNeck4);
        chest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(chest.this, butterflyPress.class);
                startActivity(i);
            }
        });
        chest5 = findViewById(R.id.btnNeck5);
        chest5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(chest.this, inclineBench.class);
                startActivity(i);
            }
        });
    }
}
