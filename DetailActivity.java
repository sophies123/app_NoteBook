package com.hdu.a15061103.test201801;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;

public class DetailActivity extends AppCompatActivity {
    private ImageButton addButton;
    private Context mContext;
  //标题，内容，日期，天气
    static  ArrayList<Note> mNotes = new ArrayList<>();


  /*  static private ArrayList<String> content = new ArrayList<>();
    static private ArrayList<String> date = new ArrayList<>();
    static private ArrayList<String> weather = new ArrayList<>();*/
/*

    String[] contents={getString(R.string.contents1),getString(R.string.contents2),getString(R.string.contents3),getString(R.string.contents4),getString(R.string.contents5)};
    String[] dates={getString(R.string.date1),getString(R.string.date2),getString(R.string.date3),getString(R.string.date4),getString(R.string.date5)};
    String[] weathers={getString(R.string.weather1),getString(R.string.weather2),getString(R.string.weather3),getString(R.string.weather4),getString(R.string.weather5)};

*/


    private ListView listView;
    private SimpleAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        listView=(ListView)findViewById(R.id.activity_list);


        // 创建Student对象
        Note note1 = new Note("去超市购买日用品","2018年1月6日","晴");
        Note note2 = new Note("漫步西子湖畔","2018年11月5日","雨");
        Note note3 = new Note("社团会议","2018年2月9日","多云");
        Note note4 = new Note("如何定制首页","2018年2月5日","阴天");
        Note note5= new Note("2017年日志","2018年2月20日","大雪");

        mNotes.add(note1);
        mNotes.add(note2);
        mNotes.add(note3);
        mNotes.add(note4);
        mNotes.add(note5);

/*
        mNotes.add(new Note("去超市购买日用品","2018年1月6日","晴"));
        mNotes.add(new Note("漫步西子湖畔","2018年11月5日","雨"));
        mNotes.add(new Note("社团会议","2018年2月9日","多云"));
        mNotes.add(new Note("如何定制首页","2018年2月5日","阴天"));
        mNotes.add(new Note("2017年日志","2018年2月20日","大雪"));*/





/*        for(int i=0;i<5;i++){
            content.add(contents[i]);
        }
        for(int i=0;i<5;i++){
            date.add(dates[i]);
        }
        for(int i=0;i<5;i++){
            weather.add(weathers[i]);
        }*/


        final ArrayList<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for(int i = 0; i< mNotes.size(); i++)
        {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("content", mNotes.get(i));
            Log.e("mNotes1",mNotes.get(i).toString());
            //把列表项加进列表集合
            listItems.add(map);
        }
        showItem();
        addButton=(ImageButton)findViewById(R.id.add_Button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this,"暂未提供此功能", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void showItem() {
        List<Map<String, Object>> listitem = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < mNotes.size(); i++) {

            Map<String, Object> showitem = new HashMap<String, Object>();
            showitem.put("content", mNotes.get(i).toString());
            //Log.e("show1",Name.get(i));
            /*showitem.put("date", mNotes.get(i+1));
            //Log.e("show1",Sex.get(i));
            showitem.put("weather", mNotes.get(i+3));*/
            //Log.e("show1",Age.get(i));
            listitem.add(showitem);
            //创建一个simpleAdapter
/*
            SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.list_item, new String[]{"content", "date", "weather"}, new int[]{R.id.text_content, R.id.date, R.id.weather});
*/
            SimpleAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.list_item, new String[]{"content"}, new int[]{R.id.text_content});

            listView = (ListView) findViewById(R.id.activity_list);
            listView.setAdapter(myAdapter);
        }
    }
}
