package de.f1simulation.launcher;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import de.f1simulation.view.RaceApplication;

public class DesktopLauncher {

    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();

        configuration.setTitle("F1 Race Simulator");
        configuration.setWindowedMode(1280, 720);
        configuration.setForegroundFPS(60);
        configuration.useVsync(true);
        configuration.setResizable(true);

        new Lwjgl3Application(new RaceApplication(), configuration);
    }
}
