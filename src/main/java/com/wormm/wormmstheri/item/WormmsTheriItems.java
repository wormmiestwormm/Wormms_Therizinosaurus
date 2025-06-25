package com.wormm.wormmstheri.item;

import com.wormm.wormmstheri.WormmsTheri;
import com.wormm.wormmstheri.item.custom.ModToolTiers;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WormmsTheriItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WormmsTheri.MOD_ID);

    public static final RegistryObject<Item> THERI_CLAWS = ITEMS.register("theri_claws",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> THERI_SWORD = ITEMS.register("theri_sword",
            () -> new SwordItem(ModToolTiers.THERI, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.THERI, 3, -2.4f))));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
