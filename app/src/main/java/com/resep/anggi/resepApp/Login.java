package com.resep.anggi.resepApp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.resep.anggi.resepApp.R;

public class Login extends AppCompatActivity {
    EditText uname, pwd;
    Button loginBtn;
    SharedPreferences pref;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        uname = (EditText) findViewById(R.id.user);
        pwd = (EditText) findViewById(R.id.pass);
        loginBtn = (Button) findViewById(R.id.btnLog);

        pref = getSharedPreferences("user details", MODE_PRIVATE);

        intent = new Intent(Login.this, Home.class);
        if (pref.contains("username") && pref.contains("password")) {
            startActivity(intent);
            finish();
        }

    }

    public void login(View view) {
        String username = uname.getText().toString();
        String password = pwd.getText().toString();
        if (username.equals("mobile") && password.equals("computing")) {
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("username", username);
            editor.putString("password", password);
            editor.commit();
            startActivity(intent);
            finish();
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
            builder.setMessage("User Name & Password Salah").setNegativeButton("Coba Lagi", null).create().show();
        }
    }
}
