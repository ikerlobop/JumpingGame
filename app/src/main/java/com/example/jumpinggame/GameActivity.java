package com.example.jumpinggame;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game); // Inflar el layout
        gameView = findViewById(R.id.gameView); // Obtener la instancia de GameView del layout
        gameView.setBackgroundColor(Color.GRAY); // Establecer el color de fondo del GameView
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            gameView.jump();
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        gameView.stop();
        finish();
    }
}


