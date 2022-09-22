package com.example.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    TextInputEditText textInputEditText, textInputEditText2;
    TextView OutputHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputEditText = (TextInputEditText)findViewById(R.id.textInputEditText);
        textInputEditText2= (TextInputEditText)findViewById(R.id.textInputEditText2);
        OutputHasil=(TextView)findViewById(R.id.OutputHasil);

    }



    //Button's Code
    public void LuasP(View view) {
        int inp1 = Integer.parseInt(textInputEditText.getText().toString());
        int inp2 = Integer.parseInt(textInputEditText2.getText().toString());
        Integer hsl=inp1*inp2;
        OutputHasil.setText(hsl.toString());
    }

    public void LuasS(View view) {
        double inp1 = Double.parseDouble(textInputEditText.getText().toString());
        double inp2 = Double.parseDouble(textInputEditText2.getText().toString());
        Double hsl = (inp1*inp2)/2;
        OutputHasil.setText(hsl.toString());
    }

    public void LuasL(View view) {
        double inp1=Double.parseDouble(textInputEditText.getText().toString());
        Double hsl= 22*inp1*inp1/7;
        OutputHasil.setText(hsl.toString());
    }

    public void KelilingP(View view) {
        int inp1 =Integer.parseInt(textInputEditText.getText().toString());
        Integer hsl= 4*inp1;
        OutputHasil.setText(hsl.toString());
    }

    public void KelilingS(View view) {
        int inp1=Integer.parseInt(textInputEditText.getText().toString());
        Integer hsl=3*(inp1);
        OutputHasil.setText(hsl.toString());
    }

    public void KelilingL(View view) {
        double inp1=Double.parseDouble(textInputEditText.getText().toString());
        Double hsl= 22*(inp1*2)/7;
        OutputHasil.setText(hsl.toString());
    }
}