package com.haerul.popularnews;

//import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

import com.haerul.popularnews.R;
import com.haerul.popularnews.models.MainActivity3;

public class MainActivity2 extends AppCompatActivity implements OnClickListener{
    private CardView card1;
    private CardView card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card1 = (CardView) findViewById(R.id.card1);
        card2=(CardView) findViewById(R.id.card2);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.card1:
                i=new Intent(this,MainActivity.class);
                startActivity(i);
                break;
            case R.id.card2:
                i=new Intent(this, MainActivity3.class);
                startActivity(i);
                break;
        }
    }
}