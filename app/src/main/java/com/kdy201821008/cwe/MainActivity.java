package com.kdy201821008.cwe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private StringBuilder mMathExpr;
    private Button bpercent;
    private Button bsquare;
    private TextView mresultc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mresultc = (TextView) findViewById(R.id.resultc);
        bpercent = (Button) findViewById(R.id.bpercent);
        bsquare = (Button) findViewById(R.id.bsquare);
        mMathExpr = new StringBuilder(256);
        if (savedInstanceState != null) {
            String expr = savedInstanceState.getString("MathExpr");
            if (expr != null) {
                mMathExpr.append(expr);
                mresultc.setText(expr);
            }
        }

        Button Bc = (Button) findViewById(R.id.bC);
        Bc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mMathExpr.delete(0,mMathExpr.length());
                mresultc.setText(mMathExpr);
                return true;
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outstate) {
        super.onSaveInstanceState(outstate);
        if (mMathExpr.length() > 0) {
            outstate.putString("MathExpr",mMathExpr.toString());
        }
    }

    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.b0 :
                mMathExpr.append("0");
                break;
            case R.id.b1 :
                mMathExpr.append("1");
                break;
            case R.id.b2 :
                mMathExpr.append("2");
                break;
            case R.id.b3 :
                mMathExpr.append("3");
                break;
            case R.id.b4 :
                mMathExpr.append("4");
                break;
            case R.id.b5 :
                mMathExpr.append("5");
                break;
            case R.id.b6 :
                mMathExpr.append("6");
                break;
            case R.id.b7 :
                mMathExpr.append("7");
                break;
            case R.id.b8 :
                mMathExpr.append("8");
                break;
            case R.id.b9 :
                mMathExpr.append("9");
                break;
            case R.id.bpoint :
                mMathExpr.append(".");
                break;
            case R.id.bplus :
                mMathExpr.append("+");
                break;
            case R.id.bminus :
                mMathExpr.append("-");
                break;
            case R.id.bdivide :
                mMathExpr.append("/");
                break;
            case R.id.bmulti :
                mMathExpr.append("*");
                break;
            case R.id.bpercent :
                mMathExpr.append("%");
                break;
            case R.id.bsquare :
                mMathExpr.append("^");
                break;
            case R.id.bC :
                if (mMathExpr.length() > 0) {
                    mMathExpr.deleteCharAt(mMathExpr.length() - 1);
                }
                break;
            case R.id.bresult :
                if (mMathExpr.length() == 0) {
                    return;
                }
                String result = NumCalc.calc(mMathExpr.toString());
                if (result != null) {
                    mMathExpr.delete(0,mMathExpr.length());
                    mMathExpr.append(result);
                }
                break;
        }
        mresultc.setText(mMathExpr);
    }

}
