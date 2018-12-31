package com.sec.dev.hydrate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private View rootView;
    private TextView question;
    private RadioButton rbAnswer1, rbAnswer2;
    private RadioGroup radioGroup;

    private Bundle bundle;

    private String dQuestion;
    private int p1, p2, p3;

    private DiagnoseActivity diagnoseActivity;

    public QuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_question, container, false);

        bundle = getArguments();
        dQuestion = bundle.getString("question");
        p1 = bundle.getInt("p1");
        p2 = bundle.getInt("p2");
        p3 = bundle.getInt("p3");


        diagnoseActivity = (DiagnoseActivity) getActivity();
        question = rootView.findViewById(R.id.diagnoseQuestion);
        rbAnswer1 = rootView.findViewById(R.id.rbAnswer1);
        rbAnswer2 = rootView.findViewById(R.id.rbAnswer2);
        radioGroup = rootView.findViewById(R.id.rgDiagnoseAnswer);
        Log.i("index", String.valueOf(dQuestion));
        question.setText(dQuestion);
        radioGroup.setOnCheckedChangeListener(this);

        return rootView;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == rbAnswer1.getId()){
            diagnoseActivity.setAnswer(p1, p2, p3, true);
        }
        else {
            diagnoseActivity.setAnswer(p2, p2, p3, false);
        }
    }

    public int getIndex() {
        return p1;
    }
}
