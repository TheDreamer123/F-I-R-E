package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ChainmailAxeBase extends AxeItem {
    public ChainmailAxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,7.5F,-3.2F, new Settings().group(ItemGroup.TOOLS));
    }
}