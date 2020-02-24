package net.mcreator.pandora;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

@Elementspandora.ModElement.Tag
public class MCreatorThornwhipMobplayerCollidesWithPlant extends Elementspandora.ModElement {
	public MCreatorThornwhipMobplayerCollidesWithPlant(Elementspandora instance) {
		super(instance, 50);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorThornwhipMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vec3d(0.25D, (double) 0.05F, 0.25D));
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.25);
	}
}
