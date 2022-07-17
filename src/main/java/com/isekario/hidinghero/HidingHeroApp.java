package com.isekario.hidinghero;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

import static com.isekario.hidinghero.util.SettingsUtil.initAchievements;
import static com.isekario.hidinghero.util.SettingsUtil.initGameWindowSettings;
import static com.isekario.hidinghero.util.SettingsUtil.initMainMenuSettings;

public class HidingHeroApp extends GameApplication
{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initSettings(GameSettings settings) {
        initAchievements(settings);
        initGameWindowSettings(settings);
        initMainMenuSettings(settings);
    }

    @Override
    protected void initGame() {

    }
}
