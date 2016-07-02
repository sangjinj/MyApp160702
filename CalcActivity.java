package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity implements View.OnClickListener{
    EditText et1, et2;
    Button btPlus, btMinus, btMulti, btDivide, btHome;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        btDivide = (Button) findViewById(R.id.btDivide);
        btMinus = (Button) findViewById(R.id.btMinus);
        btMulti = (Button) findViewById(R.id.btMulti);
        btPlus = (Button) findViewById(R.id.btPlus);
        btHome = (Button) findViewById(R.id.btHome);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        tvResult = (TextView) findViewById(R.id.tvResult);
        btHome.setOnClickListener(this);
        btDivide.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btPlus.setOnClickListener(this);





    }

    @Override
    public void onClick(View v) {
        System.out.println("---------------------");
        this.startActivity(new Intent(this,MainActivity.class));
//        switch (v.getId()){
//
//            case R.id.btHome :
//
//                break;
//
//
//
//        }
    }
}
