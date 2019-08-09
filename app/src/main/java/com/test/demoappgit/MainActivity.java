package com.test.demoappgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button clickmeBtn;
    int counter = 0;
    String mMessage = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickmeBtn =(Button)findViewById(R.id.clickmebtn);
        clickmeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 counter++;
                 mMessage =  showToast("The button is clicked "+counter+" times");
            }
        });

    }
    public String showToast(String message){
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
        return message;
    }
}
