package org.bukkit;

/**
 * A delegate for handling block changes. This serves as a direct interface
 * between generation algorithms in the server implementation and utilizing
 * code.
 */
public interface BlockChangeDelegate {

    /**
     * Gets the height of the world.
     *
     * @return Height of the world
     */
    public int getHeight();

    /**
     * Checks if the specified block is empty (air) or not.
     *
     * @param x X coordinate
     * @param y Y coordinate
     * @param z Z coordinate
     * @return True if the block is considered empty.
     */
    public boolean isEmpty(int x, int y, int z);
}
