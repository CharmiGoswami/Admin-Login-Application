package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
        t1=findViewById(R.id.nm);
        t2=findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1.getText().toString().equals("admin")&&t2.getText().toString().equals("admin123")){
                    String s1=t1.getText().toString();
                    String s2=t2.getText().toString();
                    Toast.makeText(MainActivity.this, "Welcome Mr."+s1, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter right name and password",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
