package com.wormm.wormmstheri.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.wormm.wormmstheri.WormmsTheri;
import com.wormm.wormmstheri.entity.custom.TherizinosaurusEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TherizinosaurusRenderer extends MobRenderer<TherizinosaurusEntity, TherizinosaurusModel<TherizinosaurusEntity>> {

    public TherizinosaurusRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TherizinosaurusModel<>(pContext.bakeLayer(TherizinosaurusModel.LAYER_LOCATION)), 0.85f);
    }

    @Override
    public ResourceLocation getTextureLocation(TherizinosaurusEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(WormmsTheri.MOD_ID, "textures/entity/therizinosaurus/therizinosaurus.png");
    }

    @Override
    public void render(TherizinosaurusEntity pEntity, float pEntityYaw, float pParticalTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            pPoseStack.scale(1f, 1f, 1f);
        }
        super.render(pEntity, pEntityYaw, pParticalTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
