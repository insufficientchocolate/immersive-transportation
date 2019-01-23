package io.github.insufficientchocolate.immersivetransportation.item;

import io.github.insufficientchocolate.immersivetransportation.block.Blocks;
import net.minecraft.item.ItemBlock;

public class Rail extends ItemBlock
{
	public Rail()
	{
		super(Blocks.Rail);
		setUnlocalizedName("rail");
		setRegistryName("rail");
	}
}
