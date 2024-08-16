package com.rinko1231.ba_painting;


import com.rinko1231.ba_painting.init.PaintingsList;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("ba_painting")
@Mod.EventBusSubscriber(modid = BAPainting.MOD_ID, bus = Bus.MOD)
public class BAPainting
{
	public static final String MOD_ID = "ba_painting";
	public static BAPainting instance;
	
	public BAPainting()
	{
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::doClientStuff);

		PaintingsList.PAINTING_TYPES.register(modEventBus);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
			
	}

	
	private void setup(final FMLCommonSetupEvent event)
	{
	
	}
	
	
	private void doClientStuff(final FMLClientSetupEvent event)
	{
 
	}
	
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event)
	{
	
	}
	
}














