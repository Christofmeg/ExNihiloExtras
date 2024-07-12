package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.CreativeModeTabRegistry;
import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod(ExNihiloExtras.MOD_ID)
public class ExNihiloExtras {

    public static final String MOD_ID = "exnihiloextras";

    public ExNihiloExtras(IEventBus modEventBus) {
        ExNihiloExtras.init(modEventBus);
    }

    public static void init(@Nonnull IEventBus modEventBus) {
        ItemRegistration.init(modEventBus);
        CreativeModeTabRegistry.init(modEventBus);
    }
}