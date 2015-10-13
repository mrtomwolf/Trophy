package com.tomwolf.trophy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid=Trophy.MODID, name=Trophy.MODNAME, version=Trophy.VERSION)
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Trophy {
	
    public static final String MODID = "TomWolfTrophy";
    public static final String MODNAME = "Trophy";
    public static final String VERSION = "0.0.0";

        // The instance of your mod that Forge uses.
	@Instance(value = "TomWolfTrophy")
	public static Trophy instance;
	
	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="tomwolf.trophy.client.ClientProxy", serverSide="tomwolf.trophy.server.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler // used in 1.6.2
	//@PreInit    // used in 1.5.2
	public void preInit(FMLPreInitializationEvent e) {
		// Stub Method
		proxy.preInit(e);
	}
	
	@EventHandler // used in 1.6.2
	//@Init       // used in 1.5.2
	public void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler // used in 1.6.2
	//@PostInit   // used in 1.5.2
	public void postInit(FMLPostInitializationEvent e) {
		// Stub Method
	}
}