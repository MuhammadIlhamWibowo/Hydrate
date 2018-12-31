package com.sec.dev.hydrate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnMulaiDiagnosaMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMulaiDiagnosaMain = findViewById(R.id.btnMulaiDiagnosaMain);
        btnMulaiDiagnosaMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DiagnoseActivity.class);
                startActivity(intent);
            }
        });
    }

}
