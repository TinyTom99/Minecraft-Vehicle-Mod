package com.VehicleMod.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.VehicleMod.lib.*;

@Mod(modid=RefVars.MODID, name=RefVars.NAME, version=RefVars.VERSION)
public class VehicleModMain
{
	@SidedProxy(clientSide=RefVars.CLIENTSIDE, serverSide=RefVars.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void preLoad(FMLPreInitializationEvent preEvent)
	{
		proxy.registerRenderInfo();
	}

	@EventHandler
	public static void load(FMLInitializationEvent event)
	{
		
	}

	@EventHandler
	public static void postLoad(FMLPostInitializationEvent postEvent)
	{
		
	}
}
