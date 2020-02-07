package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){package com.example.mad_lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b2= (Button) findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}

            @Override
        public void onClick(View v) {
            EditText e1 = (EditText)findViewById(R.id.editText8);
            EditText e2 = (EditText)findViewById(R.id.editText9);
            TextView t1 = (TextView)findViewById(R.id.dfg);

            
                int num1 = Integer.parseInt(e1.getText().toString());
                int num2 = Integer.parseInt(e1.getText().toString());
                int sum = num1+ num2;

                t1.setText(Integer.toString(sum));

        }});
    }
}

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/dfg"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.151" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="176dp"
        android:layout_marginBottom="284dp"
        android:text="add"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/editText8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="96dp"
        android:layout_marginBottom="32dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name"
        app:layout_constraintBottom_toTopOf="@+id/editText9"
        app:layout_constraintEnd_toEndOf="parent" />

    <EditText
        android:id="@+id/editText9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="96dp"
        android:layout_marginBottom="88dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Name"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
