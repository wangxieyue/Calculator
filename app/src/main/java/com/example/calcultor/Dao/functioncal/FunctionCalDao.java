package com.example.calcultor.Dao.functioncal;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calcultor.control.FunctionCalCon;

public class FunctionCalDao extends AppCompatActivity {
    public String sin(String str){
        try {
            return String.valueOf(Math.sin(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String cos(String str){
        try {
            return String.valueOf(Math.cos(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String tan(String str){
        try {
            return String.valueOf(Math.tan(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String ln(String str){
        try {
            return String.valueOf(Math.log(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String log(String str){
        try {
            return String.valueOf(Math.log10(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String sqrt(String str){
        try {
            return String.valueOf(Math.sqrt(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String cbrt(String str){
        try {
            return String.valueOf(Math.cbrt(Double.parseDouble(str)));
        }catch (Exception e){
            return "error";
        }
    }
    public String square(String str){
        try {
            return String.valueOf(Math.pow(Double.parseDouble(str),2));
        }catch (Exception e){
            return "error";
        }
    }
    public String cube(String str){
        try {
            return String.valueOf(Math.pow(Double.parseDouble(str),3));
        }catch (Exception e){
            return "error";
        }
    }
    public FunctionCalDao(){
    }
}
