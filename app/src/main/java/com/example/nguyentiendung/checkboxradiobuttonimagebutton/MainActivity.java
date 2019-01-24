package com.example.nguyentiendung.checkboxradiobuttonimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_name;
    RadioButton rd_Male;
    RadioButton rd_Fermale;
    CheckBox ck_game;
    CheckBox ck_yellow;
    CheckBox ck_book;
    CheckBox ck_movie;
    ImageButton img_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWddget();
        img_button.setOnClickListener(this);
    }
    public void initWddget(){
        tv_name=(TextView)findViewById(R.id.tv_name);
        rd_Male=(RadioButton) findViewById(R.id.rb_Male);
        rd_Fermale=(RadioButton)findViewById(R.id.rd_Fermale);
        ck_game=(CheckBox)findViewById(R.id.ck_game);
        ck_yellow=(CheckBox)findViewById(R.id.ck_yellow);
        ck_book=(CheckBox)findViewById(R.id.ck_book);
        ck_movie=(CheckBox)findViewById(R.id.ck_movie);
        img_button=(ImageButton)findViewById(R.id.img_button);
    }

    @Override
    public void onClick(View v) {
        String sologan="";
        sologan=tv_name.getText().toString();
        if(rd_Male.isChecked()){//dc chon hay k
            sologan=sologan+rd_Male.getText().toString()+" ";
        }
        else {
            sologan=sologan+rd_Fermale.getText().toString()+" ";
        }
        if(ck_game.isChecked()){
            sologan=sologan+ck_game.getText()+" ";
        }
        if(ck_yellow.isChecked()){
            sologan=sologan+ck_yellow.getText()+" ";
        }
        if(ck_book.isChecked()){
            sologan=sologan+ck_book.getText()+" ";
        }
        if(ck_movie.isChecked()){
            sologan=sologan+ck_movie.getText()+" ";
        }
        Toast.makeText(MainActivity.this,sologan, Toast.LENGTH_SHORT).show();
    }
}
