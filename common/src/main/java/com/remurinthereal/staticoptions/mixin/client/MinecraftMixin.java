package com.remurinthereal.staticoptions.mixin.client;

import com.remurinthereal.staticoptions.StaticOptions;
import com.remurinthereal.staticoptions.client.StaticOptionsClient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Redirect(method = "<init>", at = @At(value = "NEW", target = "(Lnet/minecraft/client/Minecraft;Ljava/io/File;)Lnet/minecraft/client/Options;"))
    private Options init(Minecraft flag, File arg) {
        var path = StaticOptionsClient.STATIC_OPTIONS_PATH;
        if (path == null) return new Options(flag, arg);

        var formedPath = Path.of(path);
        if (Files.notExists(formedPath)) {
            try {
                Files.createDirectory(formedPath);
            } catch (Exception exception) {
                StaticOptions.LOGGER.error(exception);
                return new Options(flag, arg);
            }
        }

        return new Options(flag, new File(path));
    }
}
