package org.bukkit.material;

import org.bukkit.Material;

/**
 * Represents a command block
 */
public class Command extends MaterialData implements Redstone {
    public Command() {
        super(Material.COMMAND);
    }

    public Command(final Material type) {
        super(type);
    }

    /**
     * Gets the current state of this Material, indicating if it's powered or
     * unpowered
     *
     * @return true if powered, otherwise false
     */
    public boolean isPowered() {
        return (getData() & 1) != 0;
    }

    /**
     * Sets the current state of this Material
     *
     * @param bool
     *            whether or not the command block is powered
     */
    public void setPowered(boolean bool) {
        setData((byte) (bool ? (getData() | 1) : (getData() & -2)));
    }

    @Override
    public String toString() {
        return super.toString() + " " + (isPowered() ? "" : "NOT ") + "POWERED";
    }

    @Override
    public Command clone() {
        return (Command) super.clone();
    }
}
