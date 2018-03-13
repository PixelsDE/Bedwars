package commands;

//Code by: PixelsDE

import main.Main;
import util.methods.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class CMDgold implements CommandExecutor {


    private Main plugin;
    public CMDgold(Main plugin){
        this.plugin = plugin;
    }

    File file = Var.cfgFile;
    YamlConfiguration cfg = Var.cfg;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("setgold")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                if (p.hasPermission("bw.setgold")) {

                    try {
                        RushSpawner rs = new RushSpawner(plugin);
                        int i = rs.setSpawn("gold", p.getLocation());
                        YamlConfiguration cfg1 = Messages.cfg;
                        String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("SetGold").replace("%int%", Integer.toString(i)));
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
