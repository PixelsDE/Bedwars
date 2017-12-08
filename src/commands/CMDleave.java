package commands;
//Code by: PixelsDE

import methods.Messages;
import methods.Settings;
import methods.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class CMDleave implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("leave")){
            if (sender instanceof Player){
                Player p = (Player)sender;
                if (p.hasPermission("bw.leave")){

                    if (Var.playing.contains(p)){
                        try {

                            Var.playing.remove(p);
                            Var.spectating.add(p);
                            Var.blue.remove(p);
                            Var.red.remove(p);
                            Var.yellow.remove(p);
                            Var.green.remove(p);
                            p.kickPlayer(null);

                            try {
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Iname_Quit").replace(("%player%"), p.getDisplayName()));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                Bukkit.broadcastMessage(prefix1 + msg1);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else{

                    }
                }else{
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Noperm"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    p.sendMessage(prefix1 + msg1);
                }
            }else{

            }
        }
        return false;
    }
}
