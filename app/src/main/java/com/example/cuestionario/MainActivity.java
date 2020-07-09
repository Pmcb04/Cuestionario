package com.example.cuestionario;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.next);
        final TextView name = findViewById(R.id.full_name);
        final TextView phone = findViewById(R.id.phone);
        final TextView email = findViewById(R.id.email);
        final TextView description = findViewById(R.id.description);
        final DatePicker picker = findViewById(R.id.picker);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (view.getContext(), DataActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("description", description.getText().toString());
                String date = picker.getDayOfMonth() + "/" + picker.getMonth() + "/" + picker.getYear();
                intent.putExtra("date", date);
                startActivity(intent);

            }
        });





    }


}