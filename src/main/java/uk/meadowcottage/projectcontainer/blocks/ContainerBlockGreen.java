package uk.meadowcottage.projectcontainer.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.meadowcottage.projectcontainer.util.Reference;

public class ContainerBlockGreen extends ContainerBlockDefault
{
    public ContainerBlockGreen()
    {
        setUnlocalizedName(Reference.UnlocalizedNames.ContainerBlockGreen);
        setRegistryName(Reference.RegistryNames.ContainerBlockGreen);
        GameRegistry.registerBlock(this);
    }
}