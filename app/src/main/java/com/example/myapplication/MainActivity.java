package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        // listeners
        TextView textview = (TextView) findViewById(R.id.textView);
        EditText edittext = (EditText) findViewById(R.id.editText);

        String str = edittext.getText().toString();
        textview.setText(str);

//        Toast.makeText(context: this,str,Toast.LENGTH_LONG).show();
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


}