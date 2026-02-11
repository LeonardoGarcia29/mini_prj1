package com.example.project1leonardogarcia;

import android.widget.SeekBar;
public interface SeekBarListener extends SeekBar.OnSeekBarChangeListener {
    @Override
    default void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    default void onStopTrackingTouch(SeekBar seekBar) {

    }
}