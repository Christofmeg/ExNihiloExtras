package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExNihiloExtras implements ModInitializer {

    public static final String MOD_ID = "exnihiloextras";

    public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder(
            new ResourceLocation(MOD_ID, "general"))
            .icon(() -> new ItemStack(ItemRegistration.DOLL_FROG)).build();

    @Override
    public void onInitialize(ModContainer mod) {
        ItemRegistration.registerItems();
    }
}