package org.bukkit.material;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

/**
 * Represents a spawn egg that can be used to spawn mobs
 */
public class SpawnEgg extends MaterialData {

    public SpawnEgg() {
        super(Material.MONSTER_EGG);
    }

    public SpawnEgg(EntityType type) {
        this();
        setSpawnedType(type);
    }

    /**
     * Get the type of entity this egg will spawn.
     *
     * @return The entity type.
     */
    public EntityType getSpawnedType() {
        return EntityType.fromId(getData());
    }

    /**
     * Set the type of entity this egg will spawn.
     *
     * @param type The entity type.
     */
    public void setSpawnedType(EntityType type) {
        setData((byte) type.getTypeId());
    }

    @Override
    public String toString() {
        return "SPAWN EGG{" + getSpawnedType() + "}";
    }

    @Override
    public SpawnEgg clone() {
        return (SpawnEgg) super.clone();
    }
}
