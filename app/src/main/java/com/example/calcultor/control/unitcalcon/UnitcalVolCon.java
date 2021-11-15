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

public class UnitcalVolCon extends AppCompatActivity {
    static TextView textView1;
    static TextView textView2;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calcul_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unitcalvol_layout);
        textView1 = (TextView) findViewById(R.id.cmm);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simpleCal:
                item.setIntent(new Intent(UnitcalVolCon.this, SimpleCalCon.class));
                UnitcalVolCon.this.finish();
                break;
            case R.id.functionCal:
                item.setIntent(new Intent(UnitcalVolCon.this, FunctionCalCon.class));
                UnitcalVolCon.this.finish();
                break;
            case R.id.systemCal:
                item.setIntent(new Intent(UnitcalVolCon.this, SystemCalCon.class));
                UnitcalVolCon.this.finish();
                break;
            case R.id.area:
                item.setIntent(new Intent(UnitcalVolCon.this, UnitcalAreaCon.class));
                UnitcalVolCon.this.finish();
                break;
            case R.id.length:
                item.setIntent(new Intent(UnitcalVolCon.this, UnitcalLenCon.class));
                UnitcalVolCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClickText(View view) {
        TextView textView = (TextView) view;
        switch (view.getId()) {
            case R.id.cmm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.cmm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.ccm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.ccm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.cm:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.cm);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.cinch:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.cinch);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.cfoot:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.cfoot);
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
                textView1.setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case R.id.gallon:
                clean();
                textView1.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                textView1.setTypeface(Typeface.DEFAULT);
                textView1 = (TextView) findViewById(R.id.gallon);
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
                        case R.id.cmm:
                            unitcalVolcmm();
                            break;
                        case R.id.ccm:
                            unitcalVolccm();
                            break;
                        case R.id.cm:
                            unitcalVolcm();
                            break;
                        case R.id.cinch:
                            unitcalVolcinch();
                            break;
                        case R.id.cfoot:
                            unitcalVolcfoot();
                            break;
                        case R.id.gallon:
                            unitcalVolcgallon();
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
                    case R.id.cmm:
                        unitcalVolcmm();
                        break;
                    case R.id.ccm:
                        unitcalVolccm();
                        break;
                    case R.id.cm:
                        unitcalVolcm();
                        break;
                    case R.id.cinch:
                        unitcalVolcinch();
                        break;
                    case R.id.cfoot:
                        unitcalVolcfoot();
                        break;
                    case R.id.gallon:
                        unitcalVolcgallon();
                        break;
                }
        }
    }

    public void unitcalVolcmm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText(String.valueOf(dou * 0.001));
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText(String.valueOf(dou * 0.000001));
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText(String.valueOf(dou * 0.000061024));
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText(String.valueOf(dou * 0.000000035));
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText(String.valueOf(dou * 0.000000264));
    }

    public void unitcalVolccm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText(String.valueOf(dou * 1000));
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText(String.valueOf(dou * 0.001));
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText(String.valueOf(dou * 0.061024));
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText(String.valueOf(dou * 0.000035));
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText(String.valueOf(dou * 0.000264));
    }

    public void unitcalVolcm() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText(String.valueOf(dou * 1000000000.0));
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText(String.valueOf(dou * 1000000.0));
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText(String.valueOf(dou * 61023.74));
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText(String.valueOf(dou * 35.31467));
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText(String.valueOf(dou * 264.1721));
    }

    public void unitcalVolcinch() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText(String.valueOf(dou * 0.01638706));
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText(String.valueOf(dou * 16.38706));
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText(String.valueOf(dou * 16387.06));
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText(String.valueOf(dou * 0.000579));
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText(String.valueOf(dou * 0.004329));
    }

    public void unitcalVolcfoot() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText(String.valueOf(dou * 28316850.0));
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText(String.valueOf(dou * 28316.85));
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText(String.valueOf(dou * 0.028317));
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText(String.valueOf(dou * 1728));
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText(String.valueOf(dou * 7.480519));
    }

    public void unitcalVolcgallon() {
        double dou = 0;
        if (textView1.getText().toString().equals("")) {
            dou = 0.0;
        } else {
            dou = Double.parseDouble(textView1.getText().toString());
        }
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText(String.valueOf(dou * 3785412.0));
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText(String.valueOf(dou * 3785.412));
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText(String.valueOf(dou * 0.003785));
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText(String.valueOf(dou * 231));
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText(String.valueOf(dou * 0.133681));
    }

    public void clean() {
        textView2 = (TextView) findViewById(R.id.cmm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.ccm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.cm);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.cinch);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.cfoot);
        textView2.setText("");
        textView2 = (TextView) findViewById(R.id.gallon);
        textView2.setText("");
    }
}
