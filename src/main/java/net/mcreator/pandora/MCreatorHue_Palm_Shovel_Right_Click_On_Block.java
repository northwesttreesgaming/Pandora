package net.mcreator.pandora;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Random;

@Elementspandora.ModElement.Tag
public class MCreatorHue_Palm_Shovel_Right_Click_On_Block extends Elementspandora.ModElement {
	public MCreatorHue_Palm_Shovel_Right_Click_On_Block(Elementspandora instance) {
		super(instance, 44);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorHue_Palm_Shovel_Right_Click_On_Block!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MCreatorHue_Palm_Grass.block.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS_PATH.getDefaultState(), 3);
			if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
				if (itemstack.attemptDamageItem((int) 1, new Random(), null)) {
					itemstack.shrink(1);
					itemstack.setDamage(0);
				}
			}
		}
	}
}
