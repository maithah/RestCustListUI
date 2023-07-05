package com.example.restcustlistui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InformationCustomerActivity extends AppCompatActivity {

    EditText custId, fullname, address,email, phone,gender,age, tableno, totalcost;

    private UserDBManager UserDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_customer);

        custId = (EditText)findViewById(R.id.editCustId);
        fullname = (EditText)findViewById(R.id.editFullName);
        address = (EditText)findViewById(R.id.editAddress);
        email = (EditText)findViewById(R.id.editEmail);
        phone = (EditText)findViewById(R.id.editPhone);
        gender = (EditText)findViewById(R.id.editGender);
        age = (EditText)findViewById(R.id.editAge);
        tableno = (EditText)findViewById(R.id.editTableNo);
        totalcost = (EditText)findViewById(R.id.editTotalPayment);
        UserDB=new UserDBManager(this);
        UserDB.openConnection();

    }

    public void save(View v){
        String cId = custId.getText().toString();
        String fn = fullname.getText().toString();
        String adr = address.getText().toString();
        String eml = email.getText().toString();
        String phn = phone.getText().toString();
        String gnd = gender.getText().toString();
        String ag = age.getText().toString();
        String tblno = tableno.getText().toString();
        String ttlcst = totalcost.getText().toString();

        UserDB.save(cId,fn,adr,eml,phn,gnd,ag,tblno,ttlcst);
        Toast.makeText(this,"Your data has been recorded ",Toast.LENGTH_LONG).show();

    }
}