package com.darkshadow543.research_table;

/**
 * Created by sbeng on 5/27/2017.
 */
public class Reference {
    public static final String MOD_ID = "researchTable";
    public static final String NAME = "ResearchTable";
    public static final String VERSION = "1.0.0";
    public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.darkshadow543.research_table.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.darkshadow543.research_table.proxy.ServerProxy";
    public static enum ResearchTableNames{
        
    	RESERCHTABLE("block_research_table", "blockResearchTable");

        private String unlocalizedName;
        private String registryName;
        ResearchTableNames(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }
}
