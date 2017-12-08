package methods;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Bedwars.Main;

public class RushSpawner {

    private static Main plugin;

    public RushSpawner(Main plugin) {
        RushSpawner.plugin = plugin;
    }

    public Integer setSpawn(String type, Location loc) {
        int i = 0;
        File file = new File(plugin.getDataFolder().getPath(), "spawner.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        i = cfg.getInt(type + ".amount");
        i++;

        cfg.set(type + ".amount", i);

        cfg.set(type + "." + i + ".world", loc.getWorld().getName());
        cfg.set(type + "." + i + ".x", loc.getX());
        cfg.set(type + "." + i + ".y", loc.getY());
        cfg.set(type + "." + i + ".z", loc.getZ());
        try {
            cfg.save(file);
        } catch (IOException ex) {
            // TODO: handle exception
            ex.printStackTrace();
        }

        return i;

    }

    private void spawn(String type, ItemStack item) {
        File file = new File(plugin.getDataFolder().getPath(), "spawner.yml");
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);

        int amount = cfg.getInt(type + ".amount");

        for (int i = 1; i < amount + 1; i++) {
            String world = cfg.getString(type + "." + i + ".world");
            double x = cfg.getDouble(type + "." + i + ".x");
            double y = cfg.getDouble(type + "." + i + ".y");
            double z = cfg.getDouble(type + "." + i + ".z");
            Location loc = new Location(Bukkit.getWorld(world), x, y, z);
            loc.getWorld().dropItem(loc, item);


        }
    }

    public void startSpawners() {
        Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {

            @Override
            public void run() {
                ItemStack item = new ItemStack(Material.GOLD_INGOT);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName("§6Gold");

                item.setItemMeta(im);
                spawn("gold", item);
                // TODO Auto-generated method stub

            }
        }, 20*Settings.cfg.getInt("Spawner_Gold"), 20*Settings.cfg.getInt("Spawner_Gold"));

        Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {

            @Override
            public void run() {
                ItemStack item = new ItemStack(Material.EMERALD);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName("§aEmerald");

                item.setItemMeta(im);
                spawn("emerald", item);
                // TODO Auto-generated method stub

            }
        }, 20 * Settings.cfg.getInt("Spawner_Emerald"), 20 * Settings.cfg.getInt("Spawner_Emerald"));

        Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {

            @Override
            public void run() {
                ItemStack item = new ItemStack(Material.DIAMOND);
                ItemMeta im = item.getItemMeta();
                im.setDisplayName("§bDiamond");

                item.setItemMeta(im);
                spawn("diamond", item);
                // TODO Auto-generated method stub


            }
        }, 20 * Settings.cfg.getInt("Spawner_Diamond"), 20 * Settings.cfg.getInt("Spawner_Diamond"));

    }


}
