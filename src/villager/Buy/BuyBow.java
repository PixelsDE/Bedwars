package villager.Buy;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import util.methods.Messages;
import util.methods.Settings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuyBow implements Listener {

    @EventHandler
    public void onBuy(InventoryClickEvent e) {
        YamlConfiguration cfg = Messages.cfg;
        String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("No_Material"));
        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
        Player p = (Player) e.getWhoClicked();
        ItemStack i = e.getCurrentItem();


        org.bukkit.inventory.Inventory inv = e.getClickedInventory();
        if (e.getClickedInventory().getName() != null) {
            if (inv.getName().equalsIgnoreCase("§6Bows")) {
                e.setCancelled(true);
                p.updateInventory();

                if (i.getType().equals(Material.BOW)) {
                    if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§6Bow LV. 1")) {
                        if (p.getInventory().contains(Material.EMERALD, 4)) {
                            ItemStack item = new ItemStack(Material.EMERALD, 4);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§aEmerald");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        } else {
                            p.sendMessage(prefix + msg);
                        }
                    } else if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§§Bow LV. 2")) {
                        if (p.getInventory().contains(Material.EMERALD, 8)) {
                            ItemStack item = new ItemStack(Material.EMERALD, 8);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§aEmerald");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        } else {
                            p.sendMessage(prefix + msg);
                        }

                    } else if (i.getItemMeta().getDisplayName().equalsIgnoreCase("§6Bow LV. 3")) {

                        if (p.getInventory().contains(Material.EMERALD, 12)) {
                            ItemStack item = new ItemStack(Material.EMERALD, 12);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§aEmerald");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        } else {
                            p.sendMessage(prefix + msg);
                        }

                    }
                } else if (i.getType().equals(Material.ARROW)) {

                    if (p.getInventory().contains(Material.DIAMOND, 1)) {
                        ItemStack item = new ItemStack(Material.DIAMOND, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName("§bDiamond");
                        item.setItemMeta(meta);
                        p.getInventory().removeItem(item);
                        p.getInventory().addItem(i);
                        p.updateInventory();

                    } else {
                        p.sendMessage(prefix + msg);
                    }


                } else {


                }

            } else {

            }

        }else{

        }
    }


}



