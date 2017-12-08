package commands;

import Bedwars.Main;
import methods.Factory;
import methods.Messages;
import methods.Settings;
import methods.Var;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class CMDsetspawn implements CommandExecutor {

    File file = Var.cfgFile;
    YamlConfiguration cfg = Var.cfg;
    private Main plugin;

    public CMDsetspawn(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // TODO Auto-generated method stub
        if (cmd.getName().equalsIgnoreCase("setspawn")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                if (p.hasPermission("bw.setspawn")) {


                    if (args.length == 1) {
                        try {
                            String platz = args[0];
                            if (platz.equalsIgnoreCase("blue") || platz.equalsIgnoreCase("red") || platz.equalsIgnoreCase("yellow") || platz.equalsIgnoreCase("green")) {
                                Factory.createConfiguration(p.getLocation(), "Spawn." + platz, file, cfg);
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("SetSpawns").replace("%team%", args[0]));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                p.sendMessage(prefix1 + msg1);


                            }
                        } catch (Exception exe) {
                            exe.printStackTrace();
                        }


                    }else{

                    }

                } else {
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Noperm"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    p.sendMessage(prefix1 + msg1);
                }

            }
        }


        return false;


    }
}
