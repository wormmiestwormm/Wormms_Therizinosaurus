package com.wormm.wormmstheri.entity;

import com.wormm.wormmstheri.WormmsTheri;
import com.wormm.wormmstheri.entity.custom.TherizinosaurusEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WormmsTheri.MOD_ID);

    public static final RegistryObject<EntityType<TherizinosaurusEntity>> THERIZINOSAURUS =
            ENTITY_TYPES.register("therizinosaurus", () -> EntityType.Builder.of(TherizinosaurusEntity::new, MobCategory.CREATURE)
                    .sized(2.0f, 5.0f).build("therizinosaurus"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
