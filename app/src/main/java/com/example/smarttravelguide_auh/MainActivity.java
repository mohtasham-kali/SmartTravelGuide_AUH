package com.example.smarttravelguide_auh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SystemClock.sleep(2000); //add this line to increase duration of splash screen
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_main);
    }

    public void redirectToFindLocation(View view) {
        Intent intent = new Intent(MainActivity.this, FindCurrentLocation.class);
        startActivity(intent);
    }

    public void redirectToCalculateDistance(View view) {
        Intent intent = new Intent(MainActivity.this, CalculateDistance.class);
        startActivity(intent);
    }

    public void redirectToWeatherForecast(View view) {
        Intent intent = new Intent(MainActivity.this, WeatherForecast.class);
        startActivity(intent);
    }

    public void redirectToLocateASpot(View view) {
        Intent intent = new Intent(MainActivity.this, LocateASpot.class);
        startActivity(intent);
    }
}
