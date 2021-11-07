package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ChainmailHoeBase extends HoeItem {
    public ChainmailHoeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,0,-2.0F, new Settings().group(ItemGroup.TOOLS));
    }
}