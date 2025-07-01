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

    public static final RegistryObject<Item> MARTONSZEUGNIS = ITEMS.register("martonszeugnis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAFAELSZEUGNIS = ITEMS.register("rafaelszeugnis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JANICSZEUGNIS = ITEMS.register("janicszeugnis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KORAYSZEUGNIS = ITEMS.register("korayszeugnis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCHWABELSCHWERT = ITEMS.register("schwabelschwert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JOEL = ITEMS.register("joel",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
