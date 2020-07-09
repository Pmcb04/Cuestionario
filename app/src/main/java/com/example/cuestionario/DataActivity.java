package com.example.cuestionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Button edit = findViewById(R.id.edit);
        final TextView name = findViewById(R.id.full_name);
        final TextView date = findViewById(R.id.data_content);
        final TextView phone = findViewById(R.id.phone_content);
        final TextView email = findViewById(R.id.email_content);
        final TextView description = findViewById(R.id.description_content);


        name.setText(getIntent().getStringExtra("name"));
        date.setText(getIntent().getStringExtra("date"));
        phone.setText(getIntent().getStringExtra("phone"));
        email.setText(getIntent().getStringExtra("email"));
        description.setText(getIntent().getStringExtra("description"));


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}