package org.bukkit;

import java.util.Map;

import com.google.common.collect.Maps;

public enum Instrument {

    PIANO(0x0),
    BASS_DRUM(0x1),
    SNARE_DRUM(0x2),
    STICKS(0x3),
    BASS_GUITAR(0x4);
    private final byte type;
    private final static Map<Byte, Instrument> BY_DATA = Maps.newHashMap();
    private Instrument(final int type) {
        this.type = (byte) type;
    }
    @Deprecated
    public byte getType() {
        return this.type;
    }
}
