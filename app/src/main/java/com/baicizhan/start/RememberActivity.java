package com.baicizhan.start;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.res.ResourcesCompat;

import java.util.Arrays;
import java.util.List;

public class RememberActivity extends AppCompatActivity {

    // 显示的文本内容
    private String showText = "";
    private TextView content;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remember);
        content = (TextView) findViewById(R.id.content);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.fansong);
        content.setTypeface(typeface);
        picture = (ImageView) findViewById(R.id.imageView2);
        final Button button_next = (Button) findViewById(R.id.button_next);

        SerialNumberEnums[] values = SerialNumberEnums.values();
        List<SerialNumberEnums> serialNumber = Arrays.asList(values);
        int size = serialNumber.size();

        String packageName = this.getPackageName();
        Resources resources = this.getResources();

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.btnsound);


        button_next.setOnClickListener(new View.OnClickListener() {
            int length = size;
            int flag = 0;//控制展示完一对;

            @Override
            public void onClick(View v) {

                mediaPlayer.start();

                if (length > 0) {
                    if (flag == 0) {
                        refreshTextDes(serialNumber.get(length - 1).getDesc());
                        flag = 1;
                        clearPict();
                    } else {
                        String code = serialNumber.get(length - 1).getCode();
                        String name = serialNumber.get(length - 1).name();
                        if (!code.equals("0")) { //控制展示的是文本还是图片
                            refreshText(code);
                            clearPict();
                        } else {
                            int drawable = resources.getIdentifier(name, "drawable", packageName);
                            refreshPicture(drawable);
                            clear();
                        }
                        length--;
                        flag = 0;
                    }
                } else {
                    length = size;
                }


            }
        });
    }

    // 清空并初始化
    private void clear() {
        refreshText("");
    }

    private void clearPict() {
        picture.setImageBitmap(null);
    }

    // 刷新文本显示
    private void refreshTextDes(String text) {
        showText = text;
        content.setTextSize(40);
        content.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        content.setText(showText);
    }

    private void refreshText(String text) {
        showText = text;
        content.setTextSize(40);
        content.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        content.setText(showText);
    }

    private void refreshPicture(Integer text) {
        picture.setImageResource(text);
    }

}
