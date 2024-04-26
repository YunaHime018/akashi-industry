package proty;

import arc.Core;
import arc.Events;
import arc.util.Log;
import arc.util.Time;
import mindustry.game.EventType.ClientLoadEvent;
import mindustry.mod.Mod;
import mindustry.mod.Mods;
import mindustry.ui.dialogs.BaseDialog;
import proty.content.*;

public class AIndusMod extends Mod {
    public static final String MOD_RELEASES = "https://github.com/yuna-akashi/AIndusMod/releases";
    public static final String MOD_REPO = "yuna-akashi/AIndusMod";
    public static final String MOD_GITHUB_URL = "https://github.com/yuna-akashi/AIndusMod";
    public static final String MOD_NAME = "proty-beta";

    public static Mods.LoadedMod MOD;

    public static String name(String name) {
        return MOD_NAME + "-" + name;
    }


    public AIndusMod() {
        Log.info("Loaded AkashiIndustryMod constructor.");

        //TODO ダイアログの作成。
        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                BaseDialog dialogMain = new BaseDialog("MOD LOADED");
                dialogMain.cont.add("赤石工業").row();
                dialogMain.cont.image(Core.atlas.find("proty-beta-icon2")).pad(20f).row();
                dialogMain.cont.add("This mod's language is Japanese. Also support zh_TW.").row();
                dialogMain.cont.add().row();
                dialogMain.cont.add("IMPORTANT").row();
                dialogMain.cont.add("English is not officially supported in this mod.").row();
                dialogMain.cont.button("ACCEPT", dialogMain::hide).size(200f, 50f);
                dialogMain.show();
            });
        });
    }

    @Override
    public void loadContent() {
        {
            AIPlanets.load();
            AIItems.load();
            AILiquids.load();
            AIUnits.load();
            AIBlocks.load();

            AITechTree.load();
        }

        Log.info("Loading some Akashi-Industry content.");
    }

}
