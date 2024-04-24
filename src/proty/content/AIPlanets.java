package proty.content;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.graphics.g3d.HexMesh;
import mindustry.maps.planet.TantrosPlanetGenerator;
import mindustry.type.Planet;
import mindustry.world.meta.Env;

public class AIPlanets {
    //TODO 「ステージとなる惑星・星」「ただの惑星・星」などを決める。
    //TODO アステロイド追加の可否を決める。
    public static Planet
            another_sun,
            /**恒星*/
            asteroid_a, asteroid_b, asteroid_c,
            /**ただのアステロイド。*/
            ruined_planet, occupied_planet, non_edited_planet,
            /**ステージとなる惑星、そうでない惑星を追加する。現段階では2個分。*/
            ruined_moon, non_edited_moon_1, non_edited_moon_2, non_edited_moon_3
            /*英語めんどい。とりあえず、ステージが用意されているか関係なく惑星に衛星配置する。*/
            ;

    //TODO 各惑星の色を決める。
    //TODO ベースを確定させ、完成してから追加する。
    public static void load(){
        /*----------Region SUN----------*/
/*      another_sun = new Planet("another-sun", Planets.sun, 10){{
            bloom = true;
            accessible = false;

            meshLoader = () -> new SunMesh(
                    this, 4,
                    5, 0.3, 1.7, 1.2, 1,
                    1.1f,
                    Color.valueOf("ff7a38"),
                    Color.valueOf("ff9638"),
                    Color.valueOf("ffc64c"),
                    Color.valueOf("ffc64c"),
                    Color.valueOf("ffe371"),
                    Color.valueOf("f4ee8e")
            );
        }};*/

        /*----------Region PLANET----------*/
        ruined_planet = new Planet("ruined-planet", Planets.sun, 9, 3){{
            //TODO 滅亡した惑星用のジェネレーターの作成。
            //TODO メッシュの作成。
            //TODO カスタムの値に変更する。
            //TODO カスタムのチームを実装したいが、どうだかな。
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = true;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
        ruined_moon = new Planet("ruined-moon", ruined_planet, 1f){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};

        occupied_planet = new Planet("occupied-planet", Planets.sun, 10){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};

        non_edited_planet = new Planet("nep-ixv", Planets.sun, 11){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
        non_edited_moon_1 = new Planet("nem-i", non_edited_planet, 1){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
        non_edited_moon_2 = new Planet("nem-ii", non_edited_planet, 2){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
        non_edited_moon_3 = new Planet("nem-iii", non_edited_planet, 3){{
            generator = new TantrosPlanetGenerator();
            meshLoader = () -> new HexMesh(this, 4);
            accessible = false;
            visible = true;
            atmosphereColor = Color.valueOf("3db899");
            iconColor = Color.valueOf("597be3");
            startSector = 10;
            atmosphereRadIn = -0.01f;
            atmosphereRadOut = 0.3f;
            defaultEnv = Env.underwater | Env.terrestrial;
            ruleSetter = r -> {

            };
        }};
    }
}