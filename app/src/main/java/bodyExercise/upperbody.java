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
import upperbody.biceps;
import upperbody.chest;
import upperbody.forearmAndWrists;
import upperbody.neck;
import upperbody.shoulder;
import upperbody.traps;
import upperbody.triceps;


public class upperbody extends AppCompatActivity {
    ListView listView;

    String[] nameArray = {"neck", "Shoulder", "Triceps", "Biceps", "Chest", "Traps", "Forearm and Wrists"};

    Integer[] imageArray = {
            R.drawable.neck1,
            R.drawable.shoulder1,
            R.drawable.triceps1,
            R.drawable.biceps1,
            R.drawable.chest1,
            R.drawable.traps1,
            R.drawable.cardios1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upperbody);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, imageArray);
        listView = findViewById(R.id.list);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent neck = new Intent(upperbody.this, neck.class);
                    startActivity(neck);
                } else if (i == 1) {
                    Intent shoulder = new Intent(upperbody.this, shoulder.class);
                    startActivity(shoulder);
                } else if (i == 2) {
                    Intent triceps = new Intent(upperbody.this, triceps.class);
                    startActivity(triceps);
                } else if (i == 3) {
                    Intent biceps = new Intent(upperbody.this, biceps.class);
                    startActivity(biceps);
                } else if (i == 4) {
                    Intent chest = new Intent(upperbody.this, chest.class);
                    startActivity(chest);
                } else if (i == 5) {
                    Intent traps = new Intent(upperbody.this, traps.class);
                    startActivity(traps);
                } else if (i == 6) {
                    Intent wrists = new Intent(upperbody.this, forearmAndWrists.class);
                    startActivity(wrists);
                } else {
                    Intent back = new Intent(upperbody.this, exercise.class);
                    startActivity(back);
                }
            }
        });


    }
}
