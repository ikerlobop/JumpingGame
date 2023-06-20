package com.example.jumpinggame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public class GameView extends View {
    private int backgroundColor;

    public GameView(Context context, int backgroundColor) {
        super(context);
        this.backgroundColor = backgroundColor;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawColor(backgroundColor);


    }

    public void pause() {
    }
    public void stop() {
    }

    public void jump() {

    }

    public void resume() {
    }
}
