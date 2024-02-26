package net.underplayer97.foolsgold.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.underplayer97.foolsgold.FoolsGold;

public class ModSounds {


    public static SoundEvent GRIM_DEMOMAN = registerSoundEvent("grim_demoman");
    public static SoundEvent JONATHAN_RIZZ = registerSoundEvent("jonathan_rizz");
    public static SoundEvent UNDER_SCREAM = registerSoundEvent("under_scream");
    public static SoundEvent FRIZZ_SKEPPY = registerSoundEvent("frizz_skeppy");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(FoolsGold.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FoolsGold.LOGGER.info("Registering Sounds for " + FoolsGold.MOD_ID);
    }

}
