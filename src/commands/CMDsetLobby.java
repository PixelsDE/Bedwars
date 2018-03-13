package commands;
//Code by: PixelsDE

import util.methods.Factory;
import util.methods.Messages;
import util.methods.Settings;
import util.methods.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class CMDsetLobby implements CommandExecutor {


    File file = Var.cfgFile;
    YamlConfiguration cfg = Var.cfg;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("setlobby")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                if (p.hasPermission("bw.setlobby")) {


                    try {
                        Factory.createConfiguration(p.getLocation(), "Spawn.Lobby", file, cfg);
                        YamlConfiguration cfg1 = Messages.cfg;
                        String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Setlobby"));
                        String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix1 + msg1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                } else {
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Noperm"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    p.sendMessage(prefix1 + msg1);
                }
            } else {
                YamlConfiguration cfg1 = Messages.cfg;
                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Must_Player"));
                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                Bukkit.getConsoleSender().sendMessage(prefix1 + msg1);
            }
        }


        return false;
    }
}
