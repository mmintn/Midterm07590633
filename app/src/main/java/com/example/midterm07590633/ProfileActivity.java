package com.example.midterm07590633;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Toast t = Toast.makeText(ProfileActivity.this,"Welcome Nattakan kontong",Toast.LENGTH_SHORT);
        t.show();
    }
}
