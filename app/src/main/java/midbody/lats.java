package midbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import lats.barbellRow;
import lats.dumbbellPullOver;
import lats.dumbbellRow;
import lats.pullDown;
import lats.pullUp;

public class lats extends AppCompatActivity {

    Button lats1, lats2, lats3, lats4, lats5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lats);

        lats1 = findViewById(R.id.btnNeck1);
        lats1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lats.this, pullUp.class);
                startActivity(i);
            }
        });
        lats2 = findViewById(R.id.btnNeck2);
        lats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lats.this, dumbbellRow.class);
                startActivity(i);
            }
        });
        lats3 = findViewById(R.id.btnNeck3);
        lats3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lats.this, barbellRow.class);
                startActivity(i);
            }
        });
        lats4 = findViewById(R.id.btnNeck4);
        lats4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lats.this, pullDown.class);
                startActivity(i);
            }
        });
        lats5 = findViewById(R.id.btnNeck5);
        lats5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(lats.this, dumbbellPullOver.class);
                startActivity(i);
            }
        });
    }
}
