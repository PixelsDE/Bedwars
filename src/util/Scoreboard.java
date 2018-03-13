package util;

import main.Main;
import util.methods.Settings;
import util.methods.Var;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class Scoreboard implements Listener {

    private static Main plugin;

    public Scoreboard(Main plugin) {
        Scoreboard.plugin = plugin;
    }

    int sched;


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            final Player p = e.getPlayer();
            for (Player a : Bukkit.getOnlinePlayers())
                Scoreboard.updateScoreboard(a);
            for (Player a : Bukkit.getOnlinePlayers())
                updateScoreboard(a);


        }else{

        }
    }

    public static void updateScoreboard(Player p) {
        if (Settings.cfg.getBoolean("Edit_Mode") == false) {


            org.bukkit.scoreboard.Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
            Objective obj = scoreboard.registerNewObjective("aaa", "bbb");


            YamlConfiguration cfg = Settings.cfg;
            String name = ChatColor.translateAlternateColorCodes('&', cfg.getString("Server_Name"));
            String ip = ChatColor.translateAlternateColorCodes('&', cfg.getString("Ts_Ip"));

            obj.setDisplayName(name);
            obj.setDisplaySlot(DisplaySlot.SIDEBAR);

            if (Settings.cfg.getBoolean("Teams_2") == false) {
                Score five = obj.getScore("§9Blue= " + Integer.toString(Var.blue.size()));
                Score four = obj.getScore("§cRed= " + Integer.toString(Var.red.size()));
                Score three = obj.getScore("§aGreen= " + Integer.toString(Var.green.size()));
                Score two = obj.getScore("§eYellow= " + Integer.toString(Var.yellow.size()));
                Score one = obj.getScore("§6Teamspeak: ");
                Score zero = obj.getScore(ip);

                five.setScore(5);
                four.setScore(4);
                three.setScore(3);
                two.setScore(2);
                one.setScore(1);
                zero.setScore(0);

                for (Player a : Bukkit.getOnlinePlayers())
                    a.setScoreboard(scoreboard);

            } else if (Settings.cfg.getBoolean("Teams_2") == true) {
                Score three = obj.getScore("§9Blue= " + Integer.toString(Var.blue.size()));
                Score two = obj.getScore("§cRed= " + Integer.toString(Var.red.size()));
                Score one = obj.getScore("§6Teamspeak: ");
                Score zero = obj.getScore(ip);

                three.setScore(3);
                two.setScore(2);
                one.setScore(1);
                zero.setScore(0);

                for (Player a : Bukkit.getOnlinePlayers())
                    a.setScoreboard(scoreboard);
            } else {

            }

        }else{

        }
    }


}
