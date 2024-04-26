package proty.content;

import arc.graphics.Color;
import mindustry.content.*;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;
import static proty.content.AIItems.*;

public class AIBlocks extends Blocks {
    //TODO ベースは追加しても良いが、一つずつ完成してから追加する。
    //TODO 各惑星を構成する要素を確定させる。→どんな地質なのか、どんな建造物があるのかなど。
    public static Block
            ruined_wall, static_unit, ancient_wall_unit,
            metal_ore;
    /**
     * 惑星を構成するブロック類
     */
    public static Block
            titanium_a_wall, titanium_a_wall_large,
            titanium_a_smelter, metal_smelter;
    /**
     * セルプロ用のブロック。
     */

    public static Block
            tungastano_wall, tungastano_wall_large,
            tungastano_smelter, metal_arc_smelter;
    /**
     * エレキル用のブロック。
     */

    public static Block
            /*-----Region Wall-----------*/
            ym_wall, ym_wall_l, super_wall, super_wall_armored,

            /*-----Region Factory--------*/
            metal_melter, yunametal_generator, yunametal_generator_advanced, processor_factory, y_processor_factory,
            deuterium_chamber, tritium_chamber,

            /*-----region CoreBlocks-----*/
            core_tamago, core_tungas,
            core_alpha, core_beta, core_gamma, core_yuna,
            /*-----region turrets-----*/
            t_a_turret, t_a__turret
            ;
    /**
     * 主要ブロック。ほとんどのブロックはここに追加する。
     */

    public static void load() {
        int BHP = 120;
        int wallHPMultiplier = 4;
        int armorHPMultiplier = 8;
        /*----------Region Wall----------*/
        //serpulo
        titanium_a_wall = new Wall("titanium-a-wall") {{
            size = 1;
            health = size * size * (BHP + 50) * wallHPMultiplier;

            requirements(Category.defense, with(titanium_alloy, 8));
        }};//Done
        titanium_a_wall_large = new Wall("titanium-a-wall-large") {{
            size = 2;
            health = size * size * (BHP + 50) * wallHPMultiplier;

            requirements(Category.defense, with(titanium_alloy, 32));
        }};//Done
        //erekir
        //main
        ym_wall = new Wall("yunametal-wall"){{
            size = 1;
            health = size * size * (BHP+180) * wallHPMultiplier;

            requirements(Category.defense, with(yunametal, 8));
        }};
        ym_wall_l = new Wall("yunametal-wall-large"){{
            size = 2;
            health = size * size * (BHP+180) * wallHPMultiplier;

            requirements(Category.defense, with(yunametal, 32));
        }};
        super_wall = new Wall("super-wall") {{
            size = 2;
            health = size * size * (BHP + 480) * wallHPMultiplier * armorHPMultiplier;
            armor = 200;

            requirements(Category.defense, with(matter, 32));
        }};//Done
        /*-----End Region-----*/

        /*----------Region Production----------*/
        //serpulo
        titanium_a_smelter = new GenericCrafter("titanium-a-smelter") {{
            size = 2;
            health = size * size * BHP;

            hasItems = hasPower = true;
            itemCapacity = 16;
            craftTime = 1.43f * 60f;

            consumePower(0.50f);
            consumeItems(with(Items.titanium, 2, Items.copper, 1, Items.lead, 1));
            outputItems = with(titanium_alloy, 1);

            drawer = new DrawMulti(
                    new DrawDefault(), new DrawFlame(Color.valueOf("ffc099"))
            );
            craftEffect = Fx.smeltsmoke;
            ambientSound = Sounds.smelter;

            requirements(Category.crafting, with(Items.copper, 16, Items.lead, 10));
        }};
        //erekir
        tungastano_smelter = new GenericCrafter("tungastano-smelter") {{
            size = 2;
            health = size * size * BHP;

            hasItems = hasPower = hasLiquids = true;
            itemCapacity = 30;
            craftTime = 1.2f * 60f;

            consumePower(1);
            consumeItems(with(Items.tungsten, 2));
            consumeLiquids(LiquidStack.with(Liquids.ozone, 2f));

            researchCost = with(Items.tungsten, 1200, Items.oxide, 900, Items.beryllium, 2400);

            requirements(Category.crafting, BuildVisibility.hidden, with(Items.tungsten, 60, Items.beryllium, 20));
        }};
        //main
        yunametal_generator = new GenericCrafter("yunametal-generator"){{
            size = 3;
            health = BHP * size * size;

            consumePower(10);
            consumeItems(with(Items.surgeAlloy, 3, Items.graphite, 1));
            consumeLiquids(LiquidStack.with(Liquids.water, 20));
            outputItems = with(yunametal, 1);
            craftTime = 3.33f * 60f;

            requirements(Category.crafting, with(Items.surgeAlloy, 120, Items.graphite, 80));
        }};
        /*-----End Region-----*/

        /*----------Region Storage----------*/
        core_alpha = new CoreBlock("core-alpha") {{
            size = 4;
            health = BHP * size * size;

            itemCapacity = 4200;
            unitCapModifier = 10;

            unitType = UnitTypes.alpha;

            requirements(Category.effect, with(yunametal, 200, Items.graphite, 40));
        }};

        core_beta = new CoreBlock("core-beta") {{
            size = 4;
            health = BHP * size * size;

            itemCapacity = 6300;
            unitCapModifier = 20;

            unitType = UnitTypes.beta;

            requirements(Category.effect, with(yunametal, 400, graphite, 80));
        }};

        core_gamma = new CoreBlock("core-gamma") {{
            size = 4;
            health = BHP * size * size;

            itemCapacity = 10500;
            unitCapModifier = 30;

            unitType = UnitTypes.gamma;

            requirements(Category.effect, with(yunametal, 800, graphite, 160));
        }};

        core_yuna = new CoreBlock("core-yuna"){{
            size = 9;
            health = BHP * size * size * armorHPMultiplier;

            itemCapacity = size * size * 1000;
            unitCapModifier = 60;

            unitType = UnitTypes.emanate;

            requirements(Category.effect, with(yunametal, 86400, super_processor, 2000, yuna_core, 500));
        }};
        /*-----End Region-----*/
    }
}
