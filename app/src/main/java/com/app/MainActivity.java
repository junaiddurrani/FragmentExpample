package com.app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClick(View view) {
        BlueFragment blueFragment = new BlueFragment();
        GreenFragment greenFragment = new GreenFragment();
        switch (view.getId()) {
            case R.id.btnGreen:
                changeFragment(greenFragment);
                break;
            case R.id.btnBlue:
                changeFragment(blueFragment);
                break;
                default:
                    break;
        }
    }

    private void changeFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.container, fragment).commit();
    }

}
