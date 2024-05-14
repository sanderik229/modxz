package net.sander.modxz.procedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.sander.modxz.ModXz;
import net.sander.modxz.item.ModItems;


import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class megapick{
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.AMETHYST_MULTITOOL.get()) {
            if (entity.getXRot() > 40 || entity.getXRot() < -40) {
                if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
            } else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
                if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y - 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y + 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y + 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y + 1, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y + 1, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y - 1, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 1, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y + 1, z - 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y + 1, z - 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y - 1, z + 1);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 1, z + 1), null);
                        world.destroyBlock(_pos, false);
                    }
                }
            } else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
                if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y - 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y - 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x, y + 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y + 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y + 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y + 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y - 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y - 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x - 1, y + 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x - 1, y + 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
                if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
                    {
                        BlockPos _pos = new BlockPos(x + 1, y - 1, z);
                        Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x + 1, y - 1, z), null);
                        world.destroyBlock(_pos, false);
                    }
                }
            }
        }
    }
}
