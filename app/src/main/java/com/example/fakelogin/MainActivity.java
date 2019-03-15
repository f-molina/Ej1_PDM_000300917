package com.example.fakelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button login;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        login = (Button)findViewById(R.id.login);
        resultado = (TextView)findViewById(R.id.res);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(user.getText().toString());
            }
        });

        login.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultado.setText(pass.getText().toString());
                return false;
            }
        });
    }
}
