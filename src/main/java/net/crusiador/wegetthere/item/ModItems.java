package net.crusiador.wegetthere.item;

import net.crusiador.wegetthere.item.custom.ModToolTiers;
import net.crusiador.wegetthere.wegetthere;
import net.minecraft.world.item.*;
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


    public static final RegistryObject<Item> SEB_SWORD = ITEMS.register("seb_sword",
            () -> new SwordItem(ModToolTiers.SEB, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.SEB, 4, -2.2f))));
    public static final RegistryObject<Item> SEB_PICKAXE = ITEMS.register("seb_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SEB, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.SEB, 1.5f, -2.5f))));
    public static final RegistryObject<Item> SEB_SHOVEL = ITEMS.register("seb_shovel",
            () -> new ShovelItem(ModToolTiers.SEB, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.SEB, 1.5f, -3.0f))));
    public static final RegistryObject<Item> SEB_AXE = ITEMS.register("seb_axe",
            () -> new AxeItem(ModToolTiers.SEB, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.SEB, 8, -3.4f))));
    public static final RegistryObject<Item> SEB_HOE = ITEMS.register("seb_hoe",
            () -> new HoeItem(ModToolTiers.SEB, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.SEB, -5, 96f))));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
