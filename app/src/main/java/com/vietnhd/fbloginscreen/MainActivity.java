package com.vietnhd.fbloginscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText phoneOrEmailEditText;
    private EditText passEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Set padding for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        phoneOrEmailEditText = findViewById(R.id.phoneOrEmail);
        passEditText = findViewById(R.id.pass);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneOrEmail = phoneOrEmailEditText.getText().toString();
                String password = passEditText.getText().toString();

                if (phoneOrEmail.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both email/phone and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Handle login logic here
                    // For demonstration, we will just show a toast
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
