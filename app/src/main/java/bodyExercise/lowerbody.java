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
import lowerbody.burpee;
import lowerbody.calfMuscle;
import lowerbody.hamstrings;
import lowerbody.quadriceps;

public class lowerbody extends AppCompatActivity {

    ListView listView;

    String[] nameArray = {"Quadriceps", "Hamstrings", "Calf Muscles", "Burpee"};

    Integer[] imageArray = {
            R.drawable.abs1,
            R.drawable.shoulder1,
            R.drawable.triceps1,
            R.drawable.biceps1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowerbody);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, imageArray);
        listView = findViewById(R.id.list);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    Intent neck = new Intent(lowerbody.this, quadriceps.class);
                    startActivity(neck);
                } else if (i == 1) {
                    Intent shoulder = new Intent(lowerbody.this, hamstrings.class);
                    startActivity(shoulder);
                } else if (i == 2) {
                    Intent triceps = new Intent(lowerbody.this, calfMuscle.class);
                    startActivity(triceps);
                } else if (i == 3) {
                    Intent biceps = new Intent(lowerbody.this, burpee.class);
                    startActivity(biceps);
                } else {
                    Intent back = new Intent(lowerbody.this, exercise.class);
                    startActivity(back);
                }
            }
        });
    }
}
