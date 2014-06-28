package ca.xanten.letsmodfollow;

import ca.xanten.letsmodfollow.proxy.IProxy;
import ca.xanten.letsmodfollow.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class LetsModFollow {
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModFollow modInstance;

    @SidedProxy(clientSide = "ca.xanten.letsmodfollow.proxy.ClientProxy", serverSide = "ca.xanten.letsmodfollow.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvt)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent iniEvt)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent posEvt)
    {

    }

}
