package listeners;

import main.Main;
import util.Scoreboard;
import commands.CMDvotegold;
import gamestates.GameStateHandler;
import gamestates.LobbyState;
import util.methods.*;
import util.methods.countdowns.EndCountdown;
import util.methods.countdowns.LobbyCountdown;
import org.bukkit.*;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EVENTjoin implements Listener {

    private static Main plugin;

    public EVENTjoin(Main plugin) {
        EVENTjoin.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            e.setJoinMessage(null);
            Player p = e.getPlayer();

            if (Var.playing.size() <= Settings.cfg.getInt("Max_Players")){
                Var.spectating.add(p);
            }
            p.resetPlayerWeather();
            p.setPlayerTime(0, true);
            if (GameStateHandler.getCurrentState() instanceof LobbyState) {

                LobbyState ls = (LobbyState) GameStateHandler.getCurrentState();

                if (Var.spectating.contains(p)){

                    p.teleport(Factory.getConfigLocation("Spawn.Spectator", Var.cfg));
                    p.setDisplayName("7" + p.getName());
                    p.setPlayerListName("§7" + p.getName());
                }

                ItemStack i = new ItemStack(Material.BED);
                ItemMeta im = i.getItemMeta();
                im.setDisplayName("§bTeamselector");
                i.setItemMeta(im);
                p.getInventory().clear();
                p.getInventory().addItem(i);
                p.updateInventory();



                for (Entity en : Bukkit.getWorld(p.getWorld().getName()).getEntities()) {
                    if (en instanceof Item)
                        en.remove();
                }

                Var.playing.add(p);
                Var.plays.add(p);

                CMDvotegold.yes.add(p);

                for (Player a : Bukkit.getOnlinePlayers())
                    util.Scoreboard.updateScoreboard(a);
                p.setGameMode(GameMode.ADVENTURE);
                Settings.pl = p.getDisplayName();
                for (Player all : Bukkit.getOnlinePlayers()) {

                    if (Var.playing.contains(all)) {
                        if (Var.spectating.contains(p)) {
                            all.hidePlayer(p);
                        } else {

                        }

                    } else {

                    }
                }

                if (Var.blue.size() < Settings.cfg.getInt("Max_Team")) {
                    Var.blue.add(p);
                    p.setPlayerListName("§9" + p.getDisplayName());
                    p.setCustomName("§9" + p.getName() + "§f");
                    p.setCustomNameVisible(true);
                    p.setDisplayName("§9" + p.getName() + "§f");
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Join").replace("%player%", ChatColor.BLUE + p.getDisplayName()).replace("%playing%", Integer.toString(Var.playing.size())).replace("%max_players%", Integer.toString(Settings.cfg.getInt("Max_Players"))));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix + msg);
                    Scoreboard.updateScoreboard(p);
                } else if (Var.red.size() < Settings.cfg.getInt("Max_Team")) {
                    Var.red.add(p);
                    p.setPlayerListName("§c" + p.getName());
                    p.setCustomName("§c" + p.getName() + "§f");
                    p.setCustomNameVisible(true);

                    p.setDisplayName("§c" + p.getName() + "§f");
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Join").replace("%player%", ChatColor.RED + p.getDisplayName()).replace("%playing%", Integer.toString(Var.playing.size())).replace("%max_players%", Integer.toString(Settings.cfg.getInt("Max_Players"))));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix + msg);
                    Scoreboard.updateScoreboard(p);

                } else if (Var.yellow.size() < Settings.cfg.getInt("Max_Team")) {
                    Var.yellow.add(p);
                    p.setPlayerListName("§e" + p.getName());
                    p.setCustomName("§e" + p.getName() + "§f");
                    p.setCustomNameVisible(true);
                    p.setDisplayName("§e" + p.getName() + "§f");

                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Join").replace("%player%", ChatColor.YELLOW + p.getDisplayName()).replace("%playing%", Integer.toString(Var.playing.size())).replace("%max_players%", Integer.toString(Settings.cfg.getInt("Max_Players"))));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.broadcastMessage(prefix + msg);
                    Scoreboard.updateScoreboard(p);
                } else if (Var.green.size() < Settings.cfg.getInt("Max_Team")) {
                    Var.green.add(p);
                    p.setPlayerListName("§a" + p.getName());
                    p.setCustomName("§a" + p.getName() + "§f");
                    p.setCustomNameVisible(true);
                    p.setDisplayName("§a" + p.getName() + "§f");
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Join").replace("%player%", ChatColor.GREEN + p.getDisplayName()).replace("%playing%", Integer.toString(Var.playing.size())).replace("%max_players%", Integer.toString(Settings.cfg.getInt("Max_Players"))));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Scoreboard.updateScoreboard(p);
                    Bukkit.broadcastMessage(prefix + msg);
                } else {

                }

                try {
                    p.teleport(Factory.getConfigLocation("Spawn.Lobby", Var.cfg));

                } catch (Exception e2) {
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Notdefined"));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    p.sendMessage(prefix + msg);
                    Scoreboard.updateScoreboard(p);
                }

                if (Var.playing.size() >= LobbyState.MIN_PLAYERS) {
                    if (ls.getCountdown().isRunning == false) {

                        ls.getCountdown().stopIdle();
                        ls.getCountdown().start();

                    }
                }
                if (Var.playing.size() < LobbyState.MIN_PLAYERS) {
                    if (ls.getCountdown().isIdling == false) {
                        ls.getCountdown().idle();
                        Scoreboard.updateScoreboard(p);
                    } else {

                    }
                } else {

                }

            } else {
                p.setDisplayName("§7" + p.getName());
                p.setPlayerListName("§7" + p.getName());
                Var.playing.remove(p);
                Var.spectating.add(p);
            }

        }else{
            LobbyCountdown.isRunning = false;
            LobbyCountdown.isIdling = false;
        }


    }

        @EventHandler
        public void onPlace (BlockPlaceEvent e) {
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                Player p = e.getPlayer();
                if (Var.playing.contains(p)) {
                    if (Var.plays.contains(p)) {
                        YamlConfiguration cfg = Messages.cfg;
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Notbuild"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);
                        e.setCancelled(true);

                    } else {

                    }
                } else {

                }

            }else{
                LobbyCountdown.isRunning = false;
                LobbyCountdown.isIdling = false;
            }
        }

        @EventHandler
        public void onBreak (BlockBreakEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            Player p = e.getPlayer();
            if (Var.playing.contains(p)) {
                if (Var.plays.contains(p)) {
                    if (!p.hasPermission("bw.build")) {
                        YamlConfiguration cfg = Messages.cfg;
                        String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Notbuild"));
                        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix + msg);

                        e.setCancelled(true);

                    } else {

                    }
                } else {

                }

            }else{

            }
            } else {
                LobbyCountdown.isRunning = false;
                LobbyCountdown.isIdling = false;
            }
        }

        @EventHandler
        public void onDamage (EntityDamageByEntityEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                if (e.getDamager() instanceof Player) {
                    Player p = (Player) e.getDamager();
                    Entity pl = e.getEntity();
                    if (Var.playing.contains(p)) {
                        if (Var.plays.contains(p)) {
                            e.setCancelled(true);
                            YamlConfiguration cfg = Messages.cfg;
                            String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Game_Nothit"));
                            String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                            p.sendMessage(prefix + msg);
                        } else {

                        }

                    } else {

                    }

                } else {

                }
            }else{
                LobbyCountdown.isRunning = false;
                LobbyCountdown.isIdling = false;
            }
        }

        @EventHandler
        public void onHit (EntityDamageByEntityEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                Player p = (Player) e.getDamager();
                Entity pl = e.getEntity();
                if (Var.playing.contains(p)) {
                    for (Player all : Bukkit.getServer().getOnlinePlayers())
                        ;
                    if (Var.blue.contains(p) && Var.blue.contains(pl)) {
                        e.setCancelled(true);
                    } else if (Var.red.contains(p) && Var.red.contains(pl)) {
                        e.setCancelled(true);
                    } else if (Var.green.contains(p) && Var.green.contains(pl)) {
                        e.setCancelled(true);
                    } else if (Var.yellow.contains(p) && Var.yellow.contains(pl)) {
                        e.setCancelled(true);
                    }
                } else {

                    e.setCancelled(true);
                }
            }else{

            }
        }

        @EventHandler
        public void onDrop (PlayerDropItemEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                Player p = e.getPlayer();
                if (Var.playing.contains(p)) {
                    if (Var.plays.contains(p)) {
                        e.setCancelled(true);
                    } else {

                    }
                } else {

                }
            }else{

            }
        }

        @EventHandler
        public void onpickup (PlayerPickupItemEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                Player p = e.getPlayer();
                if (Var.playing.contains(p)) {
                    if (Var.plays.contains(p)) {
                        e.setCancelled(true);
                    } else {

                    }
                } else {

                }
            }else{

            }
        }

        @EventHandler
        public void onblock (BlockBreakEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                if (EndCountdown.nobuild == true) {
                    e.setCancelled(true);
                }
            }else{

            }
        }

        @EventHandler
        public void onblock2 (BlockPlaceEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                if (EndCountdown.nobuild == true) {
                    e.setCancelled(true);
                }
            }else{

            }
        }

        @EventHandler
        public void onDamager (EntityDamageByEntityEvent e){
            if (Settings.cfg.getBoolean("Edit_Mode") == false) {
                Player p = (Player) e.getDamager();
                Entity entity = e.getEntity();
                if (entity.getType() == EntityType.VILLAGER) {
                    e.setCancelled(true);
                } else {

                }
            }else{

            }
        }


}
