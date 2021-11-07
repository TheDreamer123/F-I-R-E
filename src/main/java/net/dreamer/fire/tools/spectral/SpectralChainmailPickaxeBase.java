package net.dreamer.fire.tools.spectral;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class SpectralChainmailPickaxeBase extends PickaxeItem {
    public SpectralChainmailPickaxeBase(ToolMaterial toolMaterial) {
        super(toolMaterial,3,-2.8F, new Settings().group(ItemGroup.TOOLS));
    }
}