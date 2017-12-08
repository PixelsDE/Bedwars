package listeners;

import Bedwars.Main;
import methods.Bed;
import methods.Messages;
import methods.Settings;
import methods.Var;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.io.File;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class EVENTBett implements Listener {

    private static Main plugin;
    File file = Var.cfgFile;
    YamlConfiguration cfg = Var.cfg;


    public EVENTBett(Main plugin) {
        EVENTBett.plugin = plugin;
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {


        Block b = e.getBlock();
        Player p = e.getPlayer();
        Location loc = b.getLocation();
        if (b.getType().equals(Material.BED) || b.getType().equals(Material.BED_BLOCK)) {
            World w_blue = Bukkit.getWorld(Bed.cfg.getString("Spawn.Bed.blue.World"));
            double x_blue = Bed.cfg.getDouble("Spawn.Bed.blue.X");
            double y_blue = Bed.cfg.getDouble("Spawn.Bed.blue.Y");
            double z_blue = Bed.cfg.getDouble("Spawn.Bed.blue.Z");
            Location loc_blue = new Location(w_blue, x_blue, y_blue, z_blue);

            World w_red = Bukkit.getWorld(Bed.cfg.getString("Spawn.Bed.red.World"));
            double x_red = Bed.cfg.getDouble("Spawn.Bed.red.X");
            double y_red = Bed.cfg.getDouble("Spawn.Bed.red.Y");
            double z_red = Bed.cfg.getDouble("Spawn.Bed.red.Z");
            Location loc_red = new Location(w_red, x_red, y_red, z_red);

            World w_green = Bukkit.getWorld(Bed.cfg.getString("Spawn.Bed.green.World"));
            double x_green = Bed.cfg.getDouble("Spawn.Bed.green.X");
            double y_green = Bed.cfg.getDouble("Spawn.Bed.green.Y");
            double z_green = Bed.cfg.getDouble("Spawn.Bed.green.Z");
            Location loc_green = new Location(w_green, x_green, y_green, z_green);

            World w_yellow = Bukkit.getWorld(Bed.cfg.getString("Spawn.Bed.yellow.World"));
            double x_yellow = Bed.cfg.getDouble("Spawn.Bed.yellow.X");
            double y_yellow = Bed.cfg.getDouble("Spawn.Bed.yellow.Y");
            double z_yellow = Bed.cfg.getDouble("Spawn.Bed.yellow.Z");
            Location loc_yellow = new Location(w_yellow, x_yellow, y_yellow, z_yellow);
            String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
            YamlConfiguration cfg1 = Messages.cfg;


            if (loc.distance(loc_red) < 3) {
                if (!Var.red.contains(p)) {

                    e.setCancelled(false);
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Red").replace("%player%", p.getDisplayName()));

                    Bukkit.broadcastMessage(prefix1 + msg1);
                    Var.bed_red = false;
                    p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);
                    if (Var.red.contains(p)) {
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Team"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);
                    } else {

                    }


                } else {
                    e.setCancelled(true);
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Own"));
                    p.sendMessage(prefix1 + msg);
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                }


            } else if (loc.distance(loc_blue) < 3) {
                if (!Var.blue.contains(p)) {
                    e.setCancelled(false);
                    p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Blue").replace("%player%", p.getDisplayName()));

                    Bukkit.broadcastMessage(prefix1 + msg1);
                    Var.bed_blue = false;
                    if (Var.blue.contains(p)) {
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Team"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);
                    } else {

                    }
                } else {
                    e.setCancelled(true);
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Own"));
                    p.sendMessage(prefix1 + msg);
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                }


            } else if (loc.distance(loc_green) < 3) {
                if (!Var.green.contains(p)) {
                    e.setCancelled(false);
                    p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Green").replace("%player%", p.getDisplayName()));

                    Bukkit.broadcastMessage(prefix1 + msg1);
                    Var.bed_green = false;
                    if (Var.green.contains(p)) {
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Team"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);
                    } else {

                    }
                } else {
                    e.setCancelled(true);
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Own"));
                    p.sendMessage(prefix1 + msg);
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                }


            } else if (loc.distance(loc_yellow) < 3) {
                if (!Var.yellow.contains(p)) {
                    e.setCancelled(false);
                    p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Yellow").replace("%player%", p.getDisplayName()));

                    Bukkit.broadcastMessage(prefix1 + msg1);
                    Var.bed_yellow = false;
                    if (Var.yellow.contains(p)) {
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Team"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);
                    } else {

                    }
                } else {
                    e.setCancelled(true);
                    p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Break_Own"));
                    p.sendMessage(prefix1 + msg);
                }
            } else {

            }
        } else {

        }
    }


}
