package cn.georgeyang.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cn.georgeyang.fragment.api11.Api11Activity;
import cn.georgeyang.fragment.v4.V4Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_v4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, V4Activity.class));
            }
        });
        findViewById(R.id.btn_api11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Api11Activity.class));
            }
        });
    }
}
