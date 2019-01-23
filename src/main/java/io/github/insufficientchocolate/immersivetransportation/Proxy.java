package io.github.insufficientchocolate.immersivetransportation;

import io.github.insufficientchocolate.immersivetransportation.block.Blocks;
import io.github.insufficientchocolate.immersivetransportation.block.Rail;
import io.github.insufficientchocolate.immersivetransportation.item.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Proxy
{

	@SubscribeEvent
	public static void onRegisterItem(RegistryEvent.Register<Item> e) {
		e.getRegistry().register(Items.Rail);
	}

	@SubscribeEvent
	public static void onRegisterBlock(RegistryEvent.Register<Block> e) {
		e.getRegistry().register(Blocks.Rail);
	}
}
