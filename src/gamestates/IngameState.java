package gamestates;

import Bedwars.Main;
import commands.CMDsetVillager;
import methods.Factory;
import methods.RushSpawner;
import methods.Settings;
import methods.Var;
import methods.countdowns.EndCountdown;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class IngameState extends GameState {

    public static boolean spawners = false;
    private static Main plugin;
    private EndCountdown endCountdown;

    public IngameState(Main plugin) {
        IngameState.plugin = plugin;
    }

    @Override
    public void init() {
        if (Settings.editmode == false) {
            endCountdown = new EndCountdown(Main.getPlugin());
            // TODO Auto-generated method stub
            for (int i = 0; i < Var.playing.size(); i++) {
                Player p = Var.playing.get(i);


                Var.plays.remove(p);
                p.getInventory().clear();


                RushSpawner rs = new RushSpawner(plugin);
                rs.startSpawners();

                if (Var.blue.contains(p)) {
                    try {
                        p.teleport(Factory.getConfigLocation("Spawn.blue", Var.cfg));
                        p.setGameMode(GameMode.SURVIVAL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (Var.red.contains(p)) {
                    try {
                        p.teleport(Factory.getConfigLocation("Spawn.red", Var.cfg));
                        p.setGameMode(GameMode.SURVIVAL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (Var.green.contains(p)) {

                    try {

                        p.teleport(Factory.getConfigLocation("Spawn.green", Var.cfg));
                        p.setGameMode(GameMode.SURVIVAL);
                    } catch (Exception e) {

                    }
                } else if (Var.yellow.contains(p)) {
                    try {
                        p.teleport(Factory.getConfigLocation("Spawn.yellow", Var.cfg));
                        p.setGameMode(GameMode.SURVIVAL);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {

                }

            }

        }else{

        }
    }

    @Override
    public void end() {
        endCountdown.start();
        // TODO Auto-generated method stub
    }

}
