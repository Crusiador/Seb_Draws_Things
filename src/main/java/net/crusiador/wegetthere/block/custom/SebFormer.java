package net.crusiador.wegetthere.block.custom;

import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SebFormer extends Block {
    public SebFormer(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos,
                                               Player pPlayer, BlockHitResult pHitResult) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity) {

            if(itemEntity.getItem().getItem() == ModItems.SEBONITE_NUGGET.get()) {
                itemEntity.setItem(new ItemStack(ModBlocks.S1.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.STONECUTTER) {
                itemEntity.setItem(new ItemStack(ModBlocks.S2.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.END_ROD) {
                itemEntity.setItem(new ItemStack(ModBlocks.S3.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.BOOK) {
                itemEntity.setItem(new ItemStack(ModBlocks.S4.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.DIAMOND) {
                itemEntity.setItem(new ItemStack(ModBlocks.S5.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.COAL) {
                itemEntity.setItem(new ItemStack(ModBlocks.S6.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.GOLDEN_CARROT) {
                itemEntity.setItem(new ItemStack(ModBlocks.S7.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.CAKE) {
                itemEntity.setItem(new ItemStack(ModBlocks.S8.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.RED_BED) {
                itemEntity.setItem(new ItemStack(ModBlocks.S9.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.FIRE_CHARGE) {
                itemEntity.setItem(new ItemStack(ModBlocks.S10.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == ModItems.CRISPY_SOIL.get()) {
                itemEntity.setItem(new ItemStack(ModBlocks.S11.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == ModItems.BURNED_SOIL.get()) {
                itemEntity.setItem(new ItemStack(ModBlocks.S12.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.BLAZE_ROD) {
                itemEntity.setItem(new ItemStack(ModBlocks.S13.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.NETHER_STAR) {
                itemEntity.setItem(new ItemStack(ModBlocks.S14.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.WAXED_WEATHERED_CUT_COPPER_STAIRS) {
                itemEntity.setItem(new ItemStack(ModBlocks.S15.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.OBSIDIAN) {
                itemEntity.setItem(new ItemStack(ModBlocks.S16.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.CRYING_OBSIDIAN) {
                itemEntity.setItem(new ItemStack(ModBlocks.S17.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.OBSERVER) {
                itemEntity.setItem(new ItemStack(ModBlocks.S18.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.QUARTZ) {
                itemEntity.setItem(new ItemStack(ModBlocks.S19.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.IRON_BARS) {
                itemEntity.setItem(new ItemStack(ModBlocks.S20.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.DIRT) {
                itemEntity.setItem(new ItemStack(ModBlocks.S21.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.AMETHYST_BLOCK) {
                itemEntity.setItem(new ItemStack(ModBlocks.S22.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.STONE) {
                itemEntity.setItem(new ItemStack(ModBlocks.S23.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.FLINT) {
                itemEntity.setItem(new ItemStack(ModBlocks.S24.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.ENDER_CHEST) {
                itemEntity.setItem(new ItemStack(ModBlocks.S25.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.EMERALD) {
                itemEntity.setItem(new ItemStack(ModBlocks.SHREK.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.MILK_BUCKET) {
                itemEntity.setItem(new ItemStack(ModBlocks.COW.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.TROPICAL_FISH) {
                itemEntity.setItem(new ItemStack(ModBlocks.PUY.get(), itemEntity.getItem().getCount()));
            }

            if(itemEntity.getItem().getItem() == Items.PUFFERFISH) {
                itemEntity.setItem(new ItemStack(ModBlocks.PY.get(), itemEntity.getItem().getCount()));
            }

        super.stepOn(pLevel, pPos, pState, pEntity);


    }

    }
}




