package com.philip83.testmod.setup;

import net.minecraft.world.World;

public interface IProxy {
   void init();
    World getClientWorld();
}
