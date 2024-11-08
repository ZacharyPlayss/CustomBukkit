package org.bukkit.material;

import org.bukkit.Material;

/**
 * Represents a pressure plate
 */
public class PressurePlate extends MaterialData implements PressureSensor {
    public PressurePlate() {
        super(Material.WOOD_PLATE);
    }
    public PressurePlate(Material type) {
        super(type);
    }

    public boolean isPressed() {
        return getData() == 0x1;
    }

    @Override
    public String toString() {
        return super.toString() + (isPressed() ? " PRESSED" : "");
    }

    @Override
    public PressurePlate clone() {
        return (PressurePlate) super.clone();
    }
}
