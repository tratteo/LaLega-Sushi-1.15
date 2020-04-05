package net.la.lega.mod.item;

import net.la.lega.mod.initializer.LItemGroups;
import net.la.lega.mod.loader.LLoader;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class HosomakiSake extends Item
{
    public static final Identifier ID = new Identifier(LLoader.MOD_ID, "hosomaki_sake");
    
    public static final float saturation = 1.95F;
    public static final int hunger = 4;
    
    public HosomakiSake()
    {
        super(new Item.Settings().group(LItemGroups.SUSHI)
                    .food(new FoodComponent.Builder()
                                .hunger(hunger)
                                .saturationModifier(saturation)
                                .snack().alwaysEdible()
                                .build())
             );
    }
}