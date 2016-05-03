package com.example.dinesh.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.database.sqlite.*;

public class Questions extends AppCompatActivity {

//    SQLiteDatabase mydatabase = openOrCreateDatabase("Questionnaire",MODE_PRIVATE,null);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
//        mydatabase.execSQL("questions(dinesh,tester55);");
    }

    public void getNewQuestion(View v){
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        Intent intent = new Intent();
        startActivity(intent);
    }
}
