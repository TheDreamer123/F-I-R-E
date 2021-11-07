package net.dreamer.fire.tools.spectral;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class SpectralChainmailAxeBase extends AxeItem {
    public SpectralChainmailAxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,8,-3.1F, new Settings().group(ItemGroup.TOOLS));
    }
}