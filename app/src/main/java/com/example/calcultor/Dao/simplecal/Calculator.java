package com.example.calcultor.Dao.simplecal;
import java.util.ArrayList;
import java.util.Stack;


public class Calculator {
    private String[] str;
    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }
    public Calculator(String str2){
        char[] chars = str2.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        String str1 = new String();
        for(int i =0;i<chars.length;i++){
            if((chars[i]>='0' && chars[i]<='9') || chars[i] == '.'){
                str1+=chars[i];
            }else{
                if(str1.equals("")){
                    list.add(String.valueOf(chars[i]));
                }else{
                    list.add(str1);
                    list.add(String.valueOf(chars[i]));
                }
                str1 = new String();
            }
            if(i==chars.length-1){
                if(str1.equals("")) list.add(String.valueOf(chars[i]));
                else{list.add(str1);}
            }
        }
        toPostFix postFix = new toPostFix(list);
        this.str = postFix.getPostFix();
    }
    public double calculator(){
        Stack<Double> stack = new Stack<Double>();
        for(int i=0;i<str.length;i++){
            if(isNumeric(str[i])){
                double m = Double.parseDouble(str[i]);
                stack.push(m);
            } else{
                double n = stack.pop();
                double m = stack.pop();
                stack.push(Operate(m,n,str[i]));
            }
        }
        return stack.pop();
    }
    public double Operate(double m, double n, String str){
        double value = 0;
        switch (str){
            case "+": value = m+n;break;
            case "-": value = m-n;break;
            case "*": value = m*n;break;
            case "/": value = m/n;break;
            default: System.out.println("input error");break;
        }
        return value;
    }

    /*public static void main(String[] args) {
        String str = "1+32*(1+2)";
        Calculator calculator = new Calculator(str);
        int m = calculator.calculator();
        System.out.println(str+"="+m);
    }*/
    public static boolean isNumeric(String string) {
        double intValue;


        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
        }
        return false;
    }
}
