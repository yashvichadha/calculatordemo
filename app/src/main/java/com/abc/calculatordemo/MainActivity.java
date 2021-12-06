package com.abc.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt0, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9,
            txtadd, txtsub, txtmulti, txtdiv, txtdec, txtresult, txtresultdisply;
    Button btnAc;

    double value1, value2;
    boolean maddition, msubtract, mdivide, mmultipication;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt0 = (TextView) findViewById(R.id.no0);
        txt1 = (TextView) findViewById(R.id.no1);
        txt2 = (TextView) findViewById(R.id.no2);
        txt3 = (TextView) findViewById(R.id.no3);
        txt4 = (TextView) findViewById(R.id.no4);
        txt5 = (TextView) findViewById(R.id.no5);
        txt6 = (TextView) findViewById(R.id.no6);
        txt7 = (TextView) findViewById(R.id.no7);
        txt8 = (TextView) findViewById(R.id.no8);
        txt8 = (TextView) findViewById(R.id.no9);
        txt9 = (TextView) findViewById(R.id.no9);
        txtadd = (TextView) findViewById(R.id.add);
        txtdiv = (TextView) findViewById(R.id.subtract);
        txtsub = (TextView) findViewById(R.id.subtract);
        txtmulti = (TextView) findViewById(R.id.multiply);
        txtdec = (TextView) findViewById(R.id.nodeci);
        txtresult = (TextView) findViewById(R.id.resultt);
        btnAc = (Button) findViewById(R.id.ac);
        txtresultdisply = (TextView) findViewById(R.id.resultdisplay);


    }


    public void onbtnclickAC(View view) {
        txtresultdisply.setText(null);
    }

    public void onclickno1(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "1");
    }

    public void onclickno2(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "2");
    }

    public void onclickno3(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "3");
    }

    public void onclickno4(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "4");
    }

    public void onclickno5(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "5");
    }

    public void onclickno6(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "6");
    }

    public void onclickno7(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "7");
    }

    public void onclickno8(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "8");
    }

    public void onclickno9(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "9");
    }

    public void onclickno0(View view) {
        txtresultdisply.setText(txtresultdisply.getText() + "0");
    }

    public void onclickdiv(View view) {
        if (txtresultdisply == null) {
            txtresultdisply.setText("");
        } else {
            value1 = Double.parseDouble(txtresultdisply.getText() + "");
            mdivide = true;
            txtresultdisply.setText(null);
        }

    }

    public void onclickmultiply(View view) {
        if (txtresultdisply == null) {
            txtresultdisply.setText("");
        } else {
            value1 = Double.parseDouble(txtresultdisply.getText() + "");
            mmultipication = true;
            txtresultdisply.setText(null);
        }
    }

    public void onbtnclicksubtract(View view) {
        if (txtresultdisply == null) {
            txtresultdisply.setText("");
        } else {
            value1 = Double.parseDouble(txtresultdisply.getText() + "");
            msubtract = true;
            txtresultdisply.setText(null);
        }
    }


    public void onbtnclickadd(View view) {
        if (txtresultdisply == null) {
            txtresultdisply.setText("");
        } else {
            value1 = Double.parseDouble(txtresultdisply.getText() + "");
            maddition = true;
            txtresultdisply.setText(null);
        }


    }

    public void onclickresult(View view) {
        value2 = Double.parseDouble(txtresultdisply.getText() + "");

        if (maddition == true) {
            txtresultdisply.setText(value1 + value2 + "");
            maddition = false;


        }

        if (msubtract == true) {
            txtresultdisply.setText(value1 - value2 + "");
            msubtract = false;


        }
        if (mmultipication == true) {
            txtresultdisply.setText(value1 * value2 + "");
            mmultipication = false;


        }

        if (mdivide== true) {
            txtresultdisply.setText(value1 / value2 + "");
            mdivide = false;


        }


    }
}