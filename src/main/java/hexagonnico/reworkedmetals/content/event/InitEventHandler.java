package hexagonnico.reworkedmetals.content.event;

import net.minecraft.world.gen.GenerationStage;

import hexagonnico.reworkedmetals.ReworkedMetals;
import hexagonnico.reworkedmetals.config.Config;
import hexagonnico.reworkedmetals.registry.WorldGenRegistry;

import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ReworkedMetals.ID)
public class InitEventHandler {
    
    @SubscribeEvent // Event run when loading biomes
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(Config.getBoolean("copperOreGenEnabled")) {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistry.ORE_COPPER);
        }
        if(Config.getBoolean("tinOreGenEnabled")) {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistry.ORE_TIN);
        }
        if(Config.getBoolean("aluminumOreGenEnabled")) {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistry.ORE_ALUMINUM);
        }
        if(Config.getBoolean("nickelOreGenEnabled")) {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistry.ORE_NICKEL);
        }
        if(Config.getBoolean("rubyOreGenEnabled") && event.getName() != null && event.getName().getPath().contains("shattered_savanna")) {
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WorldGenRegistry.ORE_RUBY);
        }
    }
}
