package com.christofmeg.exnihiloextras.init;

import com.christofmeg.exnihiloextras.ExNihiloExtras;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
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

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_bee"), DOLL_BEE);
        Registry.register(Registries.ITEM, new Identifier(ExNihiloExtras.MOD_ID, "doll_frog"), DOLL_FROG);
    }

    @SuppressWarnings("unused")
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(ExNihiloExtras.MOD_ID, "general"),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + ExNihiloExtras.MOD_ID + ".general"))
            .icon(() -> new ItemStack(ItemRegistration.DOLL_FROG)).entries((displayContext, entries) -> {
                entries.add(DOLL_BEE);
                entries.add(DOLL_FROG);
            }).build());

}
