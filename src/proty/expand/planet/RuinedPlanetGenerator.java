package proty.expand.planet;

import arc.graphics.Color;
import arc.math.geom.Vec3;
import arc.util.noise.Simplex;
import mindustry.maps.generators.PlanetGenerator;
import mindustry.world.Block;
import proty.content.AIBlocks;

public class RuinedPlanetGenerator extends PlanetGenerator {
    Color c1 = Color.valueOf(""), c2 = Color.valueOf(""), out = new Color();

    Block[][] arr = {
            {AIBlocks.core_gamma}
    };

    {
        baseSeed = 1;
    }
    @Override
    public float getHeight(Vec3 position) {
        return 0;
    }

    @Override
    public Color getColor(Vec3 position) {
        float depth = Simplex.noise3d(seed, 2, 0.56, 1.7, position.x, position.y, position.z) /2f;
        return null;
    }
}
