package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ChainmailShovelBase extends ShovelItem {
    public ChainmailShovelBase(ToolMaterial toolMaterial) {
        super(toolMaterial,2.5F,-3.0F, new Settings().group(ItemGroup.TOOLS));
    }
}