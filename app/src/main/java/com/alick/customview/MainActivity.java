package com.alick.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.alick.customview.exercise.TestPaintActivity;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private String[] strings=new String[]{"paint绘制"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,strings);
        listView= (ListView) findViewById(R.id.lv_main);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        startActivity(new Intent(MainActivity.this,TestPaintActivity.class));
                        break;
                    case 1:

                        break;
                }
            }
        });
    }
}
