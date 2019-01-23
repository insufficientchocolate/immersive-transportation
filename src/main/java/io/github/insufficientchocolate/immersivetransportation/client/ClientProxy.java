package io.github.insufficientchocolate.immersivetransportation.client;

import io.github.insufficientchocolate.immersivetransportation.ImmersiveTransportation;
import io.github.insufficientchocolate.immersivetransportation.Proxy;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends Proxy
{
	@SubscribeEvent
	public void onRegisterModels(ModelRegistryEvent e)
	{
		OBJLoader.INSTANCE.addDomain(ImmersiveTransportation.MODID);
	}
}
