package util;

import main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class StatsSystem {

    private static Main plugin;

    public StatsSystem(Main plugin) {
        StatsSystem.plugin = plugin;
    }

    public static File cfgFile = new File("plugins/main/stats.yml");
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(cfgFile);

    public static void SaveStats() {


        try {
            cfg.save(cfgFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
