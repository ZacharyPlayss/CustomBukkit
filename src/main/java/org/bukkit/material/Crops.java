package org.bukkit.material;

import org.bukkit.CropState;
import org.bukkit.Material;

/**
 * Represents the different types of crops.
 */
public class Crops extends MaterialData {
    public Crops() {
        super(Material.CROPS);
    }

    public Crops(CropState state) {
        this();
        setState(state);
    }

    public Crops(final Material type) {
        super(type);
    }

    /**
     * Gets the current growth state of this crop
     *
     * @return CropState of this crop
     */
    public CropState getState() {
        return CropState.getByData(getData());
    }

    /**
     * Sets the growth state of this crop
     *
     * @param state New growth state of this crop
     */
    public void setState(CropState state) {
        setData(state.getData());
    }

    @Override
    public String toString() {
        return getState() + " " + super.toString();
    }

    @Override
    public Crops clone() {
        return (Crops) super.clone();
    }
}
