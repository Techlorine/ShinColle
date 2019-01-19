package com.lulan.shincolle.creativetab;

import com.lulan.shincolle.ShinColle;
import com.lulan.shincolle.init.ModItems;
import com.lulan.shincolle.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//建立mod的creative tab
public class CreativeTabSC
{
		
	public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MOD_ID)
	{
		
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.Grudge);    //TODO 有点弟弟的写法 怕是Init要重写了
		}	
		//tab顯示的名稱會自動找語系檔的字串填入  不必使用getTranslatedTabLabel
		//只要在語系檔中加入  itemGroup.MOD名稱=要顯示的tab名稱  即可
	};

	
}
