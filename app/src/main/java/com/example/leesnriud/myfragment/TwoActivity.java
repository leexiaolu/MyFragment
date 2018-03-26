package com.example.leesnriud.myfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

import com.example.leesnriud.myfragment.fragment.Fragmentone;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Display dis = getWindowManager().getDefaultDisplay();
        if(dis.getWidth() > dis.getHeight())
        {
            Fragmentone f1 = new Fragmentone();
            getFragmentManager().beginTransaction().replace(R.id.fragment1, f1).commit();
        }

        else
        {
            Fragmentone f2 = new Fragmentone();
            getFragmentManager().beginTransaction().replace(R.id.fragment1, f2).commit();
        }
    }
}
