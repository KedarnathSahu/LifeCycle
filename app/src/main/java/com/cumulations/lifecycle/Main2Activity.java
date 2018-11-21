package com.cumulations.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView=findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            textView.setText(value);
            //The key argument here must match that used in the other activity
        }

        Log.d("@@@","Activity2 onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("@@@","Activity2 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("@@@","Activity2 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("@@@","Activity2 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("@@@","Activity2 onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("@@@","Activity2 onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("@@@","Activity2 onDestroy");
    }

    public void nextActivity(View view) {
        Intent intent=new Intent(this,Main3Activity.class);
        intent.putExtra("key","Second Activity");
        startActivity(intent);
    }
}
