package com.example.saitarun.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText usrName,usrPwd,usrPlace,usrGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usrName=findViewById(R.id.editText1);
        usrPwd=findViewById(R.id.editText2);
        usrPlace=findViewById(R.id.editText3);
        usrGender=findViewById(R.id.editText4);


    }
    public void saveData(View view){
        SharedPreferences spf=getSharedPreferences("myspf",MODE_PRIVATE);
        SharedPreferences.Editor editor=spf.edit();

        editor.putString("username",usrName.getText().toString());
        editor.putString("password",usrPwd.getText().toString());
        editor.putString("place",usrPlace.getText().toString());
        editor.putString("gender",usrGender.getText().toString());

        editor.apply();

        Toast.makeText(this, "Sucessfully Saved", Toast.LENGTH_SHORT).show();
        finish();
    }


}
