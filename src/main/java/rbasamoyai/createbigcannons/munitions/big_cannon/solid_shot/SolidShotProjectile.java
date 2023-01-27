package rbasamoyai.createbigcannons.munitions.big_cannon.solid_shot;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import rbasamoyai.createbigcannons.CBCBlocks;
import rbasamoyai.createbigcannons.munitions.big_cannon.AbstractBigCannonProjectile;

public class SolidShotProjectile extends AbstractBigCannonProjectile {

	public SolidShotProjectile(EntityType<? extends SolidShotProjectile> type, Level level) {
		super(type, level);
		this.setPenetrationPoints((byte) 5);
	}
	
	@Override
	public BlockState getRenderedBlockState() {
		return CBCBlocks.SOLID_SHOT.getDefaultState().setValue(BlockStateProperties.FACING, Direction.NORTH);
	}

}
