package sh.nuro.projectcontainer.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import sh.nuro.projectcontainer.util.Reference;

public class ContainerBlockRed extends ContainerBlockDefault
{
    public ContainerBlockRed()
    {
        setUnlocalizedName(Reference.UnlocalizedNames.ContainerBlockRed);
        setRegistryName(Reference.RegistryNames.ContainerBlockRed);
        GameRegistry.registerBlock(this);
    }
}