package sh.nuro.projectcontainer.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import sh.nuro.projectcontainer.blocks.ContainerBlockBlue;
import sh.nuro.projectcontainer.blocks.ContainerBlockGreen;
import sh.nuro.projectcontainer.blocks.ContainerBlockRed;

public class CommonProxy
{
    public static ContainerBlockBlue containerBlockBlue;
    public static ContainerBlockGreen containerBlockGreen;
    public static ContainerBlockRed containerBlockRed;

    public void preinit(FMLPreInitializationEvent event)
    {
        containerBlockBlue = new ContainerBlockBlue();
        containerBlockGreen = new ContainerBlockGreen();
        containerBlockRed = new ContainerBlockRed();
    }
}
