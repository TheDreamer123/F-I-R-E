package net.dreamer.fire.armor;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemGroup;

public class BaseArmor extends ArmorItem {

    public BaseArmor(ArmorMaterial material,EquipmentSlot slot) {
        super(material, slot, new FabricItemSettings().group(ItemGroup.COMBAT));
    }


}
