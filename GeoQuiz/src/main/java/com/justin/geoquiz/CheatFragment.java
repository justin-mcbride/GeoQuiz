package com.justin.geoquiz;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Justin on 11/21/13.
 */
public class CheatFragment extends Fragment {
    public CheatFragment() {
    }

    private static final String TAG = "CheatFragment";

    private boolean mAnswer;
    private Button mCheatButton;
    private TextView mTextView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_cheat, container, false);
        mCheatButton = (Button)rootView.findViewById(R.id.showAnswerButton);
        mTextView = (TextView)rootView.findViewById(R.id.answerTextView);

        mAnswer = ((QuizActivity)getActivity()).getAnswer();

        mCheatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer) mTextView.setText(R.id.true_button);
                else mTextView.setText(R.id.false_button);
            }
        });
        return rootView;
    }

}
