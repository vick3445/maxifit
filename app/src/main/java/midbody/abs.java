package midbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import abs.benchCruches;
import abs.legRaise;
import abs.obliqueFLoor;
import abs.reverse;
import abs.twisting;

public class abs extends AppCompatActivity {

    Button abs1, abs2, abs3, abs4, abs5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);

        abs1 = findViewById(R.id.btnNeck1);
        abs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abs.this, twisting.class);
                startActivity(i);
            }
        });
        abs2 = findViewById(R.id.btnNeck2);
        abs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abs.this, reverse.class);
                startActivity(i);
            }
        });
        abs3 = findViewById(R.id.btnNeck3);
        abs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abs.this, legRaise.class);
                startActivity(i);
            }
        });
        abs4 = findViewById(R.id.btnNeck4);
        abs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abs.this, benchCruches.class);
                startActivity(i);
            }
        });
        abs5 = findViewById(R.id.btnNeck5);
        abs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(abs.this, obliqueFLoor.class);
                startActivity(i);
            }
        });
    }
}
