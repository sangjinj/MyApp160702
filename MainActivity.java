package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btCalc,btCalendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
            메인화면에서 계산기, 달력보기로 분기하는 화면을 만든다.
             2016.07.02
         */
        btCalc = (Button) findViewById(R.id.btCalc);    //  계산기
        btCalendar = (Button) findViewById(R.id.btCalendar);    // 달력 보기
        btCalc.setOnClickListener(this);
        btCalendar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){

                case R.id.btCalc :
                    this.startActivity(new Intent(this,CalcActivity.class));
                    break;

                case R.id.btCalendar :
                    this.startActivity(new Intent(this, CalendarActivity.class));
                    break;






            }
    }
}
