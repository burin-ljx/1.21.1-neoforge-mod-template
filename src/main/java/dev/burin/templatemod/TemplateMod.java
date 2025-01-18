package dev.burin.templatemod;

import com.tterrag.registrate.Registrate;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(TemplateMod.MOD_ID)
public class TemplateMod {
    public static final String MOD_ID = "templatemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(TemplateMod.class);
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);

    public TemplateMod() {
        LOGGER.debug("Mod loading.");
    }
}
