package com.suhun.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Page3Activity extends AppCompatActivity {
    public String tag = Page2Activity.class.getSimpleName();
    Button goToPage2NoData, getGoToPage2WithData;
    TextView lotteryPage3;
    int lottery3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        Log.d(tag, "---Suhun Page3 onCreate---");
        goToPage2NoData = findViewById(R.id.goToPage2NoData);
        getGoToPage2WithData = findViewById(R.id.goToPage2WithData);
        lotteryPage3 = findViewById(R.id.lotteryPage3);
        lottery3 = getIntent().getIntExtra("Lottery", -1);
        lotteryPage3.setText(""+lottery3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "---Suhun Page3 onStart---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "---Suhun Page3 onRestart---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "---Suhun Page3 onResume---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "---Suhun Page3 onPause---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "---Suhun Page3 onStop---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "---Suhun Page3 onDestory---");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(tag, "---Suhun Page3 onBackPressed---");
    }

    public void goToPage2WithData(View view) {
        Log.d(tag, "---Suhun Page3 goToPage2WithData---");
        setResult(456);
        finish();
    }

    public void goToPage2NoData(View view) {
        Log.d(tag, "---Suhun Page3 goToPage2NoData---");
        finish();
    }
}