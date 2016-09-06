package uk.meadowcottage.projectcontainer.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.meadowcottage.projectcontainer.ModContent;

public class ClientProxy extends CommonProxy
{
    public void preinit(FMLPreInitializationEvent event)
    {
        super.preinit(event);
        ModContent.initModels();
    }
}
