package proty.content;

import mindustry.gen.EntityMapping;
import mindustry.gen.UnitEntity;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.world.meta.Env;
import proty.AIndusMod;

import static mindustry.world.meta.Env.none;

//TODO 一つずつ、完成してから追加する。
//TODO 構想はしっかりと具体に落とし込む。
public class AIUnits {
    public static Weapon basicWeapon;
    /**
     * 武装
     */

    public static UnitType drone;
    /**
     * ドローン類
     */

    public static UnitType missile_battleship;
    /**
     * 航宙艦
     */

    public static UnitType alpha_unit, beta_unit, gamma_unit, omega_unit;
    /**
     * コアユニット
     */

    public static void notUsing() {
    }

    ;

    static {
        EntityMapping.nameMap.put(AIndusMod.name("testing"), EntityMapping.idMap[3]);
    }

    public static class AIUnitType_serpulo extends UnitType {
        public AIUnitType_serpulo(String name) {
            super(name);
            envDisabled = Env.scorching;

            ammoType = new ItemAmmoType(AIItems.titanium_alloy);
        }
    }

    public static class AIUnitType_erekir extends UnitType {
        public AIUnitType_erekir(String name) {
            super(name);
            envDisabled = Env.space;

            ammoType = new ItemAmmoType(AIItems.titanium_alloy);
        }
    }

    public static class AIUnitType_super extends UnitType {
        public AIUnitType_super(String name) {
            super(name);
            envDisabled = none;

            ammoType = new ItemAmmoType(AIItems.titanium_alloy);
        }
    }

    private static void loadSerpulo() {
        //Nothing here.
    }

    private static void loadErekir() {
        //Nothing here.
    }

    private static void loadMain() {
        missile_battleship = new AIUnitType_super("missile-battleship") {{
            hitSize = 60f;
            health = 200000;
            armor = 20;

            accel = 0.1f;
            drag = 0.01f;
            speed = 1.3f;

            rotateSpeed = 0.2f;
        }};
    }

    public static void load() {
        int BaseHP = 40;
//        drone = new AIUnitType_serpulo("testing") {{
//            hitSize = 8;
//            /*SIZE LIST
//            size1 == 1tile => 0.125block^2 == 0.125block * 0.125block
//            size2 == 2tile => 0.25block^2 == 0.25block * 0.25block
//            size4 == 4tile => 0.5block^2 == 0.5block * 0.5block
//            size8 == 8tile => 1block^2 == 1block * 1block
//            END*/
//            health = BaseHP * 10;
//            speed = 2;
//            /*SPEED Pattern
//            1 => 7.5tile/s
//            2 => 15tile/s
//            END*/
//            drag = 1;
//            /*About DRAG
//            慣性。数値が0に近いほど完全に停止するまで時間がかかる。数値が大きいほどピタッと止まる。1以上はあまり意味がなさそう。
//            END*/
//            accel = 0.8f;
//            /*ACCEL
//            Speedの(Accel*100)%分出力する。
//            END*/
//        }};

        //loadSerpulo();
        //loadErekir();
        //loadSuper();
    }
}
