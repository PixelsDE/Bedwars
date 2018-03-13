package villager;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /

public class VillagerclickChest implements Listener {

    public static org.bukkit.inventory.Inventory invChests = Bukkit.createInventory(null, 9 * 4, "§6Chests");
    private static Main plugin;

    public VillagerclickChest(Main plugin) {
        this.plugin = plugin;
    }

    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();

            if (i.getName().equalsIgnoreCase("§6Shop")) {
                e.setCancelled(true);
                p.updateInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Chests")) {
                    e.setCancelled(true);
                    p.updateInventory();

                    ItemStack i1 = new ItemStack(Material.CHEST, 1);
                    ItemMeta im = i1.getItemMeta();
                    i1.setItemMeta(im);
                    invChests.setItem(11, i1);

                    ItemStack ii1 = new ItemStack(Material.ENDER_CHEST);
                    ItemMeta iim1 = ii1.getItemMeta();
                    ii1.setItemMeta(iim1);
                    invChests.setItem(14, ii1);

                    ItemStack ii211be = new ItemStack(Material.DIAMOND, 1);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii211be.setItemMeta(iim211be);
                    invChests.setItem(20, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.EMERALD, 1);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii2111be.setItemMeta(iim2111be);
                    invChests.setItem(23, ii2111be);
                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invChests.setItem(9, a);
                    invChests.setItem(17, a);
                    invChests.setItem(18, a);
                    invChests.setItem(26, a);
                    invChests.setItem(10, a);
                    invChests.setItem(12, a);
                    invChests.setItem(13, a);
                    invChests.setItem(15, a);
                    invChests.setItem(16, a);
                    invChests.setItem(19, a);
                    invChests.setItem(21, a);
                    invChests.setItem(22, a);
                    invChests.setItem(24, a);
                    invChests.setItem(25, a);
                    invChests.setItem(26, a);
                    for (int o = 0; o <9; o++ ) {
                        invChests.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invChests.setItem(o, a);
                    }
                    p.openInventory(invChests);
                } else {

                }
            }


    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {

            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Chests")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            }else {

            }

    }


}

