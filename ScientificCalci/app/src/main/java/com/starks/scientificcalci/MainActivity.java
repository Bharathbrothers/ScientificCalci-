package com.starks.scientificcalci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.starks.scientificcalci.R.id.textview;

public class MainActivity extends AppCompatActivity {

    private TextView screen = (TextView)findViewById(textview);
    private String str;
    private String str1;
    private String str2;
    private String sign;
    private double a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str=" ";
    }
    public void onClick(View v)
    {
// 1 2 3 4 5 6 7 8 9 0 .
        Button button = (Button) v;
        str +=button.getText().toString();
        if(str.equals("."))
        {
            if (str.equals(".")) {
                str ="";
                screen.setText(str);
            }
        }
        screen.setText(str);

        a= Double.parseDouble(str);

    }
    public void signs(View v)
    {
    // + - * / % !
        Button button = (Button) v;
        sign= button.getText().toString();
        screen.setText(sign);
    }
    public void calculate(View v)
    {
        str1= screen.getText().toString();
        b= Double.parseDouble(str1);
        c=a;
        if(sign.equals("+")) {
            d= (a+b);
        }
        else if(sign.equals("-")){
            d=(a-b);
        }
        else if(sign.equals("*")){
            d=(a-b);
        }
        else if(sign.equals("/")){
            d=(a-b);
        }
        else if(sign.equals("%")){
            d=(a-b);
        }
        else if(sign.equals("!")){
            d=(a-b);
        }
    }
    public void extra(View v){

        // log ln sin sin-1 cos cos -1 tan tan-1
    }
    public void braces(View v){

        // (   )
    }
    public void on(View v){
 // on
    }
    public void delete(View v){
// backspace

    }
    public void clear(View v){
// all clear
        str="";
    }
}
