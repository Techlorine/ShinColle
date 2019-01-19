package com.lulan.shincolle.init;

import com.lulan.shincolle.crafting.RecipeEnchantShell;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;

public class ModRecipes
{
	//配方範例
	//GameRegistry.addSmelting(取得物, 材料, 0.1f經驗);
	//GameRegistry.addRecipe(new ShapedOreRecipe(取得物, " s ", "sss", " s ", 's', "stickWood" 材料陣列));
    //GameRegistry.addRecipe(new ShapelessOreRecipe(取得物, 材料A, 材料B, ...));		
	public static void register(RegistryEvent.Register<IRecipe> event)
	{
		event.getRegistry().register(new RecipeEnchantShell());
		//配方材料or成品  ->JSON化

	}

	
}