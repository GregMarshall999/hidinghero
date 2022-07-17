package com.isekario.hidinghero.util;

import com.almasb.fxgl.achievement.Achievement;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.MenuItem;

import java.util.Arrays;
import java.util.EnumSet;

public class SettingsUtil
{
    private static final String[] CREDITS = {
            "Name - Programmer",
            "Name - Designer",
            "Name - Artist",
            "AlmasB - FXGL lib author"};

    /**
     * Adds all game achievements to settings data
     * @param settings - game setting context
     */
    public static void initAchievements(GameSettings settings)
    {
        settings.getAchievements().add(new Achievement("Name", "Description", "template", 0));
    }

    /**
     * Sets all values for the game window display
     * @param settings - game setting context
     */
    public static void initGameWindowSettings(GameSettings settings)
    {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setFullScreenAllowed(true);
    }

    /**
     * Enables all main menu features for the game
     * @param settings - game setting context
     */
    public static void initMainMenuSettings(GameSettings settings)
    {
        settings.setMainMenuEnabled(true);
        settings.setGameMenuEnabled(true);

        settings.setEnabledMenuItems(EnumSet.of(MenuItem.SAVE_LOAD, MenuItem.EXTRA));
        settings.getCredits().addAll(Arrays.asList(CREDITS));
    }
}
