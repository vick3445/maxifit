package bodyExercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.balmermwongera.maxifit.CustomListAdapter;
import com.example.balmermwongera.maxifit.R;

import appresources.exercise;
import midbody.abs;
import midbody.backExtensors;
import midbody.glutes;
import midbody.lats;

public class midbody extends AppCompatActivity {

    ListView listView;

    String[] nameArray = {"Abs", "Back Extensors", "Glutes", "Lats"};

    Integer[] imageArray = {
            R.drawable.abs1,
            R.drawable.back1,
            R.drawable.triceps1,
            R.drawable.biceps1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midbody);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, imageArray);
        listView = findViewById(R.id.list);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent neck = new Intent(midbody.this, abs.class);
                    startActivity(neck);
                } else if (i == 1) {
                    Intent shoulder = new Intent(midbody.this, backExtensors.class);
                    startActivity(shoulder);
                } else if (i == 2) {
                    Intent triceps = new Intent(midbody.this, glutes.class);
                    startActivity(triceps);
                } else if (i == 3) {
                    Intent biceps = new Intent(midbody.this, lats.class);
                    startActivity(biceps);
                } else {
                    Intent back = new Intent(midbody.this, exercise.class);
                    startActivity(back);
                }
            }
        });


    }
}
