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

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();
    private ActivityResultLauncher startCallBackMain = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d(tag, "---Suhun Go Back Main Page---");

                }
            });
    Button goToPage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goToPage2 = findViewById(R.id.goToPage2);
        Log.d(tag, "---Suhun Main onCreate---");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "---Suhun Main onStart---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "---Suhun Main onReStart---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "---Suhun Main onResume---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "---Suhun Main onPause---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "---Suhun Main onStop---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "---Suhun Main onDestory---");
    }

    public void toToPage2(View view) {
        Intent intent = new Intent(this, Page2Activity.class);
        startCallBackMain.launch(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(tag, "---Suhun Main onBackPress---");
    }
}