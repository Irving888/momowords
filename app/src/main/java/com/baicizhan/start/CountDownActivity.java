package com.baicizhan.start;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class CountDownActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.countdown);
//    }

    private final static int COUNT = 1;
    private final static int TOTAL_TIME_24 = 24;
    private TextView textViewTime24;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countdown);
        textViewTime24=(TextView)findViewById(R.id.textViewTime24);//24秒倒计时
        final Button button_start_timer = (Button)findViewById(R.id.button_start_timer);
        button_start_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = button_start_timer.getText().toString();//获取按钮字符串
                if(str.equals("开始")){ //切换按钮文字
                    button_start_timer.setText("暂停");
                    initView();
                }
                else{
                    button_start_timer.setText("开始");
                    timer.cancel();//终止线程
                }
            }
        });
    }
    public void initView(){
        //countDown = (TextView) findViewById(R.id.textViewTime24);
        timer = new Timer();
        /**
         * 每一秒发送一次消息给handler更新UI
         * schedule(TimerTask task, long delay, long period)
         */
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(COUNT);
            }
        }, 0, 1000);
    }
    @SuppressLint("HandlerLeak")
    private final Handler handler = new Handler(){
        int num = TOTAL_TIME_24;
        public void handleMessage(android.os.Message msg) {
            if (msg.what == COUNT) {
                textViewTime24.setText(String.valueOf(num));
                if (num == 0)
                    timer.cancel();//0秒结束
                num--;
                if(num < 0){
                    num = TOTAL_TIME_24;
                }
            }
        };
    };
}
