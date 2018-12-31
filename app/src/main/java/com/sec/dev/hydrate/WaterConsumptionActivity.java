package com.sec.dev.hydrate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WaterConsumptionActivity extends AppCompatActivity {

    private Button btnShowWaterConsumption, btnHomeWaterConsumption;
    private EditText textBeratWaterConsumption;
    private TextView textVolume;

    private int berat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_consumption);

        btnShowWaterConsumption = findViewById(R.id.btnShowWaterConsumption);
        btnHomeWaterConsumption = findViewById(R.id.btnHomeWaterConsumption);
        textBeratWaterConsumption = findViewById(R.id.textBeratWaterConsumption);
        textVolume = findViewById(R.id.textVolume);

        btnHomeWaterConsumption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), LandingActivity.class));
                finish();
            }
        });

        btnShowWaterConsumption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                berat = Integer.parseInt(textBeratWaterConsumption.getText().toString());

                int volume = getResult(berat);

                textVolume.setText("" + volume);
            }
        });
    }

    public int getResult(int berat) {
        int volume;

        volume = 1000 + 500 + ((berat - 20) * 20);

        return volume;
    }
}
