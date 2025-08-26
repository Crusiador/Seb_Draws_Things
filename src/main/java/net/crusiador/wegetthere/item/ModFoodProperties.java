package net.crusiador.wegetthere.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;



// Registers the stats of food Items.
public class ModFoodProperties {
    public static final FoodProperties CRISPY_SOIL = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 400),1.0f)
            .effect(new MobEffectInstance(MobEffects.POISON, 200),1.0f).build();

    public static final FoodProperties BURNED_SOIL = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.WITHER, 400),1.0f)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 400),1.0f).build();

}
