package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;

/**
 * Represents a furnace.
 */
public class Furnace extends FurnaceAndDispenser {

    public Furnace() {
        super(Material.FURNACE);
    }

    /**
     * Instantiate a furnace facing in a particular direction.
     *
     * @param direction the direction the furnace's "opening" is facing
     */
    public Furnace(BlockFace direction) {
        this();
        setFacingDirection(direction);
    }

    public Furnace(final Material type) {
        super(type);
    }
    @Override
    public Furnace clone() {
        return (Furnace) super.clone();
    }
}
