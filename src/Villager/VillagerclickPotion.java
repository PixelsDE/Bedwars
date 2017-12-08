package Villager;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import Bedwars.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.Potion;


//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /

public class VillagerclickPotion implements Listener {

    private static Main plugin;

    public VillagerclickPotion(Main plugin) {
        this.plugin = plugin;
    }

    public static org.bukkit.inventory.Inventory invPotion = Bukkit.createInventory(null, 9 * 4, "§6Potions");

    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();

        if (i.getName().equalsIgnoreCase("§6Shop")){
            e.setCancelled(true);
            p.updateInventory();
            if (e.getCurrentItem().hasItemMeta()) {
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Potions")) {
                    e.setCancelled(true);
                    p.updateInventory();

                    ItemStack i1 = new ItemStack(Material.POTION);
                    ItemMeta im = i1.getItemMeta();
                    im.setDisplayName("§6Speed Potion");
                    i1.setItemMeta(im);
                    invPotion.setItem(11, i1);

                    ItemStack ii1 = new ItemStack(Material.POTION);
                    ItemMeta iim1 = ii1.getItemMeta();
                    iim1.setDisplayName("§6Regeneration Potion");
                    ii1.setItemMeta(iim1);
                    invPotion.setItem(13, ii1);


                    ItemStack ii2 = new ItemStack(Material.POTION);
                    ItemMeta iim2 = ii2.getItemMeta();
                    iim2.setDisplayName("§6Strengh Potion");
                    ii2.setItemMeta(iim2);
                    invPotion.setItem(15, ii2);


                    ItemStack ii211be = new ItemStack(Material.DIAMOND, 10);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii211be.setItemMeta(iim211be);
                    invPotion.setItem(20, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.EMERALD, 5);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii2111be.setItemMeta(iim2111be);
                    invPotion.setItem(22, ii2111be);

                    ItemStack ii212be = new ItemStack(Material.EMERALD, 20);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii212be.setItemMeta(iim212be);
                    invPotion.setItem(24, ii212be);

                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invPotion.setItem(9, a);
                    invPotion.setItem(17, a);
                    invPotion.setItem(18, a);
                    invPotion.setItem(26, a);
                    invPotion.setItem(10, a);
                    invPotion.setItem(12, a);
                    invPotion.setItem(14, a);
                    invPotion.setItem(16, a);
                    invPotion.setItem(19, a);
                    invPotion.setItem(21, a);
                    invPotion.setItem(23, a);
                    invPotion.setItem(25, a);
                    invPotion.setItem(26, a);
                    for (int o = 0; o <9; o++ ) {
                        invPotion.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invPotion.setItem(o, a);
                    }
                    p.openInventory(invPotion);
                } else {

                }
            }else{

            }
            }else{

            }
    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory().getName().equalsIgnoreCase("§6Potions")) {
            e.setCancelled(true);
            Player p = (Player) e.getWhoClicked();
            p.updateInventory();
        } else {

        }


    }
}

