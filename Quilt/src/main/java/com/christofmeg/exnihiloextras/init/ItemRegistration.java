package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

import java.util.List;

public class ItemRegistration {

    public static final Item DOLL_BEE = new Item(new QuiltItemSettings()) {
        @Override
        public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.bee"));
        }
    };

    public static final Item DOLL_FROG = new Item(new QuiltItemSettings()) {
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable(ExNihiloExtras.MOD_ID + "." + "tooltip.doll.frog"));

        }
    };

    public static final Item DOLL_PANDA = new Item(new QuiltItemSettings()) {
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(Text.translatable(ExNihiloExtras.MOD_ID + ".tooltip.doll.panda"));
        }
    };

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_bee"), DOLL_BEE);
        Registry.register(Registries.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_frog"), DOLL_FROG);
        ItemGroupEvents.modifyEntriesEvent(ExNihiloExtras.ITEM_GROUP).register(entries -> {
            entries.add(DOLL_BEE);
            entries.add(DOLL_FROG);
            entries.add(DOLL_PANDA);
        });
    }

}
