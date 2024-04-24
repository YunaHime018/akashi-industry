package proty.content;

import arc.graphics.Color;
import arc.struct.Seq;
import mindustry.content.Items;
import mindustry.type.Item;

//TODO リリースプランを考える。
public class AIItems extends Items {
    public static Item
            titanium_alloy;
    /**
     * For Serpulo
     */

    public static Item tungastano;
    /**
     * For Erekir
     */

    public static Item
            yunametal,
            processor, super_processor, yuna_core,
            uranium, plutonium, depleted_uranium,
            nuke_bullet, nuke, du_ammo, matter, antimatter;
    /**
     * Main
     */

    public static final Seq<Item> proty_items_serpulo = new Seq<>();
    public static final Seq<Item> proty_items_erekir = new Seq<>();
    public static final Seq<Item> proty_items_main = new Seq<>();

    public static void load() {
        /*----------serpulo----------*/
        titanium_alloy = new Item("titanium-alloy", Color.valueOf("84a2d4")) {{
            cost = 2.5f;
        }};//Done
        /*--------------------*/
        /*----------erekir----------*/
        tungastano = new Item("tungastano", Color.valueOf("9ca3be")) {{
            cost = 1.5f;
        }};//Done
        /*--------------------*/
        /*----------main----------*/
        yunametal = new Item("yunametal", AIColorPalette.baseMainColor) {{
            cost = 4;
            healthScaling = 1.32f;
        }};//TODO オリジナル金属と関連アイテムを設定する
        processor = new Item("processor", AIColorPalette.coreLightColor) {{
            cost = 0.4f;
        }};
        super_processor = new Item("super-processor", AIColorPalette.baseMainColor) {{
            cost = 0.43f;
        }};
        yuna_core = new Item("yuna-core", AIColorPalette.baseMainDark) {{
            cost = 2.5f;
        }};

        matter = new Item("matter", Color.valueOf("8300ff")) {{
            cost = 0.5f;
            buildable = false;
        }};//Done
        antimatter = new Item("antimatter", Color.valueOf("434343")) {{
            cost = 0.5f;
            buildable = false;
        }};//Done
        /*--------------------*/
        proty_items_serpulo.addAll(
                titanium_alloy
        );
        proty_items_erekir.addAll(
                tungastano
        );
        proty_items_main.addAll(
                yunametal, processor, super_processor, yuna_core, uranium, plutonium, depleted_uranium, nuke_bullet, nuke, du_ammo, matter, antimatter
        );
        erekirOnlyItems.addAll(proty_items_erekir).removeAll(proty_items_serpulo);
    }
}
