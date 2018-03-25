package com.example.saitarun.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uName,uPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uName=findViewById(R.id.login_username);
        uPassword=findViewById(R.id.login_password);
    }

    public void login(View view){
        SharedPreferences spf=getSharedPreferences("myspf",MODE_PRIVATE);

        String sp_username=spf.getString("username",null);
        String sp_pwd=spf.getString("password",null);

        String u_username=uName.getText().toString();
        String u_pwd=uPassword.getText().toString();

                if(u_username.equals(sp_username) && u_pwd.equals(sp_pwd)){
                    Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }
    }

    public void register(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
