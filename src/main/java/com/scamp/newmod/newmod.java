package com.scamp.newmod;

import com.scamp.newmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="newmod", name="New Mod", version="1.7.2-1.0")
public class newmod
{
    @Mod.Instance("newmod")
  public static newmod instance;

    @SidedProxy(clientSide = "com.scamp.newmod.proxy.ClientProxy", serverSide = "com.scamp.newmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
