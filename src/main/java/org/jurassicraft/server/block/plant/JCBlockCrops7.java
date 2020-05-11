package org.jurassicraft.server.block.plant;

import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;

public abstract class JCBlockCrops7 extends JCBlockCropsBase {
    private static int MAX_AGE = 6;
    private static PropertyInteger AGE = PropertyInteger.create("age", 0, MAX_AGE);

    @Override
    protected PropertyInteger getAgeProperty() {
        return AGE;
    }

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, AGE);
    }
}
