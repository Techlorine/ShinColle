package com.lulan.shincolle.proxy;

import com.lulan.shincolle.client.render.RenderMiscEntity;
import com.lulan.shincolle.client.render.RenderMountsEntity;
import com.lulan.shincolle.client.render.RenderShipEntity;
import com.lulan.shincolle.client.render.RenderShipFishing;
import com.lulan.shincolle.client.render.RenderSummonEntity;
import com.lulan.shincolle.client.render.item.RenderBasicEntityItem;
import com.lulan.shincolle.client.render.item.RenderTileEntityItem;
import com.lulan.shincolle.entity.battleship.EntityBBHaruna;
import com.lulan.shincolle.entity.battleship.EntityBBHarunaMob;
import com.lulan.shincolle.entity.battleship.EntityBBHiei;
import com.lulan.shincolle.entity.battleship.EntityBBHieiMob;
import com.lulan.shincolle.entity.battleship.EntityBBKirishima;
import com.lulan.shincolle.entity.battleship.EntityBBKirishimaMob;
import com.lulan.shincolle.entity.battleship.EntityBBKongou;
import com.lulan.shincolle.entity.battleship.EntityBBKongouMob;
import com.lulan.shincolle.entity.battleship.EntityBattleshipNGT;
import com.lulan.shincolle.entity.battleship.EntityBattleshipNGTMob;
import com.lulan.shincolle.entity.battleship.EntityBattleshipRe;
import com.lulan.shincolle.entity.battleship.EntityBattleshipRu;
import com.lulan.shincolle.entity.battleship.EntityBattleshipTa;
import com.lulan.shincolle.entity.battleship.EntityBattleshipYMT;
import com.lulan.shincolle.entity.battleship.EntityBattleshipYMTMob;
import com.lulan.shincolle.entity.carrier.EntityCarrierAkagi;
import com.lulan.shincolle.entity.carrier.EntityCarrierAkagiMob;
import com.lulan.shincolle.entity.carrier.EntityCarrierKaga;
import com.lulan.shincolle.entity.carrier.EntityCarrierKagaMob;
import com.lulan.shincolle.entity.carrier.EntityCarrierWo;
import com.lulan.shincolle.entity.cruiser.EntityCAAtago;
import com.lulan.shincolle.entity.cruiser.EntityCAAtagoMob;
import com.lulan.shincolle.entity.cruiser.EntityCANe;
import com.lulan.shincolle.entity.cruiser.EntityCARi;
import com.lulan.shincolle.entity.cruiser.EntityCATakao;
import com.lulan.shincolle.entity.cruiser.EntityCATakaoMob;
import com.lulan.shincolle.entity.cruiser.EntityCLTatsuta;
import com.lulan.shincolle.entity.cruiser.EntityCLTatsutaMob;
import com.lulan.shincolle.entity.cruiser.EntityCLTenryuu;
import com.lulan.shincolle.entity.cruiser.EntityCLTenryuuMob;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerAkatsuki;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerAkatsukiMob;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerHa;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerHibiki;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerHibikiMob;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerI;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerIkazuchi;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerIkazuchiMob;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerInazuma;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerInazumaMob;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerNi;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerRo;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerShimakaze;
import com.lulan.shincolle.entity.destroyer.EntityDestroyerShimakazeMob;
import com.lulan.shincolle.entity.hime.EntityAirfieldHime;
import com.lulan.shincolle.entity.hime.EntityBattleshipHime;
import com.lulan.shincolle.entity.hime.EntityCAHime;
import com.lulan.shincolle.entity.hime.EntityCarrierHime;
import com.lulan.shincolle.entity.hime.EntityCarrierWD;
import com.lulan.shincolle.entity.hime.EntityDestroyerHime;
import com.lulan.shincolle.entity.hime.EntityHarbourHime;
import com.lulan.shincolle.entity.hime.EntityIsolatedHime;
import com.lulan.shincolle.entity.hime.EntityMidwayHime;
import com.lulan.shincolle.entity.hime.EntityNorthernHime;
import com.lulan.shincolle.entity.hime.EntitySSNH;
import com.lulan.shincolle.entity.hime.EntitySubmHime;
import com.lulan.shincolle.entity.mounts.EntityMountAfH;
import com.lulan.shincolle.entity.mounts.EntityMountBaH;
import com.lulan.shincolle.entity.mounts.EntityMountCaH;
import com.lulan.shincolle.entity.mounts.EntityMountCaWD;
import com.lulan.shincolle.entity.mounts.EntityMountHbH;
import com.lulan.shincolle.entity.mounts.EntityMountIsH;
import com.lulan.shincolle.entity.mounts.EntityMountMiH;
import com.lulan.shincolle.entity.mounts.EntityMountSuH;
import com.lulan.shincolle.entity.other.EntityAbyssMissile;
import com.lulan.shincolle.entity.other.EntityAirplane;
import com.lulan.shincolle.entity.other.EntityAirplaneT;
import com.lulan.shincolle.entity.other.EntityAirplaneTMob;
import com.lulan.shincolle.entity.other.EntityAirplaneTakoyaki;
import com.lulan.shincolle.entity.other.EntityAirplaneZero;
import com.lulan.shincolle.entity.other.EntityAirplaneZeroMob;
import com.lulan.shincolle.entity.other.EntityFloatingFort;
import com.lulan.shincolle.entity.other.EntityProjectileBeam;
import com.lulan.shincolle.entity.other.EntityProjectileStatic;
import com.lulan.shincolle.entity.other.EntityRensouhou;
import com.lulan.shincolle.entity.other.EntityRensouhouMob;
import com.lulan.shincolle.entity.other.EntityRensouhouS;
import com.lulan.shincolle.entity.other.EntityShipFishingHook;
import com.lulan.shincolle.entity.submarine.EntitySubmKa;
import com.lulan.shincolle.entity.submarine.EntitySubmRo500;
import com.lulan.shincolle.entity.submarine.EntitySubmRo500Mob;
import com.lulan.shincolle.entity.submarine.EntitySubmSo;
import com.lulan.shincolle.entity.submarine.EntitySubmU511;
import com.lulan.shincolle.entity.submarine.EntitySubmU511Mob;
import com.lulan.shincolle.entity.submarine.EntitySubmYo;
import com.lulan.shincolle.entity.transport.EntityTransportWa;
import com.lulan.shincolle.init.ModBlocks;
import com.lulan.shincolle.init.ModItems;
import com.lulan.shincolle.item.BasicEntityItem;
import com.lulan.shincolle.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	
	//textures
	public static final ResourceLocation TextureGuiHUD = new ResourceLocation(Reference.TEXTURES_GUI+"GuiHUD.png");
	
	//keys
	public static int keyGCD = 0;			//key global cooldown
	public static boolean showMorphSkills = false;	//show morph skills icon
	
	//keys
	public static int rideKeys = 0;			//CLIENT SIDE ONLY
	public static int openGUI = 0;			//CLIENT SIDE ONLY
	public static int keyMountActionCD = 0;	//CLIENT SIDE ONLY, key CD for mount movement
	public static int keyPlayerSkillCD = 0;	//CLIENT SIDE ONLY, key CD for player skill
	
	//render view change
	public static boolean isViewChanged = false;	//CLIENT SIDE ONLY
	public static boolean isViewPlayer = false;		//CLIENT SIDE ONLY
	
	//debug
	public static int debugCooldown = 0;	//CLIENT SIDE ONLY
	public static float field1 = 0F;		//CLIENT SIDE ONLY
	public static float field2 = 0F;		//CLIENT SIDE ONLY
	public static float field3 = 0F;		//CLIENT SIDE ONLY
	public static float field4 = 0F;		//CLIENT SIDE ONLY
	public static float field5 = 0F;		//CLIENT SIDE ONLY
	public static float field6 = 0F;		//CLIENT SIDE ONLY
	
	
	public ClientProxy()
	{
	}
	
	//client world
	public static World getClientWorld()
	{
		return Minecraft.getMinecraft().world;
	}
	
	//client player
	public static EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().player;
	}
	
	//client game setting
	public static GameSettings getGameSetting()
	{
		return Minecraft.getMinecraft().gameSettings;
	}
	
	//client minecraft
	public static Minecraft getMineraft()
	{
		return Minecraft.getMinecraft();
	}

	//登錄偵測按鍵
	@Override
	public void registerKeyBindings() {}
	
	//init entity, item, block models
	@Override
	public void registerRender() throws Exception
	{
		
		
		
		
		//init item models
		ModItems.initModels();
		
		//init block models
		ModBlocks.initModels();	
		
		//取代mc原本的tesr item renderer, 改為自訂的renderer
		TileEntityItemStackRenderer.instance = new RenderTileEntityItem();
		
		//custom item entity render
		RenderingRegistry.registerEntityRenderingHandler(BasicEntityItem.class, RenderBasicEntityItem.FACTORY);

		//entity render (model class, shadow size)
		RenderingRegistry.registerEntityRenderingHandler(EntityAirfieldHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBKongou.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBKongouMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBHiei.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBHieiMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBHaruna.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBHarunaMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBKirishima.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBBKirishimaMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipNGT.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipNGTMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipYMT.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipYMTMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipRu.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipTa.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityBattleshipRe.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCAHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierAkagi.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierAkagiMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierKaga.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierKagaMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierWD.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCarrierWo.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCAAtago.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCAAtagoMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCATakao.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCATakaoMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCLTenryuu.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCLTenryuuMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCLTatsuta.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCLTatsutaMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerI.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerRo.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerHa.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerNi.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerAkatsuki.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerAkatsukiMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerHibiki.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerHibikiMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerIkazuchi.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerIkazuchiMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerInazuma.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerInazumaMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerShimakaze.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityDestroyerShimakazeMob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityHarbourHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityIsolatedHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityMidwayHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCARi.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityCANe.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityNorthernHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityRensouhou.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityRensouhouMob.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityRensouhouS.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmHime.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySSNH.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmKa.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmYo.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmSo.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmRo500.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmRo500Mob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmU511.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntitySubmU511Mob.class, RenderShipEntity.FACTORY_SHIP);
		RenderingRegistry.registerEntityRenderingHandler(EntityTransportWa.class, RenderShipEntity.FACTORY_SHIP);
		
		//mount render
		RenderingRegistry.registerEntityRenderingHandler(EntityMountAfH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountBaH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountCaWD.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountHbH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountCaH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountIsH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountMiH.class, RenderMountsEntity.FACTORY_MOUNT);
		RenderingRegistry.registerEntityRenderingHandler(EntityMountSuH.class, RenderMountsEntity.FACTORY_MOUNT);
		
		//misc render
		RenderingRegistry.registerEntityRenderingHandler(EntityAbyssMissile.class, RenderMiscEntity.FACTORY_MISC);
		RenderingRegistry.registerEntityRenderingHandler(EntityProjectileBeam.class, RenderMiscEntity.FACTORY_MISC);
		RenderingRegistry.registerEntityRenderingHandler(EntityProjectileStatic.class, RenderMiscEntity.FACTORY_MISC);
		RenderingRegistry.registerEntityRenderingHandler(EntityShipFishingHook.class, RenderShipFishing.FACTORY_FISHINGHOOK);
		
		//summons render
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplane.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplaneTakoyaki.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplaneT.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplaneZero.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplaneTMob.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityAirplaneZeroMob.class, RenderSummonEntity.FACTORY_SUMMON);
		RenderingRegistry.registerEntityRenderingHandler(EntityFloatingFort.class, RenderSummonEntity.FACTORY_SUMMON);
	
	}
	
	
}