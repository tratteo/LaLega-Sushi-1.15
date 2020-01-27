package net.la.lega.mod.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class NigiriSake extends Item
{
    public static final Identifier ID = new Identifier("lalegamod", "nigiri_sake");
    
    public static final float saturation = 1F;
    public static final int hunger = 2;

    public NigiriSake(Settings settings) 
    {
        super(settings);
    }
}