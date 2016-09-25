package com.example.administrator.udacity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/25 0025.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.home_Layout);
        for (int i = 0, lenght = viewGroup.getChildCount(); i < lenght; i++) {
            viewGroup.getChildAt(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.populat_movies:
                showToast(view);
                break;
            case R.id.stocke_hawk:
                showToast(view);
                break;
            case R.id.build_it_bigger:
                showToast(view);
                break;
            case R.id.make_your_app_material:
                showToast(view);
                break;
            case R.id.go_ubiqueitous:
                showToast(view);
                break;
            case R.id.capstone:
                showToast(view);
                break;
            default:
                break;
        }
    }

    private void showToast(View view){
        String msg = "This button will launch my %s app";
        if(view instanceof Button){
            msg = String.format(msg, ((Button) view).getText().toString());
        }
        showToast(msg);
    }

    private void showToast(String msgStr){
        Toast.makeText(HomeActivity.this, msgStr, Toast.LENGTH_SHORT).show();
    }
}
