package net.crusiador.wegetthere.item;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, wegetthere.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("alexanderite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.wegetthere.alexandrite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        output.accept(ModItems.CHISEL.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> ALEXANDRITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("alexanderite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALEXANDRITE_BlocK.get()))
                    .withTabsBefore(ALEXANDRITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.wegetthere.alexandrite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALEXANDRITE_BlocK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BlocK.get());

                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());

                        output.accept(ModBlocks.SA.get());
                        output.accept(ModBlocks.SB.get());
                        output.accept(ModBlocks.S3.get());
                        output.accept(ModBlocks.S4.get());
                        output.accept(ModBlocks.S5.get());
                        output.accept(ModBlocks.S6.get());
                        output.accept(ModBlocks.S7.get());
                        output.accept(ModBlocks.S8.get());
                        output.accept(ModBlocks.S9.get());
                        output.accept(ModBlocks.S10.get());
                        output.accept(ModBlocks.S11.get());
                        output.accept(ModBlocks.S12.get());
                        output.accept(ModBlocks.S13.get());
                        output.accept(ModBlocks.S14.get());
                        output.accept(ModBlocks.S15.get());
                        output.accept(ModBlocks.S16.get());
                        output.accept(ModBlocks.S17.get());
                        output.accept(ModBlocks.S18.get());
                        output.accept(ModBlocks.S19.get());
                        output.accept(ModBlocks.S20.get());
                        output.accept(ModBlocks.S21.get());
                        output.accept(ModBlocks.S22.get());
                        output.accept(ModBlocks.S23.get());
                        output.accept(ModBlocks.S24.get());
                        output.accept(ModBlocks.S25.get());

                    }).build());





    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}