package io.github.insufficientchocolate.immersivetransportation;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ImmersiveTransportation.MODID,version = ImmersiveTransportation.VERSION,name = ImmersiveTransportation.NAME)
public class ImmersiveTransportation
{
	public static final String MODID = "immersivetransportation";
	public static final String VERSION = "0.0.0";
	public static final String NAME = "Immersive Transportation";

	@SidedProxy(serverSide = "io.github.insufficientchocolate.immersivetransportation.Proxy", clientSide = "io.github.insufficientchocolate.immersivetransportation.client.ClientProxy")
	private static Proxy proxy;

	@Mod.EventHandler
	public void onPreInit(FMLPreInitializationEvent e)
	{
		MinecraftForge.EVENT_BUS.register(proxy);
	}
}
