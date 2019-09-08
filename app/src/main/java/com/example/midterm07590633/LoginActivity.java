package com.example.midterm07590633;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                EditText useredit = findViewById(R.id.username_editText);
//                String user = useredit.getText().toString();
//
//                EditText passedit = findViewById(R.id.password_editText);
//                String pass = useredit.getText().toString();
//
//                if (user.equals("aaa") && pass.equals("111")) {
//                    Toast t = Toast.makeText(LoginActivity.this, "Welcome Nattakan Kontong", Toast.LENGTH_LONG);
//                    t.show();
//                }
//                else if(user.equals("bbb") && pass.equals("222")){
//                    Intent i = new Intent(LoginActivity.this , ProfileActivity.class);
//                    i.putExtra("bbb", "222");
//                    startActivity(i);
//                }
                Intent i = new Intent(LoginActivity.this , ProfileActivity.class);
                i.putExtra("bbb", "222");
                startActivity(i);


            }
        });

//        Button nextButton = findViewById(R.id.login_button);
//
//        nextButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(LoginActivity.this , ProfileActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
