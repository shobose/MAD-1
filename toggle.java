package com.example.mad_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    int ch=1;
    float font=30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= (TextView) findViewById(R.id.textView);
        Button b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font + 5;
                if(font == 50)
                    font = 30;
            }
        });
        Button b2= (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch) {
                    case 1:  t.setTextColor(Color.RED);  break;
                    case 2:  t.setTextColor(Color.GREEN);  break;
                    case 3:  t.setTextColor(Color.BLUE);  break;
                    case 4:  t.setTextColor(Color.CYAN); break;
                    case 5:  t.setTextColor(Color.YELLOW);  break;
                    case 6:  t.setTextColor(Color.MAGENTA);  break;
                }
                ch++;
                if(ch == 7)  ch = 1;
            }   });
        //TextView t= (TextView) findViewById(R.id.textView);

        Button b3= (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Toggle Text
                if(t.getText()=="CSE")
                    t.setText("ISE");
                else
                    t.setText("CSE");
            }
        });
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
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="148dp"
        android:layout_marginBottom="84dp"
        android:password="false"
        android:text="Hello World !!"
        android:textColorLink="#006B2222"
        app:layout_constraintBottom_toTopOf="@+id/button"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="115dp"
        android:layout_marginBottom="52dp"
        android:text="change font size"
        app:layout_constraintBottom_toTopOf="@+id/button2"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="106dp"
        android:layout_marginBottom="367dp"
        android:text="change font color"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="CSE/ISE"
        tools:layout_editor_absoluteX="182dp"
        tools:layout_editor_absoluteY="35dp" />
</androidx.constraintlayout.widget.ConstraintLayout>
