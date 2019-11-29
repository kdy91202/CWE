package com.kdy201821008.cwe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.sql.BatchUpdateException;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button bC;
    private Button bce;
    private Button bsquare;
    private Button bplus;
    private Button bminus;
    private Button bdivide;
    private Button bmulti;
    private Button bresult;
    private ArrayList<String> operatorList;
    private boolean isPreOperator;

    private TextView resultc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);
        bC = (Button) findViewById(R.id.bC);
        bC.setOnClickListener(this);
        bce = (Button) findViewById(R.id.bce);
        bce.setOnClickListener(this);
        bsquare = (Button) findViewById(R.id.bsquare);
        bsquare.setOnClickListener(this);
        bplus = (Button) findViewById(R.id.bplus);
        bplus.setOnClickListener(this);
        bminus = (Button) findViewById(R.id.bminus);
        bminus.setOnClickListener(this);
        bdivide = (Button) findViewById(R.id.bdivide);
        bdivide.setOnClickListener(this);
        bmulti = (Button) findViewById(R.id.bmulti);
        bmulti.setOnClickListener(this);
        bresult = (Button) findViewById(R.id.bresult);
        bresult.setOnClickListener(this);
        bsquare = (Button) findViewById(R.id.bsquare);
        bsquare.setOnClickListener(this);
        resultc = (TextView) findViewById(R.id.resultc);
        resultc.setEnabled(false);

        operatorList = new ArrayList<String>();
        isPreOperator = false;


    }

    @Override
    public void onClick(View v) {

        if (v.equals(b1)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("1");
            } else {
                resultc.setText(resultc.getText() + "1");
            }
        } else if (v.equals(b2)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("2");
            } else {
                resultc.setText(resultc.getText() + "2");
            }
        } else if (v.equals(b3)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("3");
            } else {
                resultc.setText(resultc.getText() + "3");
            }
        } else if (v.equals(b4)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("4");
            } else {
                resultc.setText(resultc.getText() + "4");
            }
        } else if (v.equals(b5)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("5");
            } else {
                resultc.setText(resultc.getText() + "5");
            }
        } else if (v.equals(b6)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("6");
            } else {
                resultc.setText(resultc.getText() + "6");
            }
        } else if (v.equals(b7)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("7");
            } else {
                resultc.setText(resultc.getText() + "7");
            }
        } else if (v.equals(b8)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("8");
            } else {
                resultc.setText(resultc.getText() + "8");
            }
        } else if (v.equals(b9)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("9");
            } else {
                resultc.setText(resultc.getText() + "9");
            }
        } else if (v.equals(b0)) {
            isPreOperator = false;
            if (resultc.getText().length() == 1 && "0".equals(resultc.getText())) {
                resultc.setText("0");
            } else {
                resultc.setText(resultc.getText() + "0");
            }
        } else if (v.equals(bC)) {
            isPreOperator = false;
            resultc.setText("");
            operatorList.clear();
        } else if (v.equals(bce)) {
            if (resultc.getText().length() != 0) {
                String str = resultc.getText().subSequence(resultc.getText().length()-1,
                        resultc.getText().length()).toString();
                if( "+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str)){
                    operatorList.remove(operatorList.size());
                }
                resultc.setText( resultc.getText().subSequence( 0 , resultc.getText().length()-1));
            }
        } else if( v.equals( bdivide )){
            if( isPreOperator == true ) {
                return;
            }
            resultc.setText( resultc.getText()+"/");
            isPreOperator = true;
            operatorList.add("/");
        }else if( v.equals( bplus )){
            if( isPreOperator == true ) {
                return;
            }
            isPreOperator = true;
            resultc.setText( resultc.getText()+"+");
            operatorList.add("+");

        }else if( v.equals( bminus )){
            if( isPreOperator == true ) {
                return;
            }
            isPreOperator = true;
            resultc.setText( resultc.getText()+"-");
            operatorList.add("-");
        } else if (v.equals(bsquare)) {
            if (isPreOperator == true) {
                return;
            }
            isPreOperator = true;
            resultc.setText(resultc.getText()+"^");
            operatorList.add("^");
        } else if( v.equals( bmulti )){
            if( isPreOperator == true ) {
                return;
            }
            isPreOperator = true;
            resultc.setText( resultc.getText()+"X");
            operatorList.add("*");
        }else if( v.equals( bresult )){
            if( isPreOperator == true ) {
                resultc.setText("0");
                operatorList.clear();
                isPreOperator = false;
                return;
            }
            resultc.setText( calc(resultc.getText().toString()) );
        }
    }

    private  String calc(String exp) {

        ArrayList<Long> numberlist = new ArrayList<Long>();
        StringTokenizer st = new StringTokenizer(exp,"X/+-");

        while (st.hasMoreTokens()) {
            long number = Long.parseLong(st.nextToken());
            numberlist.add(number);
            Log.d("aaa", String.valueOf(number));
        }

        long resultc = numberlist.get(0);
        Log.d("aaa", String.valueOf(resultc));
        for (int i = 0; i < operatorList.size(); i++) {
            String operator = operatorList.get(i);

            if ("*".equals(operator)) {
                Log.d("aaa","*");
                Log.d("aaa", String.valueOf(numberlist.get(i+1)));
                resultc = (resultc * numberlist.get(i+1));
            } else if ("/".equals(operator)) {
                Log.d("aaa","/");
                Log.d("aaa", String.valueOf(numberlist.get(i+1)));
                resultc = (resultc / numberlist.get(i+1));
            } else if ("+".equals(operator)) {
                Log.d("aaa","+");
                Log.d("aaa", String.valueOf(numberlist.get(i+1)));
                resultc = (resultc + numberlist.get(i+1));
            } else if ("-".equals(operator)) {
                Log.d("aaa","-");
                Log.d("aaa", String.valueOf(numberlist.get(i+1)));
                resultc = (resultc - numberlist.get(i+1));
            } /* else if ("^".equals(operator)) {
                Log.d("aaa","^");
                Log.d("aaa", String.valueOf(numberlist.get(i+1)));
                resultc = (long) (Math.pow(resultc, numberlist.get(i+1)));
            } */
        }

        operatorList.clear();
        numberlist.clear();

        return String.valueOf(resultc);

    }



}
