package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;

public class ExNihiloExtras implements ModInitializer {

    public static final String MOD_ID = "exnihiloextras";

    public static final QuiltItemGroup ITEM_GROUP = QuiltItemGroup.builder(
            new Identifier(MOD_ID, "general"))
            .icon(() -> new ItemStack(ItemRegistration.DOLL_BEE))
            .build();

    @Override
    public void onInitialize(ModContainer mod) {
        ItemRegistration.registerItems();
    }
}