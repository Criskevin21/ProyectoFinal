package com.cristhoper.ec3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.cristhoper.ec3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //  private Button btnGetStarted;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v ->{
            //Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

//          binding.btnGetStarted.setOnClickListener(new View.OnClickListener()

        //       btnGetStarted = findViewById(R.id.button);
        //      btnGetStarted.setOnClickListener(v -> {
        //         Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
        //      });
        binding.textMoviewPhraset.setText(R.string.get_started_title);
    }
}