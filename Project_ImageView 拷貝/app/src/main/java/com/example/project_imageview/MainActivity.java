package com.example.project_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //圖片點擊監聽
        final ImageButton imageView = (ImageButton) findViewById(R.id.btn_change);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.pic_2);
                TextView sup =(TextView)findViewById(R.id.sup);
                sup.setText("代替月亮逞罰你");
            }
        });
    }
}