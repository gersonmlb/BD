package com.tutorial.bd.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tutorial.bd.R;

public class LoginActivity extends AppCompatActivity {

    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        login = (Button) findViewById(R.id.loginBTN);
    }
}
