package pluto.solutions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Path;
import javax.swing.JOptionPane;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RusherCrack implements PreLaunchEntrypoint {
    public static Logger LOGGER = LogManager.getLogger("RusherCrack");

    public void onPreLaunch() {
        String var1 = "  _____           _               _    _            _    \n |  __ \\         | |             | |  | |          | |   \n | |__) |   _ ___| |__   ___ _ __| |__| | __ _  ___| | __\n |  _  / | | / __| '_ \\ / _ \\ '__|  __  |/ _` |/ __| |/ /\n | | \\ \\ |_| \\__ \\ | | |  __/ |  | |  | | (_| | (__|   < \n |_|  \\_\\__,_|___/_| |_|\\___|_|  |_|  |_|\\__,_|\\___|_|\\_\\";
        int var2 = "                                                         ".length();

        for (String var6 : var1.split("\n")) {
            LOGGER.info(var6);
        }

        LOGGER.info(" ");
        printSpaced("PlutoSolutions (2021 - 2024):");
        printSpaced("Telegram: https://t.me/plutosolutions");
        printSpaced("GitHub: https://github.com/PlutoSolutions");
        printSpaced("if you paid for this, you have been scammed");
        LOGGER.info("============================================================");
        Path var16 = Path.of("rusherhack", "shaders", "mainmenu");
        File var17 = var16.toFile();
        if (!var17.exists()) {
            LOGGER.info("Extracting RusherHack shaders");

            try {
                if (!var17.mkdirs()) {
                    throw new IllegalStateException("Failed to create the directory");
                }

                Thread.sleep(500L);
                String[] var18 = new String[]{
                    "bluehole.fsh",
                    "borealis.fsh",
                    "cube.fsh",
                    "cubicpulse.fsh",
                    "desert.fsh",
                    "dna.fsh",
                    "gammarays.fsh",
                    "gas.fsh",
                    "lines.fsh",
                    "liquid.fsh",
                    "mandelbrot.fsh",
                    "minecraft.fsh",
                    "missing.fsh",
                    "nebula.fsh",
                    "paper.fsh",
                    "pixels.fsh",
                    "rainbowwave.fsh",
                    "rusherhack.fsh",
                    "sea.fsh",
                    "steam.fsh",
                    "sun.fsh"
                };

                for (String var9 : var18) {
                    InputStream var10 = this.getClass().getResourceAsStream("/rhshaders/" + var9);
                    if (var10 == null) {
                        throw new IllegalStateException("Failed to get resource (rhshaders/%s)".formatted(var9));
                    }

                    byte[] var11 = var10.readAllBytes();
                    var10.close();
                    File var12 = Path.of("rusherhack", "shaders", "mainmenu", var9).toFile();
                    FileOutputStream var13 = new FileOutputStream(var12);
                    var13.write(var11);
                    var13.close();
                }

                LOGGER.info("%d shaders extracted".formatted(var18.length));
            } catch (Exception var15) {
                try {
                    if (var16.toFile().exists()) {
                        var16.toFile().delete();
                    }
                } catch (Exception var14) {
                }

                var15.printStackTrace();
                JOptionPane.showMessageDialog(
                    null,
                    "Failed to extract RusherHack shaders into the .minecraft/rusherhack/shaders/mainmenu folder.\nCheck your logs (.minecraft/logs/latest.log) for more information.",
                    "rushercrack",
                    0
                );
            }
        }
    }

    public static void printSpaced(String text) {
        int var1 = "                                                        ".length() / 2;
        var1 -= text.length() / 2;
        LOGGER.info("%s%s".formatted(" ".repeat(var1), text));
    }
}
