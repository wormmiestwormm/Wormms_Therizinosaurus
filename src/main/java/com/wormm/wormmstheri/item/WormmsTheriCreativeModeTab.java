package com.wormm.wormmstheri.item;

import com.wormm.wormmstheri.WormmsTheri;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WormmsTheriCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WormmsTheri.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WORMMs_THERI_ITEMS_TAB = CREATIVE_MODE_TAB.register("wormms_theri_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(WormmsTheriItems.THERI_CLAWS.get()))
                    .title(Component.translatable("creativetab.wormmstheri.wormms_theri_items"))
                    .displayItems((itemDisplayParemeters, output) -> {
                        output.accept(WormmsTheriItems.THERI_CLAWS.get());
                        output.accept(WormmsTheriItems.THERI_SWORD.get());
                        output.accept(WormmsTheriItems.THERIZINOSAURUS_SPAWN_EGG.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
