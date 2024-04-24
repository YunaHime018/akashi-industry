package proty.content;

import arc.graphics.Color;
import mindustry.content.Liquids;
import mindustry.type.Liquid;

//TODO 過去作のものから改変する。
public class AILiquids extends Liquids {
    public static Liquid toxic_liquid;
    /**
     * ENV
     */
    public static Liquid deuterium, tritium;
    public static Liquid conductor_liquid, meter;
    /**
     * Main
     */
    public static void load() {
        deuterium = new Liquid("deuterium", Color.valueOf("41b9cb")) {{
            gas = true;
            flammability = 1.25f;
        }};
        tritium = new Liquid("tritium", Color.valueOf("927fff")) {{
            gas = true;
            flammability = 1.75f;
        }};
        conductor_liquid = new Liquid("conductor-liquid") {{
            heatCapacity = 1;
            temperature = 0.2f;
            viscosity = 0.7f;
        }};
        meter = new Liquid("meter", Color.valueOf("076c83")) {{
            heatCapacity = 999f;
            temperature = -273.15f;
            viscosity = 0.0000001f;
        }};
    }
}
