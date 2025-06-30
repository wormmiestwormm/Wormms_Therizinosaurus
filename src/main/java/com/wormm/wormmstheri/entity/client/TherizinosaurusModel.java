package com.wormm.wormmstheri.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.wormm.wormmstheri.WormmsTheri;
import com.wormm.wormmstheri.entity.custom.TherizinosaurusEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class TherizinosaurusModel<T extends TherizinosaurusEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(WormmsTheri.MOD_ID, "therizinosaurus"), "main");
    private final ModelPart body;
    private final ModelPart head;

    public TherizinosaurusModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = body.getChild("upper").getChild("neck").getChild("neck_middle").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1141F, -4.6632F, 10.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition upper = body.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offset(-3.3418F, -5.338F, -0.5F));

        PartDefinition upper_body_r1 = upper.addOrReplaceChild("upper_body_r1", CubeListBuilder.create().texOffs(0, 39).addBox(-15.0F, -7.0F, -7.5F, 18.0F, 17.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0001F, 0.5F, 0.0F, 0.0F, 0.8727F));

        PartDefinition neck = upper.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-9.6582F, -11.662F, 0.0F));

        PartDefinition neck_feathers2_r1 = neck.addOrReplaceChild("neck_feathers2_r1", CubeListBuilder.create().texOffs(110, 34).addBox(-7.3859F, -5.0F, 3.0F, 5.0F, 14.0F, 0.0F, new CubeDeformation(-0.001F))
                .texOffs(110, 34).addBox(-7.3859F, -5.0F, -3.0F, 5.0F, 14.0F, 0.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(-4.0F, -6.0F, -0.5F, 0.0F, 0.0F, -0.3491F));

        PartDefinition neck1_r1 = neck.addOrReplaceChild("neck1_r1", CubeListBuilder.create().texOffs(32, 69).addBox(-4.0926F, -12.0062F, -3.5F, 8.0F, 14.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition neck_middle = neck.addOrReplaceChild("neck_middle", CubeListBuilder.create(), PartPose.offset(-4.8724F, -10.4815F, -0.001F));

        PartDefinition neck_feathers4_r1 = neck_middle.addOrReplaceChild("neck_feathers4_r1", CubeListBuilder.create().texOffs(56, 110).addBox(-6.0F, -5.0F, -9.499F, 3.0F, 16.0F, 0.0F, new CubeDeformation(-0.002F))
                .texOffs(56, 110).addBox(-6.0F, -5.0F, -14.499F, 3.0F, 16.0F, 0.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.8832F, -9.5421F, 11.5F, 0.0F, 0.0F, -0.2182F));

        PartDefinition neck2_r1 = neck_middle.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 89).addBox(-3.7645F, -15.4123F, -3.0F, 7.0F, 16.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1168F, 0.4579F, 0.001F, 0.0F, 0.0F, -0.2182F));

        PartDefinition head = neck_middle.addOrReplaceChild("head", CubeListBuilder.create().texOffs(75, 29).addBox(-2.0F, -2.0F, -3.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(74, 20).addBox(-8.9992F, -6.0012F, -3.0F, 13.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0135F, -13.8553F, 0.001F));

        PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(74, 29).addBox(-7.0F, 0.0F, -2.5F, 7.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offset(-2.0F, -2.0F, -0.5F));

        PartDefinition arm_left = upper.addOrReplaceChild("arm_left", CubeListBuilder.create(), PartPose.offset(-11.5441F, -4.9988F, -8.5F));

        PartDefinition upper_arm_left_r1 = arm_left.addOrReplaceChild("upper_arm_left_r1", CubeListBuilder.create().texOffs(98, 75).addBox(-2.4366F, -3.1953F, -1.5F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition lower_arm_left = arm_left.addOrReplaceChild("lower_arm_left", CubeListBuilder.create(), PartPose.offset(6.2761F, 7.1368F, -0.499F));

        PartDefinition forearm_left_r1 = lower_arm_left.addOrReplaceChild("forearm_left_r1", CubeListBuilder.create().texOffs(106, 0).addBox(-5.0F, -0.1167F, -2.0F, 5.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition hand_left = lower_arm_left.addOrReplaceChild("hand_left", CubeListBuilder.create().texOffs(80, 110).addBox(-0.4438F, 0.0417F, -1.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offset(-10.1323F, 5.8215F, -0.501F));

        PartDefinition claw_left3_r1 = hand_left.addOrReplaceChild("claw_left3_r1", CubeListBuilder.create().texOffs(86, 110).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.3562F, 1.0417F, -1.0F, 0.0F, 0.0F, -0.1745F));

        PartDefinition claw_left1_r1 = hand_left.addOrReplaceChild("claw_left1_r1", CubeListBuilder.create().texOffs(74, 110).addBox(0.0F, 0.0F, 0.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.6438F, -0.9583F, -1.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition arm_right = upper.addOrReplaceChild("arm_right", CubeListBuilder.create(), PartPose.offset(-11.5441F, -4.9988F, 8.5F));

        PartDefinition upper_arm_right_r1 = arm_right.addOrReplaceChild("upper_arm_right_r1", CubeListBuilder.create().texOffs(94, 100).addBox(-2.4366F, -3.1953F, -1.5F, 6.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition lower_arm_right = arm_right.addOrReplaceChild("lower_arm_right", CubeListBuilder.create(), PartPose.offset(6.2761F, 7.1368F, 0.5F));

        PartDefinition right_lower_arm_r1 = lower_arm_right.addOrReplaceChild("right_lower_arm_r1", CubeListBuilder.create().texOffs(24, 109).addBox(-5.0F, -0.1173F, -4.0F, 5.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0009F, 0.001F, 1.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition hand_right = lower_arm_right.addOrReplaceChild("hand_right", CubeListBuilder.create().texOffs(114, 114).addBox(-0.4438F, 0.0417F, -2.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offset(-10.1323F, 5.8215F, 0.5F));

        PartDefinition claw_right3_r1 = hand_right.addOrReplaceChild("claw_right3_r1", CubeListBuilder.create().texOffs(116, 48).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.3562F, 1.0417F, -2.0F, 0.0F, 0.0F, -0.1745F));

        PartDefinition claw_right1_r1 = hand_right.addOrReplaceChild("claw_right1_r1", CubeListBuilder.create().texOffs(114, 100).addBox(0.0F, 0.0F, 0.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.6438F, -0.9583F, -2.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition lower = body.addOrReplaceChild("lower", CubeListBuilder.create(), PartPose.offset(1.4156F, 0.4193F, -0.5F));

        PartDefinition lower_body_r1 = lower.addOrReplaceChild("lower_body_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-7.9289F, -10.0F, -10.0F, 18.0F, 20.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7574F, -0.7574F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition leg_left = lower.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(0, 69).addBox(-5.5F, -4.5F, -3.0F, 11.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2574F, 3.7427F, -10.0F));

        PartDefinition leg_lower_left = leg_left.addOrReplaceChild("leg_lower_left", CubeListBuilder.create().texOffs(46, 93).addBox(0.0441F, 0.0F, -3.0F, 7.0F, 12.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offset(-1.5441F, 10.5F, 0.0F));

        PartDefinition foot_left = leg_lower_left.addOrReplaceChild("foot_left", CubeListBuilder.create().texOffs(94, 93).addBox(-6.0F, -0.0001F, -3.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0441F, 12.0F, 0.0F));

        PartDefinition leg_right = lower.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(74, 0).addBox(-5.5F, -4.5F, -3.0F, 11.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.2574F, 3.7426F, 10.0F));

        PartDefinition leg_lower_right = leg_right.addOrReplaceChild("leg_lower_right", CubeListBuilder.create().texOffs(70, 93).addBox(0.0441F, 0.0F, -3.0F, 7.0F, 12.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offset(-1.5441F, 10.5F, 0.0F));

        PartDefinition foot_right = leg_lower_right.addOrReplaceChild("foot_right", CubeListBuilder.create().texOffs(98, 68).addBox(-6.0F, 0.0F, -3.0F, 10.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0441F, 12.0F, 0.0F));

        PartDefinition tail = lower.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(6.7895F, 6.4863F, 0.0F));

        PartDefinition tail_feathers2_r1 = tail.addOrReplaceChild("tail_feathers2_r1", CubeListBuilder.create().texOffs(68, 110).addBox(-10.0F, -9.0F, 5.5F, 3.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(68, 110).addBox(-10.0F, -9.0F, 16.5F, 3.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.2588F, 2.7966F, -11.5F, 0.0F, 0.0F, -1.0036F));

        PartDefinition tail1_r1 = tail.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(62, 39).addBox(-5.844F, 0.1204F, -6.0F, 13.0F, 18.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7412F, -2.2034F, 0.0F, 0.0F, 0.0F, -1.0036F));

        PartDefinition tail_middle = tail.addOrReplaceChild("tail_middle", CubeListBuilder.create(), PartPose.offset(14.2363F, 7.2989F, 0.0F));

        PartDefinition tail_feathers4_r1 = tail_middle.addOrReplaceChild("tail_feathers4_r1", CubeListBuilder.create().texOffs(40, 110).addBox(-9.0F, -9.0F, -4.5F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(40, 110).addBox(-9.0F, -9.0F, 4.5F, 4.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0224F, 0.4977F, -0.5F, 0.0F, 0.0F, -1.3526F));

        PartDefinition tail2_r1 = tail_middle.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(62, 68).addBox(-5.0046F, 0.2195F, -5.0F, 9.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9776F, -1.5023F, 0.0F, 0.0F, 0.0F, -1.3526F));

        PartDefinition tail_end = tail_middle.addOrReplaceChild("tail_end", CubeListBuilder.create(), PartPose.offset(12.9166F, 4.0094F, 0.0F));

        PartDefinition tail_feathers7_r1 = tail_end.addOrReplaceChild("tail_feathers7_r1", CubeListBuilder.create().texOffs(106, 15).addBox(-10.0F, 6.0F, -2.5F, 6.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 110).addBox(-10.0F, -9.0F, -2.5F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 110).addBox(-10.0F, -9.0F, 2.5F, 6.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.1058F, -1.5118F, -0.5F, 0.0F, 0.0F, -1.4835F));

        PartDefinition tail3_r1 = tail_end.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(24, 89).addBox(-3.2156F, -0.0343F, -3.0F, 6.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8942F, -1.5118F, 0.0F, 0.0F, 0.0F, -1.4835F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    //Calls all animations and animation states from TherizinosaurusAnimations
    @Override
    public void setupAnim(TherizinosaurusEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(TherizinosaurusAnimations.ANIM_THERI_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, TherizinosaurusAnimations.ANIM_THERI_IDLE, ageInTicks, 1f);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch){
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root(){
        return body;
    }
}
