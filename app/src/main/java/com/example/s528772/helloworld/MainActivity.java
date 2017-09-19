package com.example.s528772.helloworld;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


            public void buttonOnClick(View v){
                EditText input = (EditText) findViewById(R.id.editText1);
                String s = input.getText().toString();
                String t="";
                for(int i=0;i<s.length();i++){

                    switch (s.charAt(i)){
                        case 'o': t= t+'a';
                            break;
                        case 'O': t=  t+'A';
                            break;
                        case 'a': t= t+'o';
                            break;
                        case 'A': t= t+'O';
                            break;
                        default:t= t+s.charAt(i);
                            break;
                    }

                }
                input.setText(t);
                Toast.makeText(getApplicationContext(),"Replaced!",
                        Toast.LENGTH_SHORT).show();
            }

            public void OnClickForClear(View v){
                EditText input1 = (EditText) findViewById(R.id.editText1);
                input1.setText("");
                Toast.makeText(getApplicationContext(), "Cleared!", Toast.LENGTH_SHORT).show();
            }

            public void exit(View v){
                finish();
                System.exit(0);
            }

// This is a minor modification
            public void finish(View v){
                finish();
                System.exit(0);
            }
        }





