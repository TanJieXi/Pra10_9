package com.pra10_9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import me.iwf.photopicker.widget.MultiPickResultView;

public class MainActivity extends AppCompatActivity {
    private MultiPickResultView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (MultiPickResultView) findViewById(R.id.recycler_view);
        recyclerView.init(this, MultiPickResultView.ACTION_SELECT, null);


//onActivityResult里一行代码回调

    }
    public void btnStart(View view) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        recyclerView.onActivityResult(requestCode, resultCode, data);

        ArrayList<String> photos = recyclerView.getPhotos();
        Log.i("info","==========" + photos.toString());

    }


}
