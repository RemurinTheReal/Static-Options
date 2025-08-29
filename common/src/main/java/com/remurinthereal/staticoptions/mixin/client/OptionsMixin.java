package com.remurinthereal.staticoptions.mixin.client;

import com.remurinthereal.staticoptions.StaticOptions;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.io.File;

import static com.remurinthereal.staticoptions.client.StaticOptionsClient.STATIC_OPTIONS_PATH;

@Mixin(Options.class)
public class OptionsMixin {
    @Redirect(method = "<init>", at = @At(value = "NEW", target = "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;"))
    private File init(File parent, String child) {
        if (STATIC_OPTIONS_PATH != null) {
            StaticOptions.LOGGER.info("Redirecting options.txt file creation.");
            return new File(STATIC_OPTIONS_PATH, child);
        }

        StaticOptions.LOGGER.warn("Failed to redirect options.txt file creation.");
        return new File(parent, child);
    }
}
