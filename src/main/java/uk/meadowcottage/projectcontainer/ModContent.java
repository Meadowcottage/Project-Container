package uk.meadowcottage.projectcontainer;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import uk.meadowcottage.projectcontainer.blocks.ContainerBlockBlue;
import uk.meadowcottage.projectcontainer.blocks.ContainerBlockGreen;
import uk.meadowcottage.projectcontainer.blocks.ContainerBlockRed;

public class ModContent
{
    public static ContainerBlockBlue containerBlockBlue;
    public static ContainerBlockGreen containerBlockGreen;
    public static ContainerBlockRed containerBlockRed;

    public static void init()
    {
        containerBlockBlue = new ContainerBlockBlue();
        containerBlockGreen = new ContainerBlockGreen();
        containerBlockRed = new ContainerBlockRed();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        containerBlockBlue.initModel();
        containerBlockGreen.initModel();
        containerBlockRed.initModel();
    }
}
