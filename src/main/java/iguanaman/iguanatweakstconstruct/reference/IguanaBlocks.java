package iguanaman.iguanatweakstconstruct.reference;

import iguanaman.iguanatweakstconstruct.util.IguanaLog;
import iguanaman.iguanatweakstconstruct.blocks.IguanaToolForgeBlock;
import iguanaman.iguanatweakstconstruct.blocks.IguanaToolStationBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tconstruct.common.itemblocks.MetadataItemBlock;
import tconstruct.tools.TinkerTools;
import tconstruct.tools.itemblocks.ToolStationItemBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class IguanaBlocks {

	public static Block gravelNew;
	public static Block newSkullBlock;
	public static Block iguanaToolStationWood;

	public static void init()
	{

		//TOOL STATION + FORGE
		IguanaLog.info("Modifying GUIs");

		TinkerTools.toolStationWood = null;
		TinkerTools.toolStationWood = new IguanaToolStationBlock(Material.wood).setBlockName("ToolStation");
		GameRegistry.registerBlock(TinkerTools.toolStationWood, ToolStationItemBlock.class, "ToolStationBlock");

		TinkerTools.toolForge = null;
		TinkerTools.toolForge = new IguanaToolForgeBlock(Material.iron).setBlockName("ToolForge");
		GameRegistry.registerBlock(TinkerTools.toolForge, MetadataItemBlock.class, "ToolForgeBlock");

		//TinkerWorld.oreGravel = null;
		//TinkerWorld.oreGravel = new IguanaGravelOre().setBlockName("tconstruct.gravelore");
		//GameRegistry.registerBlock(TinkerWorld.oreGravel, GravelOreItem.class, "GravelOre");


		//SKULLS
		IguanaLog.info("Adding skull blocks");
		// TODO: Find a way to change vanilla skulls
		/*Blocks.skull = null;
		newSkullBlock = new IguanaBlockSkull().setHardness(1.0F).setStepSound(Block.soundTypeSand).setBlockName("skull").setBlockTextureName("skull");
		Blocks.skull = newSkullBlock;
		GameRegistry.registerBlock(newSkullBlock, "Skull");
		GameRegistry.registerTileEntity(IguanaTileEntitySkull.class, "SkullEntity");*/


	}

}