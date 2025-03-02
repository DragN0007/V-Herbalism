package com.dragn0007.vherbalism.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class HerbalismCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue DEBUG_LOGS;
    public static final ForgeConfigSpec.ConfigValue<Double> SCENT_WASH_CHANCE;


    static {
        BUILDER.push("V-Herbalism");

        DEBUG_LOGS = BUILDER.comment("Show debug logs in the console?")
                .define("Show Debug Logs", false);

        SCENT_WASH_CHANCE = BUILDER.comment("Chance that a scent will wash away, per tick, when it's raining.")
                .define("Wash Away Scent Chance", 0.0002);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
