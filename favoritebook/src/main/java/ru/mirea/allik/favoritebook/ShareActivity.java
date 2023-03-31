package ru.mirea.allik.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Мой любимая книга: %s", university));
        }
    }

    public void sendResultas(View view) {
        Intent data = new Intent();
        EditText tField = (EditText)findViewById(R.id.editTextTextPersonName);
        String text = tField.getText().toString();
        data.putExtra(MainActivity.USER_MESSAGE, "Название Вашей любимой книги: " + text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}