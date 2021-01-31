package com.example.students;

import androidx.appcompat.app.AppCompatActivity;

import  android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BooksListActivity extends AppCompatActivity {
    public static final String AUTHOR = "author";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_list);
        Intent intent = getIntent();
        String author = intent.getStringExtra(AUTHOR);
        String txtBooks = "";
        for(Book b: Book.getBooks(author)){
           txtBooks+=b.getNameBook() + "\n";
        }
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(txtBooks);
    }

    public void onSendBtnClick(View view){
        TextView textView = (TextView) findViewById(R.id.text);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textView.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT, "Список Книг");
        startActivity(intent);
    }
}