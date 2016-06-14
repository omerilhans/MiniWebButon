package android.projects.miniwebwithfragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public String gidilecekAdres = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doOp(View v) {
        switch (v.getId()) {
            case R.id.button1:
                gidilecekAdres = "http://www.wissenakademie.com";
                break;
            case R.id.button2:
                gidilecekAdres = "http://www.osym.gov.tr";
                break;
            case R.id.button3:
                gidilecekAdres = "http://www.iett.gov.tr";
                break;
            case R.id.button4:
                gidilecekAdres = "http://iskur.gov.tr";
                break;
            case R.id.button5:
                gidilecekAdres = "http://www.tcdd.gov.tr";
                break;
        }
        // Bir Activity'deki Fragment Acma Kapa Degistirme
        // Islemlerinizden Sorumlu Olan Manager.
        FragmentManager fm = getSupportFragmentManager();

        // Bir Fragment Acmak / Eskisini Kapatmak Icin
        FragmentTransaction ft = fm.beginTransaction();
        WebFragment wf = new WebFragment();


        ft.replace(R.id.fragment_area, wf);
        ft.commit();
    }
}
