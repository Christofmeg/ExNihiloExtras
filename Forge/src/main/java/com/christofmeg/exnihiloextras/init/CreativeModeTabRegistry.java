package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

public class CreativeModeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExNihiloExtras.MOD_ID);

    public static void init(@Nonnull IEventBus modEventBus) {
        REGISTRY.register(modEventBus);
    }

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> TAB = REGISTRY.register(ExNihiloExtras.MOD_ID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + ExNihiloExtras.MOD_ID + ".general")).icon(
                    () -> new ItemStack(ItemRegistration.FROG_DOLL.get()))
            .displayItems((parameters, tabData) ->
                    ItemRegistration.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(tabData::accept))
            .build());

}