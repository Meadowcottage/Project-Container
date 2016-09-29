package uk.meadowcottage.projectcontainer.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.meadowcottage.projectcontainer.util.Reference;

public class ContainerBlockRed extends ContainerBlockDefault
{
    public ContainerBlockRed()
    {
        setUnlocalizedName(Reference.UnlocalizedNames.ContainerBlockRed);
        setRegistryName(Reference.RegistryNames.ContainerBlockRed);
        GameRegistry.registerBlock(this);
    }
}