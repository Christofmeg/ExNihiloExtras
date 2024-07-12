package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.function.Supplier;

public class CreativeModeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExNihiloExtras.MOD_ID);

    public static void init(@Nonnull IEventBus modEventBus) {
        REGISTRY.register(modEventBus);
    }

    @SuppressWarnings("unused")
    public static final Supplier<CreativeModeTab> TAB = REGISTRY.register(ExNihiloExtras.MOD_ID, () -> CreativeModeTab.builder()
            .icon(ItemRegistration.FROG_DOLL.get()::getDefaultInstance)
            .title(Component.translatable("itemGroup." + ExNihiloExtras.MOD_ID + ".general"))
            .displayItems((displayParameters, output) -> {
                List<ItemStack> stacks = ItemRegistration.ITEMS.getEntries().stream().map(reg -> new ItemStack(reg.get())).toList();
                output.acceptAll(stacks);
            })
            .build());

}