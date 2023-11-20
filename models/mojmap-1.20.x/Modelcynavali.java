// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcynavali<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cynavali"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelcynavali(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.0F, -0.5F));

		PartDefinition SkullFront = head.addOrReplaceChild("SkullFront", CubeListBuilder.create().texOffs(16, 1).addBox(
				-1.5F, -7.0F, -3.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition SkullBack = head.addOrReplaceChild("SkullBack", CubeListBuilder.create().texOffs(1, 13).addBox(
				-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition SkullLeft = head.addOrReplaceChild("SkullLeft",
				CubeListBuilder.create().texOffs(31, 2).addBox(0.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -1.0F, -3.0F, 0.0F, 5.3931F, 0.0F));

		PartDefinition EyeLeftNormal = SkullLeft.addOrReplaceChild("EyeLeftNormal", CubeListBuilder.create()
				.texOffs(10, 122).addBox(0.0F, 0.0F, -0.05F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition EyeGlowLeftNormal = EyeLeftNormal.addOrReplaceChild("EyeGlowLeftNormal", CubeListBuilder.create()
				.texOffs(10, 128).addBox(0.0F, 0.0F, -0.1F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition MouthLeft0Normal = SkullLeft.addOrReplaceChild("MouthLeft0Normal", CubeListBuilder.create()
				.texOffs(58, 122).addBox(0.0F, 0.0F, -0.05F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition SkullRight = head.addOrReplaceChild("SkullRight",
				CubeListBuilder.create().texOffs(1, 2).addBox(-4.0F, -7.0F, 0.0F, 4.0F, 7.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -1.0F, -3.0F, 0.0F, 0.8901F, 0.0F));

		PartDefinition EyeRightNormal = SkullRight.addOrReplaceChild("EyeRightNormal", CubeListBuilder.create()
				.texOffs(1, 122).addBox(-4.0F, 0.0F, -0.05F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition EyeGlowRightNormal = EyeRightNormal.addOrReplaceChild("EyeGlowRightNormal", CubeListBuilder
				.create().texOffs(1, 128).addBox(-4.0F, 0.0F, -0.1F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition MouthRight0Normal = SkullRight.addOrReplaceChild("MouthRight0Normal", CubeListBuilder.create()
				.texOffs(40, 122).addBox(-2.0F, 0.0F, -0.05F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition Snout = head.addOrReplaceChild("Snout",
				CubeListBuilder.create().texOffs(26, 13).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition MouthLeft1Normal = Snout.addOrReplaceChild(
				"MouthLeft1Normal", CubeListBuilder.create().texOffs(45, 122).addBox(-0.03F, 0.0F, -0.05F, 1.0F, 3.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, -3.0F, 0.0F, 0.0F, 4.7124F, 0.0F));

		PartDefinition MouthFrontNormal = Snout.addOrReplaceChild("MouthFrontNormal", CubeListBuilder.create()
				.texOffs(48, 122).addBox(-1.5F, 0.0F, -0.05F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -3.0F, 0.0F));

		PartDefinition MouthRight1Normal = Snout.addOrReplaceChild("MouthRight1Normal",
				CubeListBuilder.create().texOffs(55, 122).addBox(-0.94F, 0.0F, -0.05F, 1.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -3.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition EarTopLeft = head.addOrReplaceChild("EarTopLeft",
				CubeListBuilder.create().texOffs(48, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.0F, 2.0F, 1.0472F, 5.8469F, 3.2289F));

		PartDefinition EarTopLeftInner = EarTopLeft
				.addOrReplaceChild("EarTopLeftInner",
						CubeListBuilder.create().texOffs(74, 1).addBox(-1.0F, -8.6F, -0.6F, 2.0F, 8.8F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 5.8643F, 0.0F, 0.0F));

		PartDefinition EarTopRight = head.addOrReplaceChild("EarTopRight",
				CubeListBuilder.create().texOffs(61, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -7.0F, 2.0F, 1.0472F, 0.4363F, 3.0543F));

		PartDefinition OutfitEarTopRight = EarTopRight.addOrReplaceChild("OutfitEarTopRight", CubeListBuilder.create()
				.texOffs(163, 1).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.4F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition EarTopRightInner = EarTopRight.addOrReplaceChild(
				"EarTopRightInner", CubeListBuilder.create().texOffs(79, 1).addBox(-1.0F, -8.6F, -0.6F, 2.0F, 8.8F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 0.0F, 5.8643F, 0.0F, 0.0F));

		PartDefinition EarBottomLeft = head.addOrReplaceChild("EarBottomLeft",
				CubeListBuilder.create().texOffs(48, 16).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.0F, 1.5F, 2.2689F, 5.9341F, 3.002F));

		PartDefinition EarBottomLeftInner = EarBottomLeft.addOrReplaceChild(
				"EarBottomLeftInner", CubeListBuilder.create().texOffs(74, 10).addBox(-1.0F, -6.5F, -0.6F, 2.0F, 6.6F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, 0.0F, 5.8992F, 0.0F, 0.0F));

		PartDefinition EarBottomRight = head.addOrReplaceChild("EarBottomRight",
				CubeListBuilder.create().texOffs(59, 16).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.0F, 1.5F, 2.2689F, 0.3491F, 3.2812F));

		PartDefinition EarBottomRightInner = EarBottomRight.addOrReplaceChild(
				"EarBottomRightInner", CubeListBuilder.create().texOffs(79, 11).addBox(-1.0F, -6.5F, -0.6F, 2.0F, 6.6F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.5F, 0.0F, 5.8992F, 0.0F, 0.0F));

		PartDefinition FeathersCrestTop = head.addOrReplaceChild("FeathersCrestTop",
				CubeListBuilder.create().texOffs(78, 1).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 0.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -1.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition FeathersCrestBack = head.addOrReplaceChild(
				"FeathersCrestBack", CubeListBuilder.create().texOffs(86, 10).addBox(-3.5F, -8.0F, 0.0F, 7.0F, 8.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 4.0F, 3.4034F, 0.0F, 0.0F));

		PartDefinition FeathersCrestSide = head.addOrReplaceChild("FeathersCrestSide",
				CubeListBuilder.create().texOffs(86, 12).addBox(0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.5F, 6.0F, 3.6652F, 0.0F, 3.1416F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Neck = body.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(1, 27).addBox(-2.0F,
				-1.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Chest = body
				.addOrReplaceChild("Chest",
						CubeListBuilder.create().texOffs(1, 33).addBox(-3.0F, 1.0F, -2.0F, 6.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 6.1087F, 0.0F, 0.0F));

		PartDefinition FeathersChest = Chest
				.addOrReplaceChild("FeathersChest",
						CubeListBuilder.create().texOffs(16, 27).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, -2.0F, 6.1087F, 0.0F, 0.0F));

		PartDefinition Torso = body.addOrReplaceChild("Torso",
				CubeListBuilder.create().texOffs(1, 42).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 6.0F, 4.0F,
						new CubeDeformation(-0.3F)),
				PartPose.offsetAndRotation(0.0F, 3.94F, -0.71F, 0.1745F, 0.0F, 0.0F));

		PartDefinition Pelvis = Torso
				.addOrReplaceChild("Pelvis",
						CubeListBuilder.create().texOffs(1, 53).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.8378F, 0.0F, 0.0F));

		PartDefinition Tail0 = Pelvis
				.addOrReplaceChild("Tail0",
						CubeListBuilder.create().texOffs(1, 64).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 2.0F, 0.2967F, 0.0F, 0.0F));

		PartDefinition Tail1 = Tail0
				.addOrReplaceChild("Tail1",
						CubeListBuilder.create().texOffs(1, 75).addBox(-1.5F, -1.0F, -2.5F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 4.0F, 1.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1
				.addOrReplaceChild("Tail2",
						CubeListBuilder.create().texOffs(1, 85).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 8.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 0.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2
				.addOrReplaceChild("Tail3",
						CubeListBuilder.create().texOffs(1, 96).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3
				.addOrReplaceChild("Tail4",
						CubeListBuilder.create().texOffs(1, 106).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 12.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition FeathersTailLeft = Tail4.addOrReplaceChild(
				"FeathersTailLeft", CubeListBuilder.create().texOffs(11, 102).addBox(0.0F, 0.0F, -0.95F, 10.0F, 16.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.5F, 0.0F, 0.6109F, 0.0F));

		PartDefinition FeathersTailRight = Tail4.addOrReplaceChild(
				"FeathersTailRight", CubeListBuilder.create().texOffs(34, 102).addBox(-10.0F, 0.0F, -0.95F, 10.0F,
						16.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.5F, 0.0F, 5.6723F, 0.0F));

		PartDefinition FeathersSkirtLeft0 = Tail0.addOrReplaceChild("FeathersSkirtLeft0",
				CubeListBuilder.create().texOffs(35, 87).addBox(0.0F, -5.0F, -3.0F, 0.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 1.0F, 1.5F, 0.0349F, 4.8869F, 0.3491F));

		PartDefinition FeatherSkirtLeft1 = FeathersSkirtLeft0.addOrReplaceChild(
				"FeatherSkirtLeft1", CubeListBuilder.create().texOffs(42, 84).addBox(0.0F, -5.0F, -6.0F, 0.0F, 9.0F,
						6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition FeathersSkirtRight0 = Tail0.addOrReplaceChild("FeathersSkirtRight0",
				CubeListBuilder.create().texOffs(28, 87).addBox(0.0F, -5.0F, 0.0F, 0.0F, 9.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 1.0F, 1.5F, 6.2483F, 4.5379F, 5.9341F));

		PartDefinition FeatherSkirtRight1 = FeathersSkirtRight0.addOrReplaceChild(
				"FeatherSkirtRight1", CubeListBuilder.create().texOffs(15, 84).addBox(0.0F, -5.0F, 0.0F, 0.0F, 9.0F,
						6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.0F, 0.0F, 5.236F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(),
				PartPose.offset(4.5F, 3.0F, 0.0F));

		PartDefinition LeftArm = left_arm
				.addOrReplaceChild("LeftArm",
						CubeListBuilder.create().texOffs(37, 30).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 12.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.1959F));

		PartDefinition FeathersWingLeft = LeftArm.addOrReplaceChild(
				"FeathersWingLeft", CubeListBuilder.create().texOffs(24, 34).addBox(0.0F, 0.0F, -6.0F, 0.0F, 20.0F,
						12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(),
				PartPose.offset(-4.5F, 3.0F, 0.0F));

		PartDefinition RightArm = right_arm
				.addOrReplaceChild("RightArm",
						CubeListBuilder.create().texOffs(24, 30).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 12.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition FeathersWingRight = RightArm.addOrReplaceChild(
				"FeathersWingRight", CubeListBuilder.create().texOffs(24, 55).addBox(0.0F, 0.0F, -6.0F, 0.0F, 20.0F,
						12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(),
				PartPose.offset(1.9F, 9.0F, 0.0F));

		PartDefinition ThighLeft = left_leg.addOrReplaceChild("ThighLeft",
				CubeListBuilder.create().texOffs(69, 30).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.25F, -1.0F, -0.2F, 6.0214F, 6.1959F, 6.1785F));

		PartDefinition CalfLeft = ThighLeft
				.addOrReplaceChild("CalfLeft",
						CubeListBuilder.create().texOffs(69, 42).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition FootLeft = CalfLeft
				.addOrReplaceChild("FootLeft",
						CubeListBuilder.create().texOffs(69, 52).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, 5.1487F, 0.0F, 0.0F));

		PartDefinition ToesBottomLeft = FootLeft
				.addOrReplaceChild("ToesBottomLeft",
						CubeListBuilder.create().texOffs(69, 65).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 7.8F, 1.0F, 3.5081F, 0.0F, 0.0F));

		PartDefinition ToesTopLeft = FootLeft.addOrReplaceChild("ToesTopLeft",
				CubeListBuilder.create().texOffs(69, 72).addBox(-1.5F, -1.0F, -0.94F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.69F, -0.8F, 4.2761F, 0.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(),
				PartPose.offset(-1.9F, 9.0F, 0.0F));

		PartDefinition ThighRight = right_leg.addOrReplaceChild("ThighRight",
				CubeListBuilder.create().texOffs(52, 30).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 5.0F,
						new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(-0.25F, -1.0F, -0.2F, 6.0214F, 0.0873F, 0.1047F));

		PartDefinition CalfRight = ThighRight
				.addOrReplaceChild("CalfRight",
						CubeListBuilder.create().texOffs(52, 42).addBox(-1.5F, 0.0F, -1.0F, 3.0F, 6.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 1.0472F, 0.0F, 0.0F));

		PartDefinition FootRight = CalfRight
				.addOrReplaceChild("FootRight",
						CubeListBuilder.create().texOffs(52, 52).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 9.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 1.0F, 5.1487F, 0.0F, 0.0F));

		PartDefinition ToesBottomRight = FootRight.addOrReplaceChild(
				"ToesBottomRight", CubeListBuilder.create().texOffs(52, 65).addBox(-1.5F, -0.8F, -0.2F, 3.0F, 2.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.8F, 1.0F, 3.5081F, 0.0F, 0.0F));

		PartDefinition ToesTopRight = FootRight.addOrReplaceChild("ToesTopRight",
				CubeListBuilder.create().texOffs(52, 72).addBox(-1.5F, -1.0F, -0.94F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.69F, -0.8F, 4.2761F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}