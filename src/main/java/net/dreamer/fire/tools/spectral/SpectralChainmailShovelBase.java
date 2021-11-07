package net.dreamer.fire.tools.spectral;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class SpectralChainmailShovelBase extends ShovelItem {
    public SpectralChainmailShovelBase(ToolMaterial toolMaterial) {
        super(toolMaterial,3.5F,-3.0F, new Settings().group(ItemGroup.TOOLS));
    }
}