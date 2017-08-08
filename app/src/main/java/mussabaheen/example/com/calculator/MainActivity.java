package mussabaheen.example.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button dot;
    Button equal;
    Button divide;
    Button product;
    Button clear;
    TextView result;
    TextView process;
    final char add='+';
    final char sub='-';
    final char pro='*';
    final char div='/';
    final char equalfinal='=';
    double val1=Double.NaN;
    double val2;
    char act;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process.setText(process.getText().toString()+"9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=add;
                result.setText(String.valueOf(val1)+"+");
                process.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=sub;
                result.setText(String.valueOf(val1)+"-");
                process.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=div;
                result.setText(String.valueOf(val1)+"/");
                process.setText(null);
            }
        });
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=pro;
                result.setText(String.valueOf(val1)+"*");
                process.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                act=equalfinal;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                process.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(process.getText().length()>0)
                {
                    CharSequence name=process.getText().toString();
                    process.setText(name.subSequence(0,name.length()-1));

                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    process.setText(null);
                    process.setText(null);
                }
            }
        });





    }
    private void setup(){
        zero=(Button)findViewById(R.id.button0);
        one=(Button)findViewById(R.id.button1);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        product=(Button)findViewById(R.id.product);
        equal=(Button)findViewById(R.id.equal);
        dot=(Button)findViewById(R.id.dot);
        clear=(Button)findViewById(R.id.clear);
        divide=(Button)findViewById(R.id.divide);
        result=(TextView)findViewById(R.id.result);
        process=(TextView)findViewById(R.id.process);


    }
    private void compute(){
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(process.getText().toString());
            switch (act) {
                case add:
                    val1=val1-val2;
                    break;
                case sub:
                    val1=val1-val2;
                    break;
                case pro:
                    val1=val1*val2;
                    break;
                case div:
                    val1=val1/val2;
                    break;
                case equalfinal:
                    break;

            }


        }
        else
        {
            val1=Double.parseDouble(process.getText().toString());
        }
    }
}
