package com.modelingbrain.home.detailModel.fragments;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.modelingbrain.home.R;

public class StageFragmentView extends StageFragment {


    @Override
    protected View initializeData(LayoutInflater inflater, ViewGroup parentViewGroup) {

        View rootView = inflater.inflate(R.layout.fragment_list, parentViewGroup, false);

        linLayout = (LinearLayout) rootView.findViewById(R.id.fragment_linear_layout);
        linLayout.setBackgroundColor(generalModelColor);

        createElement(getResources().getString(R.string.model_name), QA.QUESTION);
        createElement(model.getName(), QA.ANSWER);
        for (int i = 0; i < model.getModelID().getSize(); i++) {
            createElement(getResources().getStringArray(model.getModelID().getResourceQuestion())[1 + i], QA.QUESTION);
            createElement(model.getAnswer(i), QA.ANSWER);
        }
        return rootView;
    }

    @Override
    public void savingModelData() {
    }

}