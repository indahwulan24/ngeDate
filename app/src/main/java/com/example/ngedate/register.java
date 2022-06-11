package com.example.ngedate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {

    //EditText username, password, fullname, birthdate, address, hoby, partner, phone, gender;
    //Button chooseImage, submit;

    @SuppressLint("WrongViewCast")
    protected void onCreate (Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.register);

        /*username = (EditText) findViewById(R.id.met1);
        password = (EditText) findViewById(R.id.met2);
        fullname = (EditText) findViewById(R.id.met3);
        birthdate = (EditText) findViewById(R.id.met4);
        address = (EditText) findViewById(R.id.met5);
        hoby = (EditText) findViewById(R.id.met6);
        partner = (EditText) findViewById(R.id.met7);
        phone = (EditText) findViewById(R.id.met8);
        gender = (EditText) findViewById(R.id.met9);
        chooseImage = (Button) findViewById(R.id.btnChoose);
        submit = (Button) findViewById(R.id.btnSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("COBA24")) {
                } else {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }

    //private static void setOnClickListener(View.OnClickListener onClickListener) {}

    public void clickSubmit(View view) {
        Intent i = new Intent(this, listuser.class);
        startActivity(i);
    }

}
