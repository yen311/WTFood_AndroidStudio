package com.example.wtfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {

    EditText rEmail, rPassword, rPassword2;
    Button goToLogin;
    ImageButton registerButton;
    ProgressBar progress;
    FirebaseAuth fAuth;

    Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{6,}$");
    Matcher matcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        rEmail = findViewById(R.id.rEmail);
        rPassword = findViewById(R.id.rPassword);
        rPassword2 = findViewById(R.id.rPassword2);
        goToLogin = findViewById(R.id.goToLoginButton);
        registerButton = findViewById(R.id.registerButton);

        fAuth = FirebaseAuth.getInstance();
        progress = findViewById(R.id.progressBar);

        //If the user is already logged in, direct the user back to the main activity.
        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        goToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        registerButton.setOnClickListener(v -> {
            String email = rEmail.getText().toString().trim();
            String password = rPassword.getText().toString();
            String password2 = rPassword2.getText().toString();
            matcher = passwordPattern.matcher(password);

            if (TextUtils.isEmpty(email)){
                rEmail.setError("Email cannot be empty.");
                return;
            }

            else if (TextUtils.isEmpty(password)){
                rPassword.setError("Password cannot be empty.");
                return;
            }

            else if (TextUtils.isEmpty(password2)){
                rPassword2.setError("Please enter your password again.");
                return;
            }

            else if (!password.equals(password2)){
                rPassword2.setError("Passwords do not match.");
                return;
            }

            else if (!matcher.matches()){
                rPassword2.setError("Invalid password.");
                return;
            }

            progress.setVisibility(View.VISIBLE);

            //Register the user in Firebase.
            fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    progress.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(), "Signed up successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                } else {
                    progress.setVisibility(View.INVISIBLE);
                    Toast.makeText(getApplicationContext(), "Oops! Something went wrong.", Toast.LENGTH_SHORT).show();
                }
            });
        });
    }

    public void registerBackButton(View view){
        finish();
    }
}