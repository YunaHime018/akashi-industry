package proty.content;

import mindustry.type.SectorPreset;

import static proty.content.AIPlanets.*;

public class AISectorPresets {
    //TODO 各惑星のコンセプト・方向性を確定する。
    //TODO 各惑星のセクター数を決める。
    public static SectorPreset
            the_beginnings, final_research;
    /**荒廃した惑星用のセクター。*/
    public static SectorPreset
            retake_the_base, last_war;
    /**占拠された惑星。*/
    public static void load(){
        /*-----Ruined-----*/
        the_beginnings = new SectorPreset("the-beginnings", ruined_planet, 1);

        final_research = new SectorPreset("final-research", ruined_planet, 100);

        /*-----Occupied-----*/
        retake_the_base = new SectorPreset("retake-the-base", occupied_planet, 1);

        last_war = new SectorPreset("last-war", occupied_planet, 100);
    }

}
