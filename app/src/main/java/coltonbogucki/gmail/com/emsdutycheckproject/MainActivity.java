package coltonbogucki.gmail.com.emsdutycheckproject;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button dutyCheckBtn = (Button) findViewById(R.id.dutyCheckBtn);
        dutyCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dutyIntent = new Intent(getApplicationContext(), DutyCheck.class);
                startActivity(dutyIntent);
            }
        });

        Button restockBtn = (Button) findViewById(R.id.restockBtn);
        restockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restockIntent = new Intent(getApplicationContext(), Restock.class);
                startActivity(restockIntent);
            }
        })  ;




    }
}
