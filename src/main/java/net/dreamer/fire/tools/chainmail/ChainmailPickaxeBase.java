package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ChainmailPickaxeBase extends PickaxeItem {
    public ChainmailPickaxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,2,-2.8F, new Settings().group(ItemGroup.TOOLS));
    }
}