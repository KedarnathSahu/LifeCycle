package com.cumulations.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    ImageView imageView1 , imageView2 ,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("@@@","Activity1 onCreate");

        imageView1=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image2);
        imageView3=findViewById(R.id.image3);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("@@@","Activity1 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("@@@","Activity1 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("@@@","Activity1 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("@@@","Activity1 onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("@@@","Activity1 onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("@@@","Activity1 onDestroy");
    }

    public void nextActivity(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("key","Second Activity");
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.image1:
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.GONE);
                break;
            case R.id.image2:
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.VISIBLE);
                break;
            case R.id.image3:
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);
                break;
        }
    }
}
