package io.github.insufficientchocolate.immersivetransportation.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Rail extends Block
{
	public Rail() {
		super(Material.ANVIL);
		setUnlocalizedName("rail");
		setRegistryName("rail");
	}
}
