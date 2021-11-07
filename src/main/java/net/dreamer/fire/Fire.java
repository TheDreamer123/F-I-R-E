package net.dreamer.fire;

import net.dreamer.fire.armor.BaseArmor;
import net.dreamer.fire.armor.SpectralChainmailArmorMaterial;
import net.dreamer.fire.item.FireItem;
import net.dreamer.fire.item.Food;
import net.dreamer.fire.item.SoulFireItem;
import net.dreamer.fire.tools.chainmail.*;
import net.dreamer.fire.tools.spectral.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Fire implements ModInitializer {

    public static final String MOD_ID = "fire";

    public static final ArmorMaterial SPECTRAL_CHAINMAIL_ARMOR = new SpectralChainmailArmorMaterial();

    @Override
    public void onInitialize() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire"), new FireItem(Blocks.FIRE, new FabricItemSettings().group(ItemGroup.MISC).food(Food.FIRE)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soul_fire"), new SoulFireItem(Blocks.SOUL_FIRE, new FabricItemSettings().group(ItemGroup.MISC).food(Food.SOUL_FIRE)));

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chainmail_sword"), new ChainmailSwordBase(new ChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chainmail_shovel"), new ChainmailShovelBase(new ChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chainmail_pickaxe"), new ChainmailPickaxeBase(new ChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chainmail_axe"), new ChainmailAxeBase(new ChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chainmail_hoe"), new ChainmailHoeBase(new ChainmailHoeMaterial()));

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_sword"), new SpectralChainmailSwordBase(new SpectralChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_shovel"), new SpectralChainmailShovelBase(new SpectralChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_pickaxe"), new SpectralChainmailPickaxeBase(new SpectralChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_axe"), new SpectralChainmailAxeBase(new SpectralChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_hoe"), new SpectralChainmailHoeBase(new SpectralChainmailToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_helmet"), new BaseArmor(SPECTRAL_CHAINMAIL_ARMOR,EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_chestplate"), new BaseArmor(SPECTRAL_CHAINMAIL_ARMOR,EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_leggings"), new BaseArmor(SPECTRAL_CHAINMAIL_ARMOR,EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spectral_chainmail_boots"), new BaseArmor(SPECTRAL_CHAINMAIL_ARMOR,EquipmentSlot.FEET));
    }
}
