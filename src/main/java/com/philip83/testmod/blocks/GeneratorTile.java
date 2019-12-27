package com.philip83.testmod.blocks;

import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

import static com.philip83.testmod.blocks.ModBlocks.GENERATOR_TILE;

public class GeneratorTile extends TileEntity implements ITickableTileEntity {
    public GeneratorTile() {
        super(GENERATOR_TILE);
    }

    @Override
    public void tick() {
        if(world.isRemote){
            System.out.println("GeneratorTile.tick");
        }
    }
}
