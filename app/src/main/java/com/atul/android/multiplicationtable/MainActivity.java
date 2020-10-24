package com.atul.android.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.atul.android.multiplicationtable.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printTable(View view) {
        EditText name = findViewById(R.id.editNumber);
        String input = name.getText().toString().trim();
        if(input.length()==0){
            Toast.makeText(this,"Invalid Input!",Toast.LENGTH_SHORT).show();
        }
        StringBuilder result = calculateTable(input);
        display(result);
    }

    private void display(StringBuilder number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText(number);
    }
    // Calculating table for given number
    private StringBuilder calculateTable(String input) {
        int n = Integer.parseInt(input);
        StringBuilder builder = new StringBuilder();
        for (int i=1;i<=10;i++){
            builder.append(" "+n+" ")
                    .append(" X ")
                    .append(" "+i+" ")
                    .append(" = ")
                    .append(" "+n*i)
                    .append('\n');
        }
        return builder;
    }
    // Reset the text field.
    public void resetFields(View view) {
        display();
    }
    private void display() {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView);
        quantityTextView.setText("Text");
    }
}