package com.example.calcultor.control.unitcalcon;

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
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calcultor.R;
import com.example.calcultor.control.FunctionCalCon;
import com.example.calcultor.control.SimpleCalCon;
import com.example.calcultor.control.SystemCalCon;

public class UnitcalLenCon extends AppCompatActivity {
    static TextView textView1;
    static TextView textView2;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calcul_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unitcallen_layout);
        textView1 = (TextView) findViewById(R.id.lmm);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simpleCal:
                item.setIntent(new Intent(UnitcalLenCon.this, SimpleCalCon.class));
                UnitcalLenCon.this.finish();
                break;
            case R.id.functionCal:
                item.setIntent(new Intent(UnitcalLenCon.this, FunctionCalCon.class));
                UnitcalLenCon.this.finish();
                break;
            case R.id.systemCal:
                item.setIntent(new Intent(UnitcalLenCon.this, SystemCalCon.class));
                UnitcalLenCon.this.finish();
                break;
            case R.id.area:
                item.setIntent(new Intent(UnitcalLenCon.this, UnitcalAreaCon.class));
                UnitcalLenCon.this.finish();
                break;
            case R.id.volume:
                item.setIntent(new Intent(UnitcalLenCon.this, UnitcalVolCon.class));
                UnitcalLenCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClickText(View view) {
        TextView textView = (TextView) view;
        switch (view.getId()) {
            case R.id.lmm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.lmm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.lcm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.lcm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.lm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.lm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.lgm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.lgm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.linch:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.linch);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.foot:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.foot);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.mile:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.mile);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.lnmile:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.lnmile);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
        }
    }

    public void onClick(View view) {
        Button button = (Button) view;
        switch (view.getId()) {
            case R.id.delete:
                if (textView1.getText().toString().equals("")) {
                    break;
                } else {
                    textView1.setText(textView1.getText().toString().substring(0, textView1.getText().toString().length() - 1));
                    switch (textView1.getId()) {
                        case R.id.lmm:
                            unitcalLenlmm();
                            break;
                        case R.id.lcm:
                            unitcalLenlcm();
                            break;
                        case R.id.lm:
                            unitcalLenlm();
                            break;
                        case R.id.lgm:
                            unitcalLenlgm();
                            break;
                        case R.id.linch:
                            unitcalLeninch();
                            break;
                        case R.id.foot:
                            unitcalLenfoot();
                            break;
                        case R.id.mile:
                            unitcalLenmile();
                            break;
                        case R.id.lnmile:
                            unitcalLenlnmile();
                            break;
                    }
                }
                break;
            case R.id.dont:
                textView1.setText(textView1.getText().toString() + button.getText().toString());
                break;
            default:
                textView1.setText(textView1.getText().toString() + button.getText().toString());
                switch (textView1.getId()) {
                    case R.id.lmm:
                        unitcalLenlmm();
                        break;
                    case R.id.lcm:
                        unitcalLenlcm();
                        break;
                    case R.id.lm:
                        unitcalLenlm();
                        break;
                    case R.id.lgm:
                        unitcalLenlgm();
                        break;
                    case R.id.linch:
                        unitcalLeninch();
                        break;
                    case R.id.foot:
                        unitcalLenfoot();
                        break;
                    case R.id.mile:
                        unitcalLenmile();
                        break;
                    case R.id.lnmile:
                        unitcalLenlnmile();
                        break;
                }
        }
    }

    public void unitcalLenlmm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 0.1));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 0.001));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 0.000001));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 0.03937));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 0.003281));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.000000621371));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.00000053996));
    }

    public void unitcalLenlcm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 10));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 0.01));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 0.00001));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 0.3937));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 0.03281));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.00000621371));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.0000053996));
    }

    public void unitcalLenlm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 1000));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 100));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 0.001));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 39.37));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 3.281));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.000621371));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.00053996));
    }

    public void unitcalLenlgm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 1000000));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 100000));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 1000));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 39370));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 3281));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.621371));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.53996));
    }

    public void unitcalLeninch() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 25.4));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 2.54));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 0.0254));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 0.000025));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 0.083333));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.000016));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.000014));
    }

    public void unitcalLenfoot() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 304.8));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 30.48));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 0.3048));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 0.0003048));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 12));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 0.000189));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.000165));
    }

    public void unitcalLenmile() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 1609344.0));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 160934.4));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 1609.344));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 1.609344));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 63360.0));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 5280));
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText(String.valueOf(dou * 0.868976));
    }

    public void unitcalLenlnmile() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText(String.valueOf(dou * 1852000.0));
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText(String.valueOf(dou * 185200.0));
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText(String.valueOf(dou * 1852.0));
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText(String.valueOf(dou * 1.852));
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText(String.valueOf(dou * 72913.39));
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText(String.valueOf(dou * 6076.115));
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText(String.valueOf(dou * 1.150779));
    }

    public void clean() {
        textView2 = (TextView) findViewById(R.id.lmm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.lcm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.lm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.lgm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.linch);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.foot);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.mile);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.lnmile);
        textView2.setText("");
    }
}

