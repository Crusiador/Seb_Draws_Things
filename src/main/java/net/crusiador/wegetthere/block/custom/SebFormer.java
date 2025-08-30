package net.crusiador.wegetthere.block.custom;

import com.google.common.collect.ImmutableMap;
import net.crusiador.wegetthere.block.ModBlocks;
import net.crusiador.wegetthere.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;








/*
    WARNING IF YOU SCROLL DOWN YOU WILL SPOIL YOURSELF IF YOU REALLY WANT TO GET SPOILED PLS DO NOT SPOIL OTHERS
    JUST KEEP EVERYTHING TO YOURSELF!!!!!!!
 */






















// This Block transforms items that get dropped on it into another Block.
public class SebFormer extends Block {
    private static final Map<Item, RegistryObject<Block>> mapping =
            ImmutableMap.<Item, RegistryObject<Block>>builder()
    .put(ModItems.SEBONITE_NUGGET.get(), ModBlocks.S1)
    .put(Items.STONECUTTER, ModBlocks.S2)
    .put(Items.END_ROD, ModBlocks.S3)
    .put(Items.BOOK, ModBlocks.S4)
    .put(Items.DIAMOND, ModBlocks.S5)
    .put(Items.COAL, ModBlocks.S6)
    .put(Items.GOLDEN_CARROT, ModBlocks.S7)
    .put(Items.CAKE, ModBlocks.S8)
    .put(Items.RED_BED, ModBlocks.S9)
    .put(Items.FIRE_CHARGE, ModBlocks.S10)
    .put(Items.ROOTED_DIRT, ModBlocks.S11)
    .put(Items.BARREL, ModBlocks.S12)
    .put(Items.BLAZE_ROD, ModBlocks.S13)
    .put(Items.NETHER_STAR, ModBlocks.S14)
    .put(Items.WAXED_WEATHERED_CUT_COPPER_STAIRS, ModBlocks.S15)
    .put(Items.OBSIDIAN, ModBlocks.S16)
    .put(Items.CRYING_OBSIDIAN, ModBlocks.S17)
    .put(Items.OBSERVER, ModBlocks.S18)
    .put(Items.QUARTZ, ModBlocks.S19)
    .put(Items.IRON_BARS, ModBlocks.S20)
    .put(Items.DIRT, ModBlocks.S21)
    .put(Items.AMETHYST_BLOCK, ModBlocks.S22)
    .put(Items.STONE, ModBlocks.S23)
    .put(Items.FLINT, ModBlocks.S24)
    .put(Items.ENDER_CHEST, ModBlocks.S25)
    .put( Items.EMERALD, ModBlocks.SHREK)
    .put(Items.MILK_BUCKET, ModBlocks.COW)
    .put(Items.TROPICAL_FISH, ModBlocks.PUY)
    .put(Items.PUFFERFISH, ModBlocks.PY)
                    .build()
    ;
    public SebFormer(Properties properties) {
        super(properties);


    }


    // Makes Sound.
    @Override
    protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos,
                                               Player pPlayer, BlockHitResult pHitResult) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.AMETHYST_CLUSTER_PLACE, SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;
    }


    // This checks if a transformable item is on top of the block and if yes transforms the item.
    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pEntity instanceof ItemEntity itemEntity) {


            net.minecraft.world.item.Item item = itemEntity.getItem().getItem();
            if(mapping.containsKey(item)) {
                RegistryObject<Block> itemLike = mapping.get(item);
                itemEntity.setItem(new ItemStack(itemLike.get(), itemEntity.getItem().getCount()));
            }

            else {
                super.stepOn(pLevel, pPos, pState, pEntity);
                return;
            }

        super.stepOn(pLevel, pPos, pState, pEntity);


    }

    }
}




