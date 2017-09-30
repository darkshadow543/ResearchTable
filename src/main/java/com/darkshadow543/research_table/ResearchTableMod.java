package com.darkshadow543.research_table;
import com.darkshadow543.ResearchTable.proxy.CommonProxy;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;

import java.util.logging.Logger;

import com.darkshadow543.ResearchTable.blocks.*;

/**
 * Darkshadow543.
 * Research Table
 * Please do not copy my code and call it your own
 * That is quite frowned upon by society and is called plagarism
 */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION,
        acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class ResearchTableMod {

    @Mod.Instance
    public static ResearchTableMod thisMod;
    public static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = (Logger) event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}


