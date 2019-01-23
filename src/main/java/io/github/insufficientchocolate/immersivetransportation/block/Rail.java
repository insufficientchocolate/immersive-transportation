package io.github.insufficientchocolate.immersivetransportation.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class Rail extends Block
{
	public Rail() {
		super(Material.ANVIL);
		setUnlocalizedName("rail");
		setRegistryName("rail");
		setLightOpacity(0);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
}
