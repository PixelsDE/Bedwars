package methods;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;


public class Factory {

    public static void createConfiguration(Location loc, String path, File file, YamlConfiguration cfg) {
        cfg.set(path + ".World", loc.getWorld().getName());
        cfg.set(path + ".X", loc.getX());
        cfg.set(path + ".Y", loc.getY());
        cfg.set(path + ".Z", loc.getZ());
        cfg.set(path + ".Yaw", loc.getYaw());
        cfg.set(path + ".Pitch", loc.getPitch());
        try {
            cfg.save(file);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static Location getConfigLocation(String path, YamlConfiguration cfg) {



        World w = Bukkit.getWorld(cfg.getString(path + ".World"));
        double x = cfg.getDouble(path + ".X");
        double y = cfg.getDouble(path + ".Y");
        double z = cfg.getDouble(path + ".Z");
        float yaw = (float) cfg.getDouble(path + ".Yaw");
        float pitch = (float) cfg.getDouble(path + ".Pitch");


        return new Location(w, x, y, z, yaw, pitch);
    }

}
