package proty.expand.blocks.turrets;

import arc.struct.EnumSet;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import proty.util.meta.AIBlockFlag;

//TODO ブロックの仕組みを理解する。
//TODO 作りたいブロック・その仕様を明確にする。
public class RailgunTurret extends ItemTurret {
    public EnumSet<AIBlockFlag> flags;
    public RailgunTurret(String name) {
        super(name);
        flags = EnumSet.of(AIBlockFlag.railgunTurret);
    }
}
