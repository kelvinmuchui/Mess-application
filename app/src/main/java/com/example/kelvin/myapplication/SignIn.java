package com.example.kelvin.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kelvin.myapplication.Common.Common;
import com.example.kelvin.myapplication.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignIn extends AppCompatActivity {
    EditText edtPhone, edtPassword;
    Button btnLogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtPhone = findViewById(R.id.edtPhone);
        edtPassword = findViewById(R.id.edtpassword);
        btnLogIn = findViewById(R.id.btnLogin);

//        // Init Firebase
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        final DatabaseReference table_user = database.getReference("User");

//        btnLogIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {

//                final ProgressDialog mDialog = new ProgressDialog(SignIn.this);
//                mDialog.setMessage("Please Waiting...");
//                mDialog.show();
//
//                table_user.addValueEventListener(new ValueEventListener() {

//
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        // Check if user exit in database
//                        if(dataSnapshot.child(edtPhone.getText().toString()).exists()){
//
//
//                        //Get user Information
//                        mDialog.dismiss();
//                        User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
//                        if(user.getPassword().equals(edtPassword.getText().toString())){
//                            Toast.makeText(SignIn.this, "Sign in successfully", Toast.LENGTH_SHORT).show();
//
//                        }else{
//                            Toast.makeText(SignIn.this, "Login failed", Toast.LENGTH_SHORT).show();
//
//                        }}else{
//                            mDialog.dismiss();
//                            Toast.makeText(SignIn.this, "User does not exit", Toast.LENGTH_SHORT).show();
//                        }
//
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//            }
//        });

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SignIn.this, Home.class);
               // Common.currentUser = user;
                startActivity(homeIntent);
               // finish();
            }
        });


    }
}
