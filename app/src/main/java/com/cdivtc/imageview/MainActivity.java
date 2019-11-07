package com.cdivtc.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_netImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_netImage = findViewById(R.id.iv_netImage);
    }

    public void getNetImage(View view) {
        Glide.with(this).load("https://c-ssl.duitang.com/uploads/item/201807/12/20180712150223_uzijz.thumb.700_0.jpeg").into(iv_netImage);
 }

}
//"https://static.firefoxchina.cn/img/201711/7_5a0ba48885d170.png"
//"https://c-ssl.duitang.com/uploads/item/201807/12/20180712150032_vCNTP.thumb.700_0.jpeg"
//"https://c-ssl.duitang.com/uploads/item/201807/12/20180712150223_uzijz.thumb.700_0.jpeg"
//"https://c-ssl.duitang.com/uploads/item/201807/12/20180712150024_fMemz.thumb.700_0.png"