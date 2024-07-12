package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import novamachina.exnihilosequentia.world.item.DollItem;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ItemRegistration {

    public static final DeferredRegister<Item> ITEMS;

    public static final Supplier<DollItem> FROG_DOLL;
    public static final Supplier<DollItem> PANDA_DOLL;
    public static final Supplier<DollItem> TURTLE_DOLL;

    private ItemRegistration() {
    }

    public static void init(@Nonnull IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    static {
        ITEMS = DeferredRegister.create(Registries.ITEM, ExNihiloExtras.MOD_ID);
        FROG_DOLL = ITEMS.register("frog_doll", () -> new DollItem("minecraft", "frog", "minecraft", "water", 1.5, ExNihiloExtras.MOD_ID + "." + "tooltip.doll.frog"));
        PANDA_DOLL = ITEMS.register("panda_doll", () -> new DollItem("minecraft", "panda", "minecraft", "water", 1.5, ExNihiloExtras.MOD_ID + "." + "tooltip.doll.panda"));
        TURTLE_DOLL = ITEMS.register("turtle_doll", () -> new DollItem("minecraft", "turtle", "minecraft", "water", 1.5, ExNihiloExtras.MOD_ID + "." + "tooltip.doll.turtle"));
    }

}

