package sh.nuro.projectcontainer.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import sh.nuro.projectcontainer.util.Reference;

public class ContainerBlockBlue extends ContainerBlockDefault
{
    public ContainerBlockBlue()
    {
        setUnlocalizedName(Reference.UnlocalizedNames.ContainerBlockBlue);
        setRegistryName(Reference.RegistryNames.ContainerBlockBlue);
        GameRegistry.registerBlock(this);
    }
}