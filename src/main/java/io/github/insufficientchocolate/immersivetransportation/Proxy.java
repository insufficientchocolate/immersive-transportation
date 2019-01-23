package io.github.insufficientchocolate.immersivetransportation;

import io.github.insufficientchocolate.immersivetransportation.block.Blocks;
import io.github.insufficientchocolate.immersivetransportation.block.Rail;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Proxy
{

	@SubscribeEvent
	public static void onRegisterItem(RegistryEvent.Register<Item> e) {
	}

	@SubscribeEvent
	public static void onRegisterBlock(RegistryEvent.Register<Block> e) {
		e.getRegistry().register(Blocks.Rail);
	}
}
