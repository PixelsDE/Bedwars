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



//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /

public class VillagerclickSpecial implements Listener {

    private static Main plugin;

    public VillagerclickSpecial(Main plugin) {
        this.plugin = plugin;
    }

    public static org.bukkit.inventory.Inventory invSpecial = Bukkit.createInventory(null, 9 * 4, "§6Special");
    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();

        if (i.getName().equalsIgnoreCase("§6Shop")){
            e.setCancelled(true);
            p.updateInventory();
            if (e.getCurrentItem().hasItemMeta()) {
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Special")) {

                    e.setCancelled(true);
                    p.updateInventory();
                    ItemStack i1 = new ItemStack(Material.WEB, 1);
                    ItemMeta im = i1.getItemMeta();
                    i1.setItemMeta(im);
                    invSpecial.setItem(11, i1);

                    ItemStack ii1 = new ItemStack(Material.FISHING_ROD);
                    ItemMeta iim1 = ii1.getItemMeta();
                    ii1.setItemMeta(iim1);
                    invSpecial.setItem(12, ii1);

                    ItemStack ii2 = new ItemStack(Material.TNT);
                    ItemMeta iim2 = ii2.getItemMeta();
                    ii2.setItemMeta(iim2);
                    invSpecial.setItem(13, ii2);

                    ItemStack ii21be = new ItemStack(Material.FLINT_AND_STEEL);
                    ItemMeta iim21be = ii21be.getItemMeta();
                    ii21be.setItemMeta(iim21be);
                    invSpecial.setItem(14, ii21be);

                    ItemStack ii21bea = new ItemStack(Material.ENDER_PEARL);
                    ItemMeta iim21bea = ii21bea.getItemMeta();
                    ii21bea.setItemMeta(iim21bea);
                    invSpecial.setItem(15, ii21bea);

                    ItemStack ii211be = new ItemStack(Material.GOLD_INGOT, 16);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    iim211be.setDisplayName("§6Gold");
                    ii211be.setItemMeta(iim211be);
                    invSpecial.setItem(20, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.DIAMOND, 10);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    iim2111be.setDisplayName("§bDiamond");
                    ii2111be.setItemMeta(iim2111be);
                    invSpecial.setItem(21, ii2111be);

                    ItemStack ii212be = new ItemStack(Material.EMERALD, 5);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii212be.setItemMeta(iim212be);
                    invSpecial.setItem(22, ii212be);

                    ItemStack ii212be1 = new ItemStack(Material.EMERALD, 1);
                    ItemMeta iim212be1 = ii212be1.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii212be1.setItemMeta(iim212be1);
                    invSpecial.setItem(23, ii212be1);

                    ItemStack ii212be1b = new ItemStack(Material.EMERALD, 15);
                    ItemMeta iim212be1b = ii212be1b.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii212be1b.setItemMeta(iim212be1b);
                    invSpecial.setItem(24, ii212be1b);

                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invSpecial.setItem(9, a);
                    invSpecial.setItem(17, a);
                    invSpecial.setItem(18, a);
                    invSpecial.setItem(26, a);
                    invSpecial.setItem(10, a);
                    invSpecial.setItem(16, a);
                    invSpecial.setItem(19, a);
                    invSpecial.setItem(25, a);

                    for (int o = 0; o <9; o++ ) {
                        invSpecial.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invSpecial.setItem(o, a);
                    }

                    p.openInventory(invSpecial);
                } else {

                }
                }
            }else{

            }
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory().getName().equalsIgnoreCase("§6Special")) {

            e.setCancelled(true);
            Player p = (Player) e.getWhoClicked();
            p.updateInventory();
        }else{

        }
    }


}

