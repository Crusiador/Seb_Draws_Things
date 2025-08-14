package net.crusiador.wegetthere.item;

import net.crusiador.wegetthere.wegetthere;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, wegetthere.MOD_ID);

    public static final RegistryObject<Item> RAW_SEBONITE = ITEMS.register("raw_sebonite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SEBONITE = ITEMS.register("sebonite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRISPY_SOIL = ITEMS.register("crispy_soil",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.CRISPY_SOIL)));

    public static final RegistryObject<Item> BURNED_SOIL = ITEMS.register("burned_soil",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.BURNED_SOIL)));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
