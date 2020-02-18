package net.mcreator.pandora;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

@Elementspandora.ModElement.Tag
public class MCreatorHue_Palm_Forest extends Elementspandora.ModElement {
	@ObjectHolder("pandora:hue_palm_forest")
	public static final CustomBiome biome = null;

	public MCreatorHue_Palm_Forest(Elementspandora instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.JUNGLE);
	}

	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder()
					.downfall(0.66f)
					.depth(0.1f)
					.scale(0.15f)
					.temperature(0.95f)
					.precipitation(Biome.RainType.RAIN)
					.category(Biome.Category.JUNGLE)
					.waterColor(4159204)
					.waterFogColor(329011)
					.parent("jungle")
					.surfaceBuilder(
							SurfaceBuilder.DEFAULT,
							new SurfaceBuilderConfig(MCreatorHue_Palm_Grass.block.getDefaultState(), MCreatorDirt.block.getDefaultState(),
									MCreatorDirt.block.getDefaultState())));
			setRegistryName("hue_palm_forest");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
		}
	}
}
