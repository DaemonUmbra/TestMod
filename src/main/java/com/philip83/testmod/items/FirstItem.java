package com.philip83.testmod.items;

import com.philip83.testmod.TestMod;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(TestMod.setup.itemGroup)
                );
        setRegistryName("firstitem");
    }
}
