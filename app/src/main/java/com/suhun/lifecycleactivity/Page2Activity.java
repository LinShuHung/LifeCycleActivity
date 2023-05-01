package com.suhun.lifecycleactivity;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Page2Activity extends AppCompatActivity {
    public String tag = Page2Activity.class.getSimpleName();
    Button goToPage3NoData, goToPage3WithData;
    TextView lotteryNumText, dataFrom3;
    int page3data;
    private int lotteryNum;
    private ActivityResultLauncher startCallBackPage2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d(tag, "---Suhun Go Back Page2---");
                    page3data = result.getResultCode();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Log.d(tag, "---Suhun Page2 onCreate---");
        goToPage3NoData = findViewById(R.id.goToPage3NoData);
        goToPage3WithData = findViewById(R.id.goToPage3WithData);
        lotteryNumText = findViewById(R.id.lotteryPage2);
        dataFrom3 = findViewById(R.id.dataFromPage3);
        lotteryNum = new Random().nextInt(49) + 1;
        lotteryNumText.setText(""+ lotteryNum);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "---Suhun Page2 onStart---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "---Suhun Page2 onReStart---");
        dataFrom3.setText(""+page3data);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "---Suhun Page2 onResume---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "---Suhun Page2 onPause---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "---Suhun Page2 onStop---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "---Suhun Page2 onDestory---");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(tag, "---Suhun Page2 onBackPress---");
    }

    public void goToPage3NoData(View view) {
        Log.d(tag, "---Suhun Page2 goToPage3NoData press---");
        Intent intent = new Intent(this, Page3Activity.class);
        startActivity(intent);
    }

    public void goToPage3WithData(View view) {
        Log.d(tag, "---Suhun Page2 goToPage3WithData press---");
        Intent intent = new Intent(this, Page3Activity.class);
        intent.putExtra("Lottery", lotteryNum);
        startCallBackPage2.launch(intent);
    }

    public void goBackMain(View view) {
        finish();
    }
}