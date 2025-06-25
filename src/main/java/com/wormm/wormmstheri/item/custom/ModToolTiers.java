package com.wormm.wormmstheri.item.custom;

import com.wormm.wormmstheri.item.WormmsTheriItems;
import com.wormm.wormmstheri.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier THERI = new ForgeTier(1400, 4, 6f, 20,
            ModTags.Blocks.NEEDS_THERI_TOOL, () -> Ingredient.of(WormmsTheriItems.THERI_CLAWS.get()),
            ModTags.Blocks.INCORRECT_FOR_THERI_TOOL);
}
