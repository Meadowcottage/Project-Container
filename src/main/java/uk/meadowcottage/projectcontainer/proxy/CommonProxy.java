package uk.meadowcottage.projectcontainer.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.meadowcottage.projectcontainer.ModContent;

public class CommonProxy
{
    public void preinit(FMLPreInitializationEvent event)
    {
        ModContent.init();
    }
}
