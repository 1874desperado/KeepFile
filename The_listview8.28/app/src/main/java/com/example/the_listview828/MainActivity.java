package com.example.the_listview828;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
   private List<Buju> data=new ArrayList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listView = (ListView) findViewById(R.id.listview001);
        BujuAdapter adapter=new BujuAdapter(MainActivity.this,R.layout.tpview,data);
        listView.setAdapter(adapter);
    }
   private void init(){
       for (int i=0;i<20;i++){
           Buju aaa=new Buju("666666661111666666633333336",R.mipmap.ic_launcher);
           data.add(aaa);
       }
   }
}
