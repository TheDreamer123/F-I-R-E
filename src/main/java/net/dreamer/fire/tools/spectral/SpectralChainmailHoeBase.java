package net.dreamer.fire.tools.spectral;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class SpectralChainmailHoeBase extends HoeItem {
    public SpectralChainmailHoeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,0,-1.0F, new Settings().group(ItemGroup.TOOLS));
    }
}