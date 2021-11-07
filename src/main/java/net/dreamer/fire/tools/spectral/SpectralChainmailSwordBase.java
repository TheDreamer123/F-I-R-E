package net.dreamer.fire.tools.spectral;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SpectralChainmailSwordBase extends SwordItem {
    public SpectralChainmailSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial,5,-2.4F, new Settings().group(ItemGroup.COMBAT));
    }
}