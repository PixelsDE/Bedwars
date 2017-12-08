package commands;
//Code by: PixelsDE

import Bedwars.Main;
import methods.Factory;
import methods.Messages;
import methods.Settings;
import methods.Var;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.io.File;

public class CMDsetVillager implements CommandExecutor {


    File file = Var.cfgFile;
    YamlConfiguration cfg = Var.cfg;


    public static  int i = 0;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("setvillager")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;


                if (p.hasPermission("bw.setvillager")) {
                    if (args.length != 1) {
                        try {
                            i++;
                            String world = p.getWorld().getName();
                            double x = p.getLocation().getX();
                            double y = p.getLocation().getY();
                            double z = p.getLocation().getZ();


                            Var.cfg.set("Spawn.Villager." + i + ".World", world);
                            Var.cfg.set("Spawn.Villager." + i + ".X", x);
                            Var.cfg.set("Spawn.Villager." + i + ".Y", y);
                            Var.cfg.set("Spawn.Villager." + i + ".Z", z);

                            Factory.createConfiguration(p.getLocation(), "Spawn." + i, file, cfg);
                            Villager v = p.getWorld().spawn(p.getLocation(), Villager.class);
                            v.setCustomName("§6Shop");
                            v.setCustomNameVisible(true);
                            v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999999, 999999999));
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        }
                        YamlConfiguration cfg1 = Messages.cfg;
                        String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Setvillager"));
                        String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix1 + msg1);

                    }else{

                    }
                } else {

                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Noperm"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    p.sendMessage(prefix1 + msg1);
                }
            } else {

            }
        }


        return false;
    }
}
