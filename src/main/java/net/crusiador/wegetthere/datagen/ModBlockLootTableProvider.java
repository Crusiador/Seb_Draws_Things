package net.crusiador.wegetthere.datagen;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


// Makes Loottables.
public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    // Makes the Blocks drop themselves.
    @Override
    protected void generate() {
        dropSelf(ModBlocks.S1.get());
        dropSelf(ModBlocks.S2.get());
        dropSelf(ModBlocks.S3.get());
        dropSelf(ModBlocks.S4.get());
        dropSelf(ModBlocks.S5.get());
        dropSelf(ModBlocks.S6.get());
        dropSelf(ModBlocks.S7.get());
        dropSelf(ModBlocks.S8.get());
        dropSelf(ModBlocks.S9.get());
        dropSelf(ModBlocks.S10.get());
        dropSelf(ModBlocks.S11.get());
        dropSelf(ModBlocks.S12.get());
        dropSelf(ModBlocks.S13.get());
        dropSelf(ModBlocks.S14.get());
        dropSelf(ModBlocks.S15.get());
        dropSelf(ModBlocks.S16.get());
        dropSelf(ModBlocks.S17.get());
        dropSelf(ModBlocks.S18.get());
        dropSelf(ModBlocks.S19.get());
        dropSelf(ModBlocks.S20.get());
        dropSelf(ModBlocks.S21.get());
        dropSelf(ModBlocks.S22.get());
        dropSelf(ModBlocks.S23.get());
        dropSelf(ModBlocks.S24.get());
        dropSelf(ModBlocks.S25.get());

        dropSelf(ModBlocks.SHREK.get());
        dropSelf(ModBlocks.PY.get());
        dropSelf(ModBlocks.COW.get());
        dropSelf(ModBlocks.PUY.get());

        dropSelf(ModBlocks.SEBONITE_BLOCK.get());
        dropSelf(ModBlocks.SEB_LUCKY_BLOCK.get());

        dropSelf(ModBlocks.SOIL.get());
        dropSelf(ModBlocks.SEBFORMER.get());

        dropSelf(ModBlocks.SEB_LOG.get());
        dropSelf(ModBlocks.SEB_PLANK.get());


        dropSelf(ModBlocks.SEB_STAIRS.get());
        this.add(ModBlocks.SEB_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SEB_SLAB.get()));

        dropSelf(ModBlocks.SEB_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.SEB_BUTTON.get());
        dropSelf(ModBlocks.SEB_FENCE.get());
        dropSelf(ModBlocks.SEB_FENCE_GATE.get());
        dropSelf(ModBlocks.SEB_WALL.get());
        dropSelf(ModBlocks.SEB_TRAPDOOR.get());

        this.add(ModBlocks.SEB_DOOR.get(),
                block -> createDoorTable(ModBlocks.SEB_DOOR.get()));

        this.add(ModBlocks.SEBONITE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.SEBONITE_ORE.get(), ModItems.RAW_SEBONITE.get(), 1, 3));




    }


    // Makes it so you can register a loottable better for ores.
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
