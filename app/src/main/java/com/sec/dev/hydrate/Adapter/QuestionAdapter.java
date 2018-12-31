package com.sec.dev.hydrate.Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import android.view.View;
import android.widget.ImageView;

import com.sec.dev.hydrate.Question.QuestionData;
import com.sec.dev.hydrate.Question.QuestionModel;
import com.sec.dev.hydrate.QuestionFragment;

public class QuestionAdapter extends FragmentStatePagerAdapter {

    private ArrayList<QuestionModel> questionModels;

    public QuestionAdapter(FragmentManager fm) {
        super(fm);
        questionModels = new QuestionData().getQuestionModels();
    }

    @Override
    public Fragment getItem(int i) {
        return instance(questionModels.get(i).getQuestion(),i);
    }

    private static QuestionFragment instance(String question, int p1){
        QuestionFragment questionFragment = new QuestionFragment();

        Bundle args = new Bundle();
        args.putString("question",question);
        args.putInt("p1",p1);
        questionFragment.setArguments(args);

        return questionFragment;
    }

    @Override
    public int getCount() {
        return questionModels.size();
    }
}
