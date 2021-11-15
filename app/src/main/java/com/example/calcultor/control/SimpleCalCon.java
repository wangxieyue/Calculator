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

import com.example.calcultor.Dao.simplecal.Calculator;
import com.example.calcultor.R;
import com.example.calcultor.control.unitcalcon.UnitcalAreaCon;
import com.example.calcultor.control.unitcalcon.UnitcalLenCon;
import com.example.calcultor.control.unitcalcon.UnitcalVolCon;

public class SimpleCalCon extends AppCompatActivity {
    private static TextView textView;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calcul_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simplecal_layout);
        textView = (TextView) findViewById(R.id.textview);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.functionCal:
                item.setIntent(new Intent(SimpleCalCon.this, FunctionCalCon.class));
                SimpleCalCon.this.finish();
                break;
            case R.id.systemCal:
                item.setIntent(new Intent(SimpleCalCon.this, SystemCalCon.class));
                SimpleCalCon.this.finish();
                break;
            case R.id.length:
                item.setIntent(new Intent(SimpleCalCon.this, UnitcalLenCon.class));
                SimpleCalCon.this.finish();
                break;
            case R.id.area:
                item.setIntent(new Intent(SimpleCalCon.this, UnitcalAreaCon.class));
                SimpleCalCon.this.finish();
                break;
            case R.id.volume:
                item.setIntent(new Intent(SimpleCalCon.this, UnitcalVolCon.class));
                SimpleCalCon.this.finish();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return false;
    }

    public void onClick(View view) {
        Button button = (Button) view;
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
            case R.id.calculat:
                try {
                    Calculator calculator = new Calculator(textView.getText().toString());
                    textView.setText(String.valueOf(calculator.calculator()));
                } catch (Exception e) {
                    textView.setText("error");
                }
                break;
            default:
                textView.setText(textView.getText().toString() + button.getText().toString());
        }
    }
}
