package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        Spinner spinner = (Spinner) findViewById(R.id.spinner5);
        String author = (String) spinner.getSelectedItem();
        Intent intent = new Intent(this, BooksListActivity.class);
        intent.putExtra(BooksListActivity.AUTHOR, author);
        startActivity(intent);
    }
}
/*        Spinner spinner = (Spinner) findViewById(R.id.spinner5);
        String author = (String) spinner.getSelectedItem();
        String txtBooks= "";
        for(Book s : Book.getBooks(author) ){
            txtBooks += s.getNameBook() + "\n";
        }
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(txtBooks);*/