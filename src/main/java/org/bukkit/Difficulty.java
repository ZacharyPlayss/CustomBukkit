package org.bukkit;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Represents the various difficulty levels that are available.
 */
public enum Difficulty {
    /**
     * Players regain health over time, hostile mobs don't spawn, the hunger
     * bar does not deplete.
     */
    PEACEFUL(0),

    /**
     * Hostile mobs spawn, enemies deal less damage than on normal difficulty,
     * the hunger bar does deplete and starving deals up to 5 hearts of
     * damage. (Default value)
     */
    EASY(1),

    /**
     * Hostile mobs spawn, enemies deal normal amounts of damage, the hunger
     * bar does deplete and starving deals up to 9.5 hearts of damage.
     */
    NORMAL(2),

    /**
     * Hostile mobs spawn, enemies deal greater damage than on normal
     * difficulty, the hunger bar does deplete and starving can kill players.
     */
    HARD(3);

    private final int value;
    private final static Map<Integer, Difficulty> BY_ID = Maps.newHashMap();

    private Difficulty(final int value) {
        this.value = value;
    }

}
