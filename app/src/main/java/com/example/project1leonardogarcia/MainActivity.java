package com.example.project1leonardogarcia;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.project1leonardogarcia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View root= binding.getRoot();
        setContentView(root);
        ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.seekBar.setOnSeekBarChangeListener((SeekBarListener)
                (SeekBar seekBar,int progress,  boolean fromUser) ->
                {

                    binding.rateText.setText(String.format(getString(R.string.interest_rate), progress /10.0));
                });
        binding.Calc.setOnClickListener(v -> {

        });

    }

    private void calculate (View view){
        String inputString = binding.input.getText().toString();
        if(!isValid(inputString)){
            return;
        }

        double principle = Double.parseDouble(inputString);
        double rate = binding.seekBar.getProgress() / 10.0;
        int  year = getYears();
        boolean withTax = binding.checkBox.isChecked();
        //TODO: calculate result and update the result text
    }

    private int getYears(){
    if(binding.r15.isChecked()) return 15;
    else if(binding.r20.isChecked()) return 20;
    else return 30;
    }

    private boolean isValid(String input){
        //TODO: check if the input string is valid
        return true;
    }
}