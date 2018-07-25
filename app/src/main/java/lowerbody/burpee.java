package lowerbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.balmermwongera.maxifit.R;

import burpee.halfBurpee;
import burpee.standardBurpee1;

public class burpee extends AppCompatActivity {

    Button burpee1, burpee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burpee);

        burpee1 = findViewById(R.id.btnNeck4);
        burpee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent me = new Intent(burpee.this, halfBurpee.class);
                startActivity(me);
            }
        });
        burpee2 = findViewById(R.id.btnNeck5);
        burpee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(burpee.this, standardBurpee1.class);
                startActivity(i);
            }
        });
    }
}
