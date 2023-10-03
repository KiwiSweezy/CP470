package com.example.androidassignments;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import com.example.androidassignments.R.layout;


public final class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_main);
    }

    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume");
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onDestroy() {
        super.onDestroy();
    }
    /*protected void onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState);

    }

    protected void onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState);

    }*/
}
