package com.sec.dev.hydrate;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.sec.dev.hydrate.Adapter.QuestionAdapter;

public class DiagnoseActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private QuestionFragment questionFragment;
    private Button btnLihatDiagnose;


    private boolean[] answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnose);

        viewPager = findViewById(R.id.viewPagerDiagnose);
        btnLihatDiagnose = findViewById(R.id.btnLihatDiagnose);

        QuestionAdapter questionAdapter = new QuestionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(questionAdapter);
        viewPager.setOnPageChangeListener(new PagerListener());
        questionFragment = (QuestionFragment) (viewPager.getAdapter()).instantiateItem(viewPager,viewPager.getCurrentItem());

        btnLihatDiagnose.setOnClickListener(this);

        answer = new boolean[16];
    }

    public void setAnswer(int p1, int p2, int p3, boolean jawaban){
        this.answer[p1] = jawaban;
        update();
    }
    private void update(){
        questionFragment = (QuestionFragment) (viewPager.getAdapter()).instantiateItem(viewPager, viewPager.getCurrentItem());
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), ResultActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
        finish();
    }

    class PagerListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int i, float v, int i1) {
            if (i==15){
                btnLihatDiagnose.setEnabled(true);
            } else {
                btnLihatDiagnose.setEnabled(false);

            }
        }

        @Override
        public void onPageSelected(int i) {

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }
}
