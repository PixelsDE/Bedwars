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

public class BuyChests implements Listener {

    @EventHandler
    public void onBuy(InventoryClickEvent e) {
        YamlConfiguration cfg = Messages.cfg;
        String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("No_Material"));
        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
        Player p = (Player) e.getWhoClicked();
        ItemStack i = e.getCurrentItem();

        org.bukkit.inventory.Inventory inv = e.getClickedInventory();
        if (e.getClickedInventory().getName() != null) {
            if (inv.getName().equalsIgnoreCase("§6Chests")) {
                e.setCancelled(true);
                p.updateInventory();

                if (i.getType().equals(Material.CHEST)) {
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
                } else if (i.getType().equals(Material.ENDER_CHEST)) {
                    if (p.getInventory().contains(Material.EMERALD, 1)) {
                        ItemStack item = new ItemStack(Material.EMERALD, 1);
                        ItemMeta meta = item.getItemMeta();
                        meta.setDisplayName("§aEmerald");
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





