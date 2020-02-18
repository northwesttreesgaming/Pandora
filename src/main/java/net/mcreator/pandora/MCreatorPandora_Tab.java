package net.mcreator.pandora;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Elementspandora.ModElement.Tag
public class MCreatorPandora_Tab extends Elementspandora.ModElement {
	public MCreatorPandora_Tab(Elementspandora instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpandora_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MCreatorStone.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
