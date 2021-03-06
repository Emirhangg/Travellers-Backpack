package com.tiviacz.travellersbackpack.fluids.effects;

import com.tiviacz.travellersbackpack.api.FluidEffect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;

public class EffectMilk extends FluidEffect
{
    public EffectMilk()
    {
        super(FluidRegistry.getFluid("milk"), 7);
    }

    @Override
    public void affectDrinker(World world, Entity entity)
    {
        if (entity instanceof EntityPlayer)
        {
            ((EntityPlayer)entity).clearActivePotions();
        }
    }
}