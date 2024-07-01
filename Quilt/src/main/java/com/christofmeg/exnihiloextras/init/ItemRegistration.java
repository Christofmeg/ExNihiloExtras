package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.List;

public class ItemRegistration {

    public static final Item DOLL_BEE = new Item(new QuiltItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendHoverText(@NotNull ItemStack stack , @Nullable Level world, List<Component> tooltip, @NotNull TooltipFlag context) {
            tooltip.add(Component.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.bee"));
        }
    };

    public static final Item DOLL_FROG = new Item(new QuiltItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendHoverText(@NotNull ItemStack stack , @Nullable Level world, List<Component> tooltip, @NotNull TooltipFlag context) {
            tooltip.add(Component.translatable(ExNihiloExtras.MOD_ID + "." + "tooltip.doll.frog"));

        }
    };

    public static final Item DOLL_PANDA = new Item(new QuiltItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendHoverText(@NotNull ItemStack stack , @Nullable Level world, List<Component> tooltip, @NotNull TooltipFlag context) {
            tooltip.add(Component.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.panda"));
        }
    };

    public static final Item DOLL_TURTLE = new Item(new QuiltItemSettings().group(ExNihiloExtras.ITEM_GROUP)) {
        @Override
        public void appendHoverText(@NotNull ItemStack stack , @Nullable Level world, List<Component> tooltip, @NotNull TooltipFlag context) {
            tooltip.add(Component.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.turtle"));
        }
    };

    public static void registerItems() {
        Registry.register(Registry.ITEM, new ResourceLocation(ExNihiloExtras.MOD_ID, "doll_bee"), DOLL_BEE);
        Registry.register(Registry.ITEM, new ResourceLocation(ExNihiloExtras.MOD_ID, "doll_frog"), DOLL_FROG);
        Registry.register(Registry.ITEM, new ResourceLocation(ExNihiloExtras.MOD_ID, "doll_panda"), DOLL_PANDA);
        Registry.register(Registry.ITEM, new ResourceLocation(ExNihiloExtras.MOD_ID, "doll_turtle"), DOLL_TURTLE);
    }

}
