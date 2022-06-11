package com.example.ngedate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    //Button login;
    //EditText username, password;

    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login);

        //login = (Button) findViewById(R.id.btnLogin);
        //username = (EditText) findViewById(R.id.met1);
        //password = (EditText) findViewById(R.id.met2);

        /*login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("COBA24")) {
                } else {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }

    public void clickLogin(View view) {
        Intent i = new Intent(this, register.class);
        startActivity(i);
    }

}
