package net.sander.modxz.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sander.modxz.ModXz;
import net.sander.modxz.item.ModCreativeItemTab;

import java.util.Properties;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ModXz.MOD_ID);


    public static final RegistryObject<SoundEvent> MELL_PLAKI = registerSoundEvents("mell_plaki");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(ModXz.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){SOUND_EVENTS.register(eventBus); }
}
