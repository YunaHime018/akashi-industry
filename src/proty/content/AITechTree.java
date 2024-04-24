package proty.content;

import mindustry.content.Planets;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeRoot;
import static proty.content.AIBlocks.*;

//TODO 各惑星のテックツリーにするのか、単一でどこの惑星からでもアクセスできるようにするのか。
//TODO 可視性を確保する。
//TODO 完成したものから追加する。実装するものを追加する。
public class AITechTree {
    private static void loadSer() {
        Planets.serpulo.techTree = nodeRoot("ai-serpulo", titanium_a_smelter, () -> {
            node(titanium_a_wall, () -> {
                node(titanium_a_wall_large);
            });
        });
    }
    private static void loadEre(){
        Planets.erekir.techTree = nodeRoot("ai-erekir", tungastano_smelter, () -> {});
    }
    private static void loadMain(){

        nodeRoot("ai-main", core_alpha, true, () -> {
            node(core_beta, () -> {
                node(core_gamma, () -> {
                    node(core_yuna);
                });
            });
        });
    }
    public static void load(){
        loadSer();
        //loadEre();
        //loadMain();
    }
}
