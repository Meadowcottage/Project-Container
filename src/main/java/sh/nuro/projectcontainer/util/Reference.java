package sh.nuro.projectcontainer.util;

public class Reference
{
    public static final String MOD_ID = "projectcontainer";
    public static final String MOD_ID_POSTFIX = MOD_ID + ":";
    public static final String MOD_NAME = "Project Container";
    public static final String MOD_VERSION = "1.0.1";

    public static final String CommonProxy = "sh.nuro.projectcontainer.proxy.CommonProxy";
    public static final String ClientProxy = "sh.nuro.projectcontainer.proxy.ClientProxy";

    public static final class RegistryNames
    {
        public static final String ContainerBlockBlue = "ContainerBlockBlue";
        public static final String ContainerBlockGreen = "ContainerBlockGreen";
        public static final String ContainerBlockRed = "ContainerBlockRed";
    }
    public static final class UnlocalizedNames
    {
        public static final String ContainerBlockBlue = MOD_ID_POSTFIX + "ContainerBlockBlue";
        public static final String ContainerBlockGreen = MOD_ID_POSTFIX + "ContainerBlockGreen";
        public static final String ContainerBlockRed = MOD_ID_POSTFIX + "ContainerBlockRed";
    }
}
