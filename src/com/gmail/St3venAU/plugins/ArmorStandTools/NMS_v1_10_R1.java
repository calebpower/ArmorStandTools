package com.gmail.St3venAU.plugins.ArmorStandTools;

@SuppressWarnings("unused")
class NMS_v1_10_R1 extends NMS {

    public NMS_v1_10_R1() {
        super(
                "v1_10_R1",                             // NMS Version
                "ArmorStand",                           // Armor Stand summon name
                "bB",                                   // Disabled slots field name
                "a",                                    // getKey field name
                "IChatBaseComponent$ChatSerializer",    // ChatSerializer field name
                true                                    // Version has an off hand
        );
    }

}