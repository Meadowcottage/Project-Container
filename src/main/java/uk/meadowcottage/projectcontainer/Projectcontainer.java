package uk.meadowcottage.projectcontainer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.meadowcottage.projectcontainer.proxy.CommonProxy;
import uk.meadowcottage.projectcontainer.util.LogHelper;
import uk.meadowcottage.projectcontainer.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Projectcontainer
{
    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.CommonProxy)
    public static CommonProxy proxy;

    @Mod.Instance(Reference.MOD_ID)
    public static Projectcontainer instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre-init");
        proxy.preinit(event);
    }

    /**
     *	Mod  init
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Init");
    }

    /**
     *	Mod  Post init
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-init");
    }
}
