package com.team.ne.init;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class NEWorldGen implements IWorldGenerator{
	
	private WorldGenerator iridium_ore;
	private WorldGenerator barium_ore;
	private WorldGenerator uranium_ore;
	
	public NEWorldGen(){
		this.iridium_ore = new WorldGenMinable(NEBlocks.iridium_ore.getDefaultState(), 8);
		this.barium_ore = new WorldGenMinable(NEBlocks.barium_ore.getDefaultState(), 8);
		this.uranium_ore = new WorldGenMinable(NEBlocks.uranium_ore.getDefaultState(), 8);

	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()){
		case 0:
			this.runGenerator(this.iridium_ore, world, random, chunkX, chunkZ, 10, 12, 60);
			this.runGenerator(this.barium_ore, world, random, chunkX, chunkZ, 5, 12, 60);
			this.runGenerator(this.uranium_ore, world, random, chunkX, chunkZ, 1, 0, 20);
			break;
		case -1:
			
			break;
		case 1:
			
			break;
		}
	}
}
