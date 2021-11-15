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

import com.example.calcultor.Dao.simplecal.Calculator;
import com.example.calcultor.R;
import com.example.calcultor.control.FunctionCalCon;
import com.example.calcultor.control.SimpleCalCon;
import com.example.calcultor.control.SystemCalCon;

public class UnitcalAreaCon extends AppCompatActivity {
    static TextView textView1;
    static TextView textView2;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calcul_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unitcalarea_layout);
        textView1 = (TextView) findViewById(R.id.hectare);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simpleCal:
                item.setIntent(new Intent(UnitcalAreaCon.this, SimpleCalCon.class));
                UnitcalAreaCon.this.finish();
                break;
            case R.id.functionCal:
                item.setIntent(new Intent(UnitcalAreaCon.this, FunctionCalCon.class));
                UnitcalAreaCon.this.finish();
                break;
            case R.id.systemCal:
                item.setIntent(new Intent(UnitcalAreaCon.this, SystemCalCon.class));
                UnitcalAreaCon.this.finish();
                break;
            case R.id.length:
                item.setIntent(new Intent(UnitcalAreaCon.this, UnitcalLenCon.class));
                UnitcalAreaCon.this.finish();
                break;
            case R.id.volume:
                item.setIntent(new Intent(UnitcalAreaCon.this, UnitcalVolCon.class));
                UnitcalAreaCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClickText(View view) {
        TextView textView = (TextView) view;
        switch (view.getId()) {
            case R.id.hectare:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.hectare);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.acres:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.acres);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squmm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squmm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squcm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squcm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squgm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squgm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squinch:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squinch);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.squmile:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.squmile);
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
                        case R.id.hectare:
                            unitcalAreaHec();
                            break;
                        case R.id.acres:
                            unitcalAreaAcr();
                            break;
                        case R.id.squm:
                            unitcalAreaSqum();
                            break;
                        case R.id.squcm:
                            unitcalAreaSqucm();
                            break;
                        case R.id.squmm:
                            unitcalAreaSqumm();
                            break;
                        case R.id.squgm:
                            unitcalAreaSqugm();
                            break;
                        case R.id.squinch:
                            unitcalAreaSquinch();
                            break;
                        case R.id.squmile:
                            unitcalAreaSqumile();
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
                    case R.id.hectare:
                        unitcalAreaHec();
                        break;
                    case R.id.acres:
                        unitcalAreaAcr();
                        break;
                    case R.id.squm:
                        unitcalAreaSqum();
                        break;
                    case R.id.squcm:
                        unitcalAreaSqucm();
                        break;
                    case R.id.squmm:
                        unitcalAreaSqumm();
                        break;
                    case R.id.squgm:
                        unitcalAreaSqugm();
                        break;
                    case R.id.squinch:
                        unitcalAreaSquinch();
                        break;
                    case R.id.squmile:
                        unitcalAreaSqumile();
                        break;
                }
        }
    }

    public void unitcalAreaHec() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 2.4711));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 10000.0));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 100000000.0));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 10000000000.0));
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText(String.valueOf(dou * 0.01));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 15500031.0));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.003681));
    }

    public void unitcalAreaAcr() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 0.404686));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 4046.856));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 40468564.0));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 4046856422.0));
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText(String.valueOf(dou * 0.004047));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 6272640.0));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.001563));
    }

    public void unitcalAreaSqum() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 0.0001));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 0.000247));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 10000.0));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 1000000.0));
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText(String.valueOf(dou * 0.000001));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 1550.003));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.0000000038610));
    }

    public void unitcalAreaSqucm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 0.00000001));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 0.0000000247));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 0.0001));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 100));
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText(String.valueOf(dou * 0.0000000001));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 1550.0000003));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.00000000000038610));
    }

    public void unitcalAreaSqumm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 0.0000000001));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 0.000000000247));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 0.000001));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 0.01));
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText(String.valueOf(dou * 0.000000000001));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 1550.000000003));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.0000000000000038610));
    }

    public void unitcalAreaSqugm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 100));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 247.1054));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 1000000.0));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 1000000000000.0));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 1550003100.0));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.386102));
    }

    public void unitcalAreaSquinch() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 0.000000064516));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 0.0000001594));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 0.000645));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 645.16));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 6.4516));
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText(String.valueOf(dou * 0.0000000002491));
    }

    public void unitcalAreaSqumile() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText(String.valueOf(dou * 258.9988));
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText(String.valueOf(dou * 640));
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText(String.valueOf(dou * 2589988));
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText(String.valueOf(dou * 2589988110336.0));
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText(String.valueOf(dou * 25899881103.0));
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText(String.valueOf(dou * 4014489600.0));
    }

    public void clean() {
        textView2 = (TextView) findViewById(R.id.hectare);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.acres);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squcm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squmm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squgm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squinch);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.squmile);
        textView2.setText("");
    }
}
