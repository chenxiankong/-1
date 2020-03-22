package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.*;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.button1);
        final TextView tv1=findViewById(R.id.textView1);
        final EditText et=findViewById(R.id.editText);
        et.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"请在输入框输入要显示的文字",Toast.LENGTH_LONG).show();
                Log.d("MainActivity", "world");
            }
        });
        et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                tv1.setText(et.getText());
                et.setVisibility(View.INVISIBLE);
                return false;
            }
        });

        final CheckBox cb=findViewById(R.id.checkBox);
        final ImageView IV=findViewById(R.id.imageView);
        IV.setVisibility(View.GONE);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked()==true){
                    IV.setVisibility(View.VISIBLE);
                }
                else{
                    IV.setVisibility(View.GONE);
                }
            }
        });
    }
}
