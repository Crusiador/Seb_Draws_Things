package net.crusiador.wegetthere.block;

import net.crusiador.wegetthere.item.ModItems;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, wegetthere.MOD_ID);

    public static final RegistryObject<Block> S1 = registerBlock("sa",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S2 = registerBlock("sb",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S3 = registerBlock("sc",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S4 = registerBlock("sd",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S5 = registerBlock("se",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S6 = registerBlock("sf",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S7 = registerBlock("sg",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S8 = registerBlock("sh",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S9 = registerBlock("si",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S10 = registerBlock("sj",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S11 = registerBlock("sk",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S12 = registerBlock("sl",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S13 = registerBlock("sm",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S14 = registerBlock("sn",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S15 = registerBlock("so",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S16 = registerBlock("sp",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S17 = registerBlock("sq",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S18 = registerBlock("sr",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S19 = registerBlock("ss",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S20 = registerBlock("st",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S21 = registerBlock("su",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S22 = registerBlock("sv",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S23 = registerBlock("sw",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S24 = registerBlock("sx",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> S25 = registerBlock("sy",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> SHREK = registerBlock("shrek",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> PY = registerBlock("py",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> COW = registerBlock("cow",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> PUY = registerBlock("puy",
            () -> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> SEBONITE_ORE = registerBlock("sebonite_ore",
            ()-> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SEBONITE_DEEPSLATE_ORE = registerBlock("sebonite_deepslate_ore",
            ()-> new Block(BlockBehaviour.Properties.of().strength(5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SEB_LUCKY_BLOCK = registerBlock("seb_lucky_block",
            ()-> new Block(BlockBehaviour.Properties.of()));

    public static final RegistryObject<Block> SEBONITE_BLOCK = registerBlock("sebonite_block",
            ()-> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SOIL = registerBlock("soil",
            ()-> new Block(BlockBehaviour.Properties.of().strength(1f).sound(SoundType.ROOTED_DIRT)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
