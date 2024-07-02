package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.ItemRegistration;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExNihiloExtras implements ModInitializer {

    public static final String MOD_ID = "exnihiloextras";

    @Override
    public void onInitialize(ModContainer mod) {
        ItemRegistration.registerItems();
    }
}