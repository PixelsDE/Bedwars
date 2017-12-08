package listeners;

import Bedwars.Main;
import methods.Settings;
import methods.Var;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class EVENTchat implements Listener {


    private static Main plugin;

    public EVENTchat(Main plugin) {
        EVENTchat.plugin = plugin;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            Player p = e.getPlayer();
            String msg = e.getMessage();

            String a = "@all";
            for (Player all : Bukkit.getOnlinePlayers()) {
                if (Var.playing.contains(p)) {

                    if (!msg.startsWith("@all")) {
                        if (Var.blue.contains(p)) {
                            if (Var.blue.contains(all)) {

                                e.setCancelled(true);
                                all.sendMessage("<" + p.getDisplayName() + "> " + msg);
                            } else {
                                e.setCancelled(true);
                            }

                        } else if (Var.red.contains(p)) {
                            if (Var.red.contains(all)) {
                                e.setCancelled(true);
                                all.sendMessage("<" + p.getDisplayName() + "> " + msg);
                            } else {
                                e.setCancelled(true);
                            }
                        } else if (Var.green.contains(p)) {
                            if (Var.green.contains(all)) {
                                e.setCancelled(true);
                                all.sendMessage("<" + p.getDisplayName() + "> " + msg);

                            } else {
                                e.setCancelled(true);
                            }
                        } else if (Var.yellow.contains(p)) {
                            if (Var.yellow.contains(all)) {
                                e.setCancelled(true);
                                all.sendMessage("<" + p.getDisplayName() + "> " + msg);
                            } else {
                                e.setCancelled(true);
                            }

                        } else {

                        }


                    } else if (msg.startsWith("@all")) {
                        e.setCancelled(true);
                        all.sendMessage("§7@all§f<" + p.getDisplayName() + "> " + msg.replace("@all ", ""));

                    } else {
                        e.setCancelled(true);
                        p.sendMessage("WAS");
                    }
                } else if (Var.spectating.contains(p)) {
                    if (Var.spectating.contains(all)) {
                        e.setCancelled(true);
                        all.sendMessage("<" + p.getDisplayName() + "> " + msg.replace("@all ", ""));
                    } else {
                        e.setCancelled(true);
                    }

                }
            }
        }else{

        }
    }



}
