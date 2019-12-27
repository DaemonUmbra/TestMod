package com.philip83.testmod.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {
    @ObjectHolder("testmod:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("testmod:generator")
    public static Generator GENERATOR;
    @ObjectHolder("testmod:generator")
    public static TileEntityType<GeneratorTile> GENERATOR_TILE;
}
