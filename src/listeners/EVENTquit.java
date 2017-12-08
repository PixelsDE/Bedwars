package listeners;

import Util.Scoreboard;


import methods.Messages;
import methods.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import gamestates.GameState;
import gamestates.GameStateHandler;
import gamestates.LobbyState;
import methods.Var;

public class EVENTquit implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {

        if (Settings.editmode == false) {
            e.setQuitMessage(null);
            Player p = e.getPlayer();
            if (GameStateHandler.getCurrentState() instanceof LobbyState) {

                LobbyState ls = (LobbyState) GameStateHandler.getCurrentState();

                try {
                    p.getInventory().clear();
                    p.updateInventory();
                    Var.blue.remove(p);
                    Var.red.remove(p);
                    Var.green.remove(p);
                    Var.yellow.remove(p);
                    Var.playing.remove(p);
                    Var.spectating.add(p);
                    GameState.checkWinning();
                    p.getInventory().clear();
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Quit").replace("%max_players%", Integer.toString(Settings.cfg.getInt("Max_Players")))).replace("%player%", p.getDisplayName()).replace("%playing%", Integer.toString(Var.playing.size()));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix + msg);
                    GameState.checkWinning();
                    for (Player a : Bukkit.getOnlinePlayers())
                        Scoreboard.updateScoreboard(a);
                } catch (Exception exe) {
                    // TODO: handle exception
                }


                if (Var.playing.size() < LobbyState.MIN_PLAYERS) {
                    if (ls.getCountdown().isRunning) {
                        ls.getCountdown().stopCountDown();
                        ls.getCountdown().idle();

                    } else {

                    }

                } else {

                }
            } else {
                p.getInventory().clear();
                p.updateInventory();
                if (Var.playing.contains(p)) {
                    Var.playing.remove(p);
                    Var.spectating.add(p);
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Ingame_Quit").replace("%player%", p.getDisplayName()));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix + msg);
                    GameState.checkWinning();
                    try {
                        for (Player a : Bukkit.getOnlinePlayers())
                            Scoreboard.updateScoreboard(a);
                    } catch (Exception exe) {

                    }


                } else {

                }
            }
        }else {

        }
    }


    @EventHandler
    public void shutdown(PlayerQuitEvent e){
        if (Bukkit.getOnlinePlayers().equals(0)){
            Bukkit.getServer().reload();

        }else{

        }
    }

}
