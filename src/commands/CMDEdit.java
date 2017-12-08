package commands;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import methods.Messages;
import methods.Settings;
import methods.Var;
import methods.countdowns.LobbyCountdown;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class CMDEdit implements CommandExecutor {
    File file = Settings.cfgFile;
    YamlConfiguration cfg = Var.cfg;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (cmd.getName().equalsIgnoreCase("editmode")) {
            if (args.length == 1) {
                if (sender instanceof Player) {
                    Player p = (Player) sender;
                    if (p.hasPermission("bw.edit")) {
                        if (args[0].equalsIgnoreCase("off")) {

                            Settings.cfg.set("Edit_Mode", false);
                            Settings.editmode = false;
                            p.sendMessage("§cEditMode OFF!");

                        } else if (args[0].equalsIgnoreCase("on")) {
                            Settings.cfg.set("Edit_Mode", true);
                            Settings.editmode = true;
                            p.sendMessage("§cEditMode ON!");
                        } else {

                            p.sendMessage("§cEDITMODE ON / OFF!");

                        }
                    } else {
                        YamlConfiguration cfg1 = Messages.cfg;
                        String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Noperm"));
                        String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix1 + msg1);
                    }
                } else {
                    if (args[0].equalsIgnoreCase("off")) {
                        Settings.cfg.set("Edit_Mode", false);
                        Settings.editmode = false;
                        Bukkit.getConsoleSender().sendMessage("§cEditMode OFF!");
                    } else if (args[0].equalsIgnoreCase("on")) {
                        Settings.cfg.set("Edit_Mode", true);
                        Settings.editmode = true;

                        Bukkit.getConsoleSender().sendMessage("§cEditMode ON!");
                        LobbyCountdown.isRunning = false;
                        LobbyCountdown.isIdling = false;
                    } else {

                        Bukkit.getConsoleSender().sendMessage("§cEDITMODE ON / OFF!");

                    }

                }
            }else{
                if (sender instanceof Player)
                sender.sendMessage("§cEDITMODE ON / OFF!");
                else
                    Bukkit.getConsoleSender().sendMessage("§cEDITMODE ON / OFF!");
            }
        }
        return false;
    }
}
