package com.nju2017.cjh.clearaccounts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //数字按钮
        Button btn0 = (Button) findViewById(R.id.button0);
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);

        //其他按钮
        Button btn_dot = (Button) findViewById(R.id.button_dot);
        Button btn_sure = (Button) findViewById(R.id.button_sure);

        //listener
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_sure.setOnClickListener(this);


        // Example of a call to a native method
        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv.setText(stringFromJNI());
    }


    public void onClick(View e){
        Button btn = (Button) e;
        TextView textView = (TextView) findViewById(R.id.textView);
        String contents = (String) textView.getText();
        if(btn.getText().equals("0")
                ||btn.getText().equals("1")
                ||btn.getText().equals("2")
                ||btn.getText().equals("3")
                ||btn.getText().equals("4")
                ||btn.getText().equals("5")
                ||btn.getText().equals("6")
                ||btn.getText().equals("7")
                ||btn.getText().equals("8")
                ||btn.getText().equals("9")
                ||btn.getText().equals(".")){
            contents = contents + btn.getText();
            textView.setText(contents);
        }
        if(btn.getText().equals("确认")){
            new Number().saveInput((String)textView.getText());
            //claer
            textView.setText("");
        }
    }

    /*protected void onResume(){
        super.onResume();
    }*/

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
