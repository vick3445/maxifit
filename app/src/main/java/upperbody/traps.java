package upperbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import traps.barbellShrug;
import traps.cableRow;
import traps.dumbellShrug;
import traps.pullUpShrug;
import traps.uprightRow;

public class traps extends AppCompatActivity {

    Button traps1, traps2, traps3, traps4, traps5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traps);

        traps1 = findViewById(R.id.btnNeck1);
        traps1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(traps.this, cableRow.class);
                startActivity(i);
            }
        });
        traps2 = findViewById(R.id.btnNeck2);
        traps2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(traps.this, dumbellShrug.class);
                startActivity(i);
            }
        });
        traps3 = findViewById(R.id.btnNeck3);
        traps3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(traps.this, pullUpShrug.class);
                startActivity(i);
            }
        });
        traps4 = findViewById(R.id.btnNeck4);
        traps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(traps.this, barbellShrug.class);
                startActivity(i);
            }
        });
        traps5 = findViewById(R.id.btnNeck5);
        traps5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(traps.this, uprightRow.class);
                startActivity(i);
            }
        });
    }
}
