package net.sander.modxz.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeItemTab {
    public static final CreativeModeTab XZ_TAB = new CreativeModeTab("KekLol") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMBER.get());
        }



    };
}
