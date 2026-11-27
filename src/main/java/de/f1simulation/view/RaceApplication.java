package de.f1simulation.view;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.utils.ScreenUtils;

public class RaceApplication extends ApplicationAdapter {

    @Override
    public void create() {
        System.out.println("Application created");
    }

    @Override
    public void render() {
        ScreenUtils.clear(0.1f, 0.15f, 0.2f, 1f);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Window resized: " + width + "x" + height);
    }

    @Override
    public void pause() {
        System.out.println("Application paused");
    }

    @Override
    public void resume() {
        System.out.println("Application resumed");
    }

    @Override
    public void dispose() {
        System.out.println("Application disposed");
    }
}
