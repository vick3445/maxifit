package midbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import backExtensors.ballBackExtension;
import backExtensors.deadLift;
import backExtensors.goodmorning;
import backExtensors.hyperextension;
import backExtensors.superman;

public class backExtensors extends AppCompatActivity {

    Button backExt1, backExt2, backExt3, backExt4, backExt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_extensors);

        backExt1 = findViewById(R.id.btnNeck1);
        backExt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(backExtensors.this, superman.class);
                startActivity(i);
            }
        });
        backExt2 = findViewById(R.id.btnNeck2);
        backExt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(backExtensors.this, hyperextension.class);
                startActivity(i);
            }
        });
        backExt3 = findViewById(R.id.btnNeck3);
        backExt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(backExtensors.this, goodmorning.class);
                startActivity(i);
            }
        });
        backExt4 = findViewById(R.id.btnNeck4);
        backExt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(backExtensors.this, deadLift.class);
                startActivity(i);
            }
        });
        backExt5 = findViewById(R.id.btnNeck5);
        backExt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(backExtensors.this, ballBackExtension.class);
                startActivity(i);
            }
        });
    }
}
