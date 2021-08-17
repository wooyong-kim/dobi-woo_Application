package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class JoystickActivity extends AppCompatActivity implements JoystickView.JoystickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystick = new JoystickView(this);
        setContentView(R.layout.activity_joystick);
    }

    @Override
    public void onJoystickMoved(float xPercent, float yPercent, int id) {
        Log.d("Right Joystick", "X percent: " + xPercent + " Y percent: " + yPercent);
    }
}