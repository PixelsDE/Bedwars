package listeners;

import util.Scoreboard;
import util.methods.Messages;
import util.methods.Settings;
import util.methods.Var;
import org.bukkit.*;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Wool;

public class EVENTteam implements Listener {

    public static Inventory inv = Bukkit.createInventory(null, 9, "§bTeamselector");

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (Settings.editmode == false) {
            Player p = (Player) e.getWhoClicked();

            if (Var.playing.contains(p)) {
                ItemStack i = new ItemStack(Material.BED);
                ItemMeta im = i.getItemMeta();
                im.setDisplayName("§bTeamselector");
                i.setItemMeta(im);

                if (e.getCurrentItem().hasItemMeta()) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bTeamselector")) {
                        if (Settings.cfg.getBoolean("Teams_2") == false) {

                            Wool wool = new Wool(DyeColor.BLUE);
                            ItemStack ii = wool.toItemStack(1);
                            ItemMeta iim = ii.getItemMeta();
                            iim.setDisplayName("§9Team Blau");
                            ii.setItemMeta(iim);
                            inv.setItem(1, ii);
                            Wool wool1 = new Wool(DyeColor.RED);
                            ItemStack i1 = wool1.toItemStack(1);
                            ItemMeta im1 = i1.getItemMeta();
                            im1.setDisplayName("§cTeam Rot");
                            i1.setItemMeta(im1);
                            inv.setItem(3, i1);
                            Wool wool11 = new Wool(DyeColor.GREEN);
                            ItemStack i11 = wool11.toItemStack(1);
                            ItemMeta im11 = i11.getItemMeta();
                            im11.setDisplayName("§aTeam Gruen");
                            i11.setItemMeta(im11);
                            inv.setItem(5, i11);
                            Wool wool12 = new Wool(DyeColor.YELLOW);
                            ItemStack i12 = wool12.toItemStack(1);
                            ItemMeta im12 = i12.getItemMeta();
                            im12.setDisplayName("§eTeam Gelb");
                            i12.setItemMeta(im12);
                            inv.setItem(7, i12);
                            p.updateInventory();
                            p.openInventory(inv);
                            e.setCancelled(true);
                            p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
                            Scoreboard.updateScoreboard(p);
                        } else if (Settings.cfg.getBoolean("Teams_2") == true) {

                            e.setCancelled(true);
                            Wool wool = new Wool(DyeColor.BLUE);
                            ItemStack ii = wool.toItemStack(1);
                            ItemMeta iim = ii.getItemMeta();
                            iim.setDisplayName("§9Team Blau");
                            ii.setItemMeta(iim);
                            inv.setItem(2, ii);
                            Wool wool1 = new Wool(DyeColor.RED);
                            ItemStack i1 = wool1.toItemStack(1);
                            ItemMeta im1 = i1.getItemMeta();
                            im1.setDisplayName("§cTeam Rot");
                            i1.setItemMeta(im1);
                            inv.setItem(6, i1);

                            p.updateInventory();
                            p.openInventory(inv);

                            p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
                            Scoreboard.updateScoreboard(p);
                        } else {

                        }
                    }


                    {

                    }
                } else {
                }

            } else {

            }
        }else{

        }
    }

    @EventHandler
    public void onpickup(PlayerDropItemEvent e) {

        Player p = e.getPlayer();
        if (Var.playing.contains(p)) {
            if (Var.plays.contains(p)) {


                try {
                    e.setCancelled(true);
                } catch (Exception e2) {
                    // TODO: handle exception
                }
            } else {

            }
        } else {

        }

    }

    @EventHandler
    public void onUse(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (Var.playing.contains(p)) {
            if (Var.plays.contains(p)) {


                if (p.getItemInHand().getType() == Material.BED) {

                    if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§bTeamselector")) {


                        if (Settings.cfg.getBoolean("Teams_2") == false) {

                            Wool wool = new Wool(DyeColor.BLUE);
                            ItemStack ii = wool.toItemStack(1);
                            ItemMeta iim = ii.getItemMeta();
                            iim.setDisplayName("§9Team Blau");
                            ii.setItemMeta(iim);
                            inv.setItem(1, ii);
                            Wool wool1 = new Wool(DyeColor.RED);
                            ItemStack i1 = wool1.toItemStack(1);
                            ItemMeta im1 = i1.getItemMeta();
                            im1.setDisplayName("§cTeam Rot");
                            i1.setItemMeta(im1);
                            inv.setItem(3, i1);
                            Wool wool11 = new Wool(DyeColor.GREEN);
                            ItemStack i11 = wool11.toItemStack(1);
                            ItemMeta im11 = i11.getItemMeta();
                            im11.setDisplayName("§aTeam Gruen");
                            i11.setItemMeta(im11);
                            inv.setItem(5, i11);
                            Wool wool12 = new Wool(DyeColor.YELLOW);
                            ItemStack i12 = wool12.toItemStack(1);
                            ItemMeta im12 = i12.getItemMeta();
                            im12.setDisplayName("§eTeam Gelb");
                            i12.setItemMeta(im12);
                            inv.setItem(7, i12);
                            p.updateInventory();
                            p.openInventory(inv);
                            e.setCancelled(true);
                            p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
                            Scoreboard.updateScoreboard(p);
                        } else if (Settings.cfg.getBoolean("Teams_2") == true) {

                            e.setCancelled(true);
                            Wool wool = new Wool(DyeColor.BLUE);
                            ItemStack ii = wool.toItemStack(1);
                            ItemMeta iim = ii.getItemMeta();
                            iim.setDisplayName("§9Team Blau");
                            ii.setItemMeta(iim);
                            inv.setItem(2, ii);
                            Wool wool1 = new Wool(DyeColor.RED);
                            ItemStack i1 = wool1.toItemStack(1);
                            ItemMeta im1 = i1.getItemMeta();
                            im1.setDisplayName("§cTeam Rot");
                            i1.setItemMeta(im1);
                            inv.setItem(6, i1);

                            p.updateInventory();
                            p.openInventory(inv);

                            p.playSound(p.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
                            Scoreboard.updateScoreboard(p);
                        } else {

                        }

                    }

                } else {

                }

            } else {

            }

        } else {

        }

    }

    @EventHandler
    public void onTeam(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (Var.playing.contains(p)) {
            if (Var.plays.contains(p)) {


                if (e.getClickedInventory().getName().equalsIgnoreCase("§bTeamselector")) {
                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§9Team Blau")) {
                        if (Var.blue.size() <= Settings.cfg.getInt("Max_Team") - 1) {
                            if (!Var.blue.contains(p)) {

                                try {
                                    e.setCancelled(true);
                                    p.updateInventory();

                                    p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                    Var.blue.add(p);
                                    Var.red.remove(p);
                                    Var.green.remove(p);
                                    Var.yellow.remove(p);
                                    p.setPlayerListName("§9" + p.getName());
                                    p.setCustomName("§9" + p.getName() + "§f");
                                    p.setCustomNameVisible(true);
                                    p.setDisplayName("§9" + p.getName() + "§f");
                                    YamlConfiguration cfg1 = Messages.cfg;
                                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Blue"));
                                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                    p.sendMessage(prefix1 + msg1);
                                    Scoreboard.updateScoreboard(p);

                                } catch (Exception e2) {
                                    // TODO: handle exception
                                }
                            } else {
                                p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Already_Team"));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                p.sendMessage(prefix1 + msg1);
                                Scoreboard.updateScoreboard(p);
                                e.setCancelled(true);

                            }
                        } else {
                            p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                            e.setCancelled(true);
                            YamlConfiguration cfg1 = Messages.cfg;
                            String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Full"));
                            String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                            p.sendMessage(prefix1 + msg1);
                            Scoreboard.updateScoreboard(p);


                        }

                        // TODO: handle exception

                    } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTeam Rot")) {
                        if (Var.red.size() <= Settings.cfg.getInt("Max_Team") - 1) {
                            if (!Var.red.contains(p)) {
                                try {
                                    e.setCancelled(true);
                                    p.updateInventory();
                                    p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                    Var.blue.remove(p);
                                    Var.red.add(p);
                                    Var.green.remove(p);
                                    Var.yellow.remove(p);
                                    p.setPlayerListName("§c" + p.getName());
                                    p.setCustomName("§c" + p.getName() + "§f");
                                    p.setCustomNameVisible(true);
                                    p.setDisplayName("§c" + p.getName() + "§f");
                                    YamlConfiguration cfg1 = Messages.cfg;
                                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Red"));
                                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                    p.sendMessage(prefix1 + msg1);
                                    Scoreboard.updateScoreboard(p);
                                } catch (Exception e2) {
                                    // TODO: handle exception
                                }
                            } else {
                                p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                e.setCancelled(true);
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Already_Team"));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                p.sendMessage(prefix1 + msg1);
                                Scoreboard.updateScoreboard(p);
                            }
                        } else {
                            p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                            e.setCancelled(true);
                            YamlConfiguration cfg1 = Messages.cfg;
                            String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Full"));
                            String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                            p.sendMessage(prefix1 + msg1);
                            Scoreboard.updateScoreboard(p);
                        }

                    } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aTeam Gruen")) {
                        if (Var.green.size() <= Settings.cfg.getInt("Max_Team") - 1) {
                            if (!Var.green.contains(p)) {
                                try {
                                    e.setCancelled(true);
                                    p.updateInventory();
                                    p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                    Var.blue.remove(p);
                                    Var.red.remove(p);
                                    Var.green.add(p);
                                    Var.yellow.remove(p);
                                    p.setPlayerListName("§a" + p.getName());
                                    p.setCustomName("§a" + p.getName() + "§f");
                                    p.setCustomNameVisible(true);
                                    p.setDisplayName("§a" + p.getName() + "§f");

                                    YamlConfiguration cfg1 = Messages.cfg;
                                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Green"));
                                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                    p.sendMessage(prefix1 + msg1);
                                    Scoreboard.updateScoreboard(p);
                                } catch (Exception e2) {
                                    // TODO: handle exception
                                }
                            } else {
                                p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                e.setCancelled(true);
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Already_Team"));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                p.sendMessage(prefix1 + msg1);
                                Scoreboard.updateScoreboard(p);
                            }
                        } else {
                            p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                            e.setCancelled(true);
                            YamlConfiguration cfg1 = Messages.cfg;
                            String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Full"));
                            String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                            p.sendMessage(prefix1 + msg1);
                            Scoreboard.updateScoreboard(p);
                        }

                    } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eTeam Gelb")) {
                        if (Var.yellow.size() <= Settings.cfg.getInt("Max_Team") - 1) {

                            if (!Var.yellow.contains(p)) {
                                try {
                                    e.setCancelled(true);
                                    p.updateInventory();
                                    p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                    Var.blue.remove(p);
                                    Var.red.remove(p);
                                    Var.green.remove(p);
                                    Var.yellow.add(p);
                                    p.setPlayerListName("§e" + p.getName());
                                    p.setCustomName("§e" + p.getName() + "§f");
                                    p.setCustomNameVisible(true);
                                    p.setDisplayName("§e" + p.getName() + "§f");
                                    YamlConfiguration cfg1 = Messages.cfg;
                                    String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Yellow"));
                                    String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                    p.sendMessage(prefix1 + msg1);
                                    Scoreboard.updateScoreboard(p);
                                } catch (Exception e2) {
                                    // TODO: handle exception
                                }
                            } else {
                                p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                                e.setCancelled(true);
                                YamlConfiguration cfg1 = Messages.cfg;
                                String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Already_Team"));
                                String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                                p.sendMessage(prefix1 + msg1);
                                Scoreboard.updateScoreboard(p);
                            }
                        } else {
                            p.playSound(p.getLocation(), Sound.ENTITY_ITEM_PICKUP, 1, 1);
                            e.setCancelled(true);
                            YamlConfiguration cfg1 = Messages.cfg;
                            String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Full"));
                            String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                            p.sendMessage(prefix1 + msg1);
                            Scoreboard.updateScoreboard(p);
                        }

                    } else {
                        p.playSound(p.getLocation(), Sound.ENTITY_BAT_DEATH, 1, 1);
                        e.setCancelled(true);
                        YamlConfiguration cfg1 = Messages.cfg;
                        String msg1 = ChatColor.translateAlternateColorCodes('&', cfg1.getString("Team_Choose"));
                        String prefix1 = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                        p.sendMessage(prefix1 + msg1);
                        p.updateInventory();
                        Scoreboard.updateScoreboard(p);
                    }


                } else {

                }
            } else {

            }

        } else {

        }
    }

}
