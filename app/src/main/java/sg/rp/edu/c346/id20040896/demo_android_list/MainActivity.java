package sg.rp.edu.c346.id20040896.demo_android_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> al;
    ArrayAdapter<AndroidVersion> aa;
    CustomAdaptor ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.ListViewLV);
        al = new ArrayList<AndroidVersion>();
        al.add( new AndroidVersion("Pie" , "9.0"));
        al.add(new AndroidVersion("Orea" , "8.0 -8.1"));
        al.add(new AndroidVersion("Nougat" , "7.0"));
        al.add(new AndroidVersion("Marshmallow" , "6.0"));
        aa = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, al);
        ca = new CustomAdaptor(this, R.layout.row , al);
        lv.setAdapter(ca);
    }
}