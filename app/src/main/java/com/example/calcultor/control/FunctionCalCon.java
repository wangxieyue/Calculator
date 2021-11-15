package com.example.calcultor.control;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calcultor.Dao.functioncal.FunctionCalDao;
import com.example.calcultor.R;
import com.example.calcultor.control.unitcalcon.UnitcalAreaCon;
import com.example.calcultor.control.unitcalcon.UnitcalLenCon;
import com.example.calcultor.control.unitcalcon.UnitcalVolCon;

public class FunctionCalCon extends AppCompatActivity {
    private static TextView textView;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calcul_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.functioncal_layout);
        textView = (TextView) findViewById(R.id.textview);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.simpleCal:
                item.setIntent(new Intent(FunctionCalCon.this, SimpleCalCon.class));
                FunctionCalCon.this.finish();
                break;
            case R.id.systemCal:
                item.setIntent(new Intent(FunctionCalCon.this, SystemCalCon.class));
                FunctionCalCon.this.finish();
                break;
            case R.id.length:
                item.setIntent(new Intent(FunctionCalCon.this, UnitcalLenCon.class));
                FunctionCalCon.this.finish();
                break;
            case R.id.area:
                item.setIntent(new Intent(FunctionCalCon.this, UnitcalAreaCon.class));
                FunctionCalCon.this.finish();
                break;
            case R.id.volume:
                item.setIntent(new Intent(FunctionCalCon.this, UnitcalVolCon.class));
                FunctionCalCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClick(View view) {
        Button button = (Button) view;
        FunctionCalDao functionCalDao = new FunctionCalDao();
        switch (view.getId()) {
            case R.id.clean:
                textView.setText("");
                break;
            case R.id.delete:
                if (textView.getText().toString().equals("")) {
                    break;
                } else {
                    textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));
                }
                break;
            case R.id.sin:
                textView.setText(functionCalDao.sin(textView.getText().toString()));
                break;
            case R.id.cos:
                textView.setText(functionCalDao.cos(textView.getText().toString()));
                break;
            case R.id.tan:
                textView.setText(functionCalDao.tan(textView.getText().toString()));
                break;
            case R.id.log:
                textView.setText(functionCalDao.log(textView.getText().toString()));
                break;
            case R.id.in:
                textView.setText(functionCalDao.ln(textView.getText().toString()));
                break;
            case R.id.square:
                textView.setText(functionCalDao.square(textView.getText().toString()));
                break;
            case R.id.cube:
                textView.setText(functionCalDao.cube(textView.getText().toString()));
                break;
            case R.id.sqrt:
                textView.setText(functionCalDao.sqrt(textView.getText().toString()));
                break;
            case R.id.cbrt:
                textView.setText(functionCalDao.cbrt(textView.getText().toString()));
                break;
            case R.id.eulnum:
                textView.setText(String.valueOf(Math.E));
                break;
            case R.id.pai:
                textView.setText(String.valueOf(Math.PI));
                break;
            default:
                textView.setText(textView.getText().toString() + button.getText().toString());
        }
    }
}