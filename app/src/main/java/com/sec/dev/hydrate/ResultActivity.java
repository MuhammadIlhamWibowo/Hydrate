package com.sec.dev.hydrate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sec.dev.hydrate.Question.QuestionData;
import com.sec.dev.hydrate.Question.QuestionModel;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private TextView textPersentaseRinganResult, textPersentaseSedangResult, textPersentaseAkutResult;
    private TextView result;

    private Button btnDoneResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textPersentaseRinganResult = findViewById(R.id.textPersentaseRinganResult);
        textPersentaseSedangResult = findViewById(R.id.textPersentaseSedangResult);
        textPersentaseAkutResult = findViewById(R.id.textPersentaseAkutResult);

        result = findViewById(R.id.textResult);

        btnDoneResult = findViewById(R.id.btnDoneResult);
        btnDoneResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), WaterConsumptionActivity.class));
            }
        });

        Bundle bundle = getIntent().getExtras();
        boolean[] answer = bundle.getBooleanArray("answer");
        int point1 = 0, point2 = 0, point3 = 0;

        ArrayList<QuestionModel> questionModels = new QuestionData().getQuestionModels();

        for (int i = 0; i < answer.length; i++) {
            if (answer[i]) {
                point1 = point1 + questionModels.get(i).getP1();
                point2 = point2 + questionModels.get(i).getP2();
                point3 = point3 + questionModels.get(i).getP3();
            }
        }

        int total = point1 + point2 + point3;

//        if (point1 > point2 || point1 > point3) {
//
//            double percentage1 = point1 * 100 / total;
//            double percentage2 = point2 * 100 / total;
//            double percentage3 = point3 * 100 / total;
//            textPersentaseRinganResult.setText(String.valueOf(percentage1));
//            textPersentaseSedangResult.setText(String.valueOf(percentage2));
//            textPersentaseAkutResult.setText(String.valueOf(percentage3));
//
//            result.setText("Dehidrasi Ringan");
//        } else if (point2 > point1 || point2 > point3) {
//
//            double percentage1 = point1 * 100 / total;
//            double percentage2 = point2 * 100 / total;
//            double percentage3 = point3 * 100 / total;
//            textPersentaseRinganResult.setText(String.valueOf(percentage1));
//            textPersentaseSedangResult.setText(String.valueOf(percentage2));
//            textPersentaseAkutResult.setText(String.valueOf(percentage3));
//
//            result.setText("Dehidrasi Sedang");
//        } else if (point3 > point1 || point3 > point2) {
//
//            double percentage1 = point1 * 100 / total;
//            double percentage2 = point2 * 100 / total;
//            double percentage3 = point3 * 100 / total;
//            textPersentaseRinganResult.setText(String.valueOf(percentage1));
//            textPersentaseSedangResult.setText(String.valueOf(percentage2));
//            textPersentaseAkutResult.setText(String.valueOf(percentage3));
//
//            result.setText("Dehidrasi Akut");
//        } else {
//            result.setText("Tidak mengalami dehidrasi");
//        }

        if (point1 > point2) {

            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Ringan");

            if (point1 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Ringan");

            } else if (point2 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if(point2 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if (point3 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            } else if (point3 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            }

        } else if(point1 > point3) {

            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Ringan");

            if (point1 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Ringan");

            } else if (point2 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if(point2 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if (point3 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            }

        } else if (point2 > point1) {

            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Ringan");

            if (point2 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if (point3 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            } else if (point3 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            }

        } else if (point2 > point3) {

            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Sedang");

            if (point1 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Rendah");
            } else if (point1 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Rendah");
            } else if (point2 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            }

        } else if (point3 > point1) {
            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Akut");

            if (point2 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Sedang");
            } else if (point3 > point2) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            }
        } else if (point3 > point2) {
            double percentage1 = point1 * 100 / total;
            double percentage2 = point2 * 100 / total;
            double percentage3 = point3 * 100 / total;
            textPersentaseRinganResult.setText(String.valueOf(percentage1));
            textPersentaseSedangResult.setText(String.valueOf(percentage2));
            textPersentaseAkutResult.setText(String.valueOf(percentage3));

            result.setText("Dehidrasi Akut");

            if (point1 > point3) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Rendah");
            } else if (point3 > point1) {
                percentage1 = point1 * 100 / total;
                percentage2 = point2 * 100 / total;
                percentage3 = point3 * 100 / total;
                textPersentaseRinganResult.setText(String.valueOf(percentage1));
                textPersentaseSedangResult.setText(String.valueOf(percentage2));
                textPersentaseAkutResult.setText(String.valueOf(percentage3));

                result.setText("Dehidrasi Akut");
            }
        } else {
            result.setText("Tidak mengalami dehidrasi");
        }
    }
}
