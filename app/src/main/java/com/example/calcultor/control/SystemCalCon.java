package com.example.calcultor.control;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calcultor.R;
import com.example.calcultor.control.unitcalcon.UnitcalAreaCon;
import com.example.calcultor.control.unitcalcon.UnitcalLenCon;
import com.example.calcultor.control.unitcalcon.UnitcalVolCon;

public class SystemCalCon extends AppCompatActivity {
    static TextView textView1;
    static TextView textView2;
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.calcul_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.systemcal_layout);
        textView1 = (TextView) findViewById(R.id.binary);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.simpleCal:
                item.setIntent(new Intent(SystemCalCon.this, SimpleCalCon.class));
                SystemCalCon.this.finish();
                break;
            case R.id.functionCal:
                item.setIntent(new Intent(SystemCalCon.this, FunctionCalCon.class));
                SystemCalCon.this.finish();
                break;
            case R.id.area:
                item.setIntent(new Intent(SystemCalCon.this, UnitcalAreaCon.class));
                SystemCalCon.this.finish();
                break;
            case R.id.length:
                item.setIntent(new Intent(SystemCalCon.this, UnitcalLenCon.class));
                SystemCalCon.this.finish();
                break;
            case R.id.volume:
                item.setIntent(new Intent(SystemCalCon.this, UnitcalVolCon.class));
                SystemCalCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClickText(View view) {
        TextView textView = (TextView)view;
        switch (view.getId()){
            case R.id.binary:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 =(TextView) findViewById(R.id.binary);
                binenable();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.octal:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 =(TextView) findViewById(R.id.octal);
                octenable();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.decimal:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 =(TextView) findViewById(R.id.decimal);
                decenable();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.hexadecimal:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 =(TextView) findViewById(R.id.hexadecimal);
                hexenable();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP,40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
        }
    }
    public void onClick(View view){
        Button button = (Button)view;
        switch(view.getId()){
            case R.id.delete:
                if(textView1.getText().toString().equals("")){
                    break;
                }else {
                    textView1.setText(textView1.getText().toString().substring(0, textView1.getText().toString().length() - 1));
                    switch (textView1.getId()) {
                        case R.id.binary:
                            systemcalBin();
                            break;
                        case R.id.octal:
                            systemcalOct();
                            break;
                        case R.id.decimal:
                            systemcalDec();
                            break;
                        case R.id.hexadecimal:
                            systemcalHex();
                            break;
                    }
                }
                break;
            case R.id.clean:
                clean();
                break;
            default:
                textView1.setText(textView1.getText().toString()+button.getText().toString());
                switch (textView1.getId()){
                    case R.id.binary:
                        systemcalBin();
                        break;
                    case R.id.octal:
                        systemcalOct();
                        break;
                    case R.id.decimal:
                        systemcalDec();
                        break;
                    case R.id.hexadecimal:
                        systemcalHex();
                        break;
                }
        }
    }
    public void systemcalBin(){
        String str = new String();
        if(textView1.getText().toString().equals("")){
            str="0";
        }else {
            str = textView1.getText().toString();
        }
        int strdec = Integer.parseInt(str,2);
        textView2 = (TextView) findViewById(R.id.octal);
        textView2.setText(Integer.toOctalString(strdec));
        textView2 = (TextView) findViewById(R.id.decimal);
        textView2.setText(String.valueOf(strdec));
        textView2 = (TextView) findViewById(R.id.hexadecimal);
        textView2.setText(Integer.toHexString(strdec));
    }
    public void systemcalOct(){
        String str = new String();
        if(textView1.getText().toString().equals("")){
            str="0";
        }else {
            str = textView1.getText().toString();
        }
        int strdec = Integer.parseInt(str,8);
        textView2 = (TextView) findViewById(R.id.binary);
        textView2.setText(Integer.toBinaryString(strdec));
        textView2 = (TextView) findViewById(R.id.decimal);
        textView2.setText(String.valueOf(strdec));
        textView2 = (TextView) findViewById(R.id.hexadecimal);
        textView2.setText(Integer.toHexString(strdec));
    }
    public void systemcalDec(){
        String str = new String();
        if(textView1.getText().toString().equals("")){
            str="0";
        }else {
            str = textView1.getText().toString();
        }
        int strdec = Integer.parseInt(str,10);
        textView2 = (TextView) findViewById(R.id.octal);
        textView2.setText(Integer.toOctalString(strdec));
        textView2 = (TextView) findViewById(R.id.binary);
        textView2.setText(Integer.toBinaryString(strdec));
        textView2 = (TextView) findViewById(R.id.hexadecimal);
        textView2.setText(Integer.toHexString(strdec));
    }
    public void systemcalHex(){
        String str = new String();
        if(textView1.getText().toString().equals("")){
            str="0";
        }else {
            str = textView1.getText().toString();
        }
        int strdec = Integer.parseInt(str,16);
        textView2 = (TextView) findViewById(R.id.octal);
        textView2.setText(Integer.toOctalString(strdec));
        textView2 = (TextView) findViewById(R.id.decimal);
        textView2.setText(String.valueOf(strdec));
        textView2 = (TextView) findViewById(R.id.binary);
        textView2.setText(Integer.toBinaryString(strdec));
    }

    public void clean(){
        textView2 = (TextView) findViewById(R.id.binary);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.octal);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.decimal);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.hexadecimal);
        textView2.setText("");
    }
    public void binenable(){
        Button but;
        but = (Button) findViewById(R.id.a);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.b);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.c);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.d);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.e);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.f);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.two);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.three);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.four);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.five);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.six);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.seven);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.eight);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.nine);
        but.setEnabled(false);
    }
    public void octenable(){
        Button but;
        but = (Button) findViewById(R.id.a);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.b);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.c);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.d);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.e);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.f);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.two);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.three);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.four);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.five);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.six);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.seven);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.eight);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.nine);
        but.setEnabled(false);
    }
    public void decenable(){
        Button but;
        but = (Button) findViewById(R.id.a);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.b);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.c);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.d);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.e);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.f);
        but.setEnabled(false);
        but = (Button) findViewById(R.id.two);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.three);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.four);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.five);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.six);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.seven);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.eight);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.nine);
        but.setEnabled(true);
    }
    public void hexenable(){
        Button but;
        but = (Button) findViewById(R.id.a);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.b);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.c);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.d);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.e);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.f);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.two);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.three);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.four);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.five);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.six);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.seven);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.eight);
        but.setEnabled(true);
        but = (Button) findViewById(R.id.nine);
        but.setEnabled(true);
    }
}

