package com.truewebdev.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// test git
public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView txtResult;
    private TextView btnClr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplicaiton);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnClr = (TextView) findViewById(R.id.btnClr);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 + oper2;

                    txtResult.setText(Double.toString(theResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 - oper2;

                    txtResult.setText(Double.toString(theResult));

                } else
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields!", Toast.LENGTH_LONG).show();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 / oper2;

                    txtResult.setText(Double.toString(theResult));
                } else
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields!", Toast.LENGTH_LONG).show();

            }

        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {

                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;

                    txtResult.setText(Double.toString(theResult));

                } else
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields!", Toast.LENGTH_LONG).show();
            }
        });


        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.0");
                operand1.requestFocus();
            }
        });


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
