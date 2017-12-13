package com.example.admin.week6day2viewgroup.customeviews;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.week6day2viewgroup.R;

/**
 * Created by  Admin on 12/12/2017.
 */

public class CompoundView extends LinearLayout {
    Button buttonOne;
    Button buttonTwo;
    TextView tvTestview;
    public CompoundView(Context context) {
        super(context);
        initializeView(context);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initializeView(context);
    }

    public CompoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeView(context);
    }

public void initializeView(Context context){
    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    assert inflater != null;
    inflater.inflate(R.layout.viewgroup_practice,this);
}

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        buttonOne = this.findViewById(R.id.buttonOne);

        buttonTwo = this.findViewById(R.id.buttonTwo);
        buttonOne.setBackgroundColor(Color.parseColor("#000000"));
        buttonOne.setTextColor(Color.parseColor("#ffffff"));
        buttonOne.setText("Change Text");
        buttonTwo.setBackgroundColor(Color.parseColor("#00FF55"));
        buttonTwo.setText("Color/Background");
        tvTestview = this.findViewById(R.id.tvFirst);
        buttonOne.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTestview.setText("Great");
            }
        });

        buttonTwo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTestview.setText("Dont forget toPractice");
                tvTestview.setBackgroundColor(Color.parseColor("#235523"));
            }
        });


    }
}
