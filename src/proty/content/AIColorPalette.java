package proty.content;

import arc.graphics.Color;
import arc.graphics.Colors;

public class AIColorPalette {
    public static Color
            baseMainColor = Color.valueOf("939393"),
            baseMainLight = Color.valueOf("bebebe"),
            baseMainDark = Color.valueOf("777777"),
            /*------------------------------*/
            coreDefaultColor = Color.valueOf("ff97e5"),
            coreLightColor = Color.valueOf("faceef"),
            coreDarkColor = Color.valueOf("9c7c94"),
            /*------------------------------*/
            unitColor = Color.valueOf("faceef"),
    /*-------------------------------------------------------*/
            sampleColor = new Color(1, 1, 1, 1)
            ;

    static {
        Colors.put("main-color", baseMainColor);
        Colors.put("main-light-color", baseMainLight);
        Colors.put("main-dark-color", baseMainDark);

        Colors.put("core-light-color", coreLightColor);
        Colors.put("core-default-color", coreDefaultColor);
        Colors.put("core-dark-color", coreDarkColor);

        Colors.put("unit-color", unitColor);

        Colors.put("testing-color", sampleColor);
    }
}
