package com.philip83.testmod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy{
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");

    }
}