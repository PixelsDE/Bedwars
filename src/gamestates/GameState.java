package gamestates;

import util.methods.Messages;
import util.methods.Settings;
import org.bukkit.Bukkit;

import util.methods.Var;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

public abstract class GameState {


    public static final int LOBBY_STATE = 0, INGAME_STATE = 1, END_STATE = 2;

    public abstract void init();

    public abstract void end();

    public static void checkWinning() {

        if (Settings.editmode == false) {
            if (GameStateHandler.getCurrentState() instanceof IngameState) {
                if (Var.blue.size() == 0 && Var.green.size() == 0 && Var.red.size() == 0) {
                    GameStateHandler.getCurrentState().end();
                    GameStateHandler.setGameState(2);
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Win_Yellow"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix1 + msg1);

                } else if (Var.blue.size() == 0 && Var.green.size() == 0 && Var.yellow.size() == 0) {
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Win_Red"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix1 + msg1);
                    GameStateHandler.getCurrentState().end();
                } else if (Var.blue.size() == 0 && Var.yellow.size() == 0 && Var.red.size() == 0) {
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Win_Green"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix1 + msg1);
                    GameStateHandler.getCurrentState().end();
                } else if (Var.red.size() == 0 && Var.green.size() == 0 && Var.yellow.size() == 0) {
                    YamlConfiguration cfg1 = Messages.cfg;
                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Win_Blue"));
                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix1 + msg1);
                    GameStateHandler.getCurrentState().end();
                } else {

                }

            } else {

            }
        }else{

        }
    }


}
