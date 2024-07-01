package com.christofmeg.exnihiloextras;

import com.christofmeg.exnihiloextras.init.CreativeModeTabRegistry;
import com.christofmeg.exnihiloextras.init.ItemRegistration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(ExNihiloExtras.MOD_ID)
@Mod.EventBusSubscriber(
        modid = ExNihiloExtras.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class ExNihiloExtras {

    public static final String MOD_ID = "exnihiloextras";

    public ExNihiloExtras() {
        ExNihiloExtras.init(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void init(@Nonnull IEventBus modEventBus) {
        ItemRegistration.init(modEventBus);
        CreativeModeTabRegistry.init(modEventBus);
    }
}