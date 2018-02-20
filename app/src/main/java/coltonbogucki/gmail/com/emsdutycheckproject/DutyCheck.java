package coltonbogucki.gmail.com.emsdutycheckproject;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class DutyCheck extends AppCompatActivity {
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duty_check);

        ListView checkList = (ListView) findViewById(R.id.checkList);

        Resources res = getResources();
        items = res.getStringArray(R.array.items);

        ItemAdapter itemAdapter = new ItemAdapter(this, items);
        checkList.setAdapter(itemAdapter);

        Button finishCheckBtn = (Button) findViewById(R.id.findCheckBtn);
        finishCheckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }


        });
    }
}
