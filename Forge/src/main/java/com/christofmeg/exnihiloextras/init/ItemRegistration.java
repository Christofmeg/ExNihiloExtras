package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import novamachina.exnihilosequentia.common.item.DollItem;

import javax.annotation.Nonnull;

public class ItemRegistration {

    private static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<DollItem> FROG_DOLL;
    public static final RegistryObject<DollItem> PANDA_DOLL;

    private ItemRegistration() {
    }
    public static void init(@Nonnull IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExNihiloExtras.MOD_ID);
        FROG_DOLL = ITEMS.register("frog_doll", () -> new DollItem("minecraft", "frog", "minecraft", "water", 1.5, ExNihiloExtras.MOD_ID + "." + "tooltip.doll.frog"));
        PANDA_DOLL = ITEMS.register("panda_doll", () -> new DollItem("minecraft", "panda", "minecraft", "water", 1.5, ExNihiloExtras.MOD_ID + "." + "tooltip.doll.panda"));
    }
}
