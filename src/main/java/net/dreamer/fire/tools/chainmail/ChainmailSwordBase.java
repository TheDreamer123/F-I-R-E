package net.dreamer.fire.tools.chainmail;

import net.minecraft.item.*;

public class ChainmailSwordBase extends SwordItem {
    public ChainmailSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial,4,-2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}