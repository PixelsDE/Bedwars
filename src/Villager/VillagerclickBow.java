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

public class VillagerclickBow implements Listener {

    private static Main plugin;

    public VillagerclickBow(Main plugin) {
        this.plugin = plugin;
    }

    public static org.bukkit.inventory.Inventory invBow = Bukkit.createInventory(null, 9 * 4, "§6Bows");
    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();

            if (i.getName().equalsIgnoreCase("§6Shop")){

                e.setCancelled(true);
                p.updateInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Bows")) {

                    e.setCancelled(true);
                    p.updateInventory();
                    ItemStack i1 = new ItemStack(Material.BOW, 1);
                    ItemMeta im = i1.getItemMeta();
                    im.setDisplayName("§6Bow LV. 1");
                    i1.setItemMeta(im);
                    invBow.setItem(10, i1);

                    ItemStack ii1 = new ItemStack(Material.BOW);
                    ItemMeta iim1 = ii1.getItemMeta();
                    iim1.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
                    iim1.setDisplayName("§6Bow LV. 2");
                    ii1.setItemMeta(iim1);
                    invBow.setItem(12, ii1);

                    ItemStack ii2 = new ItemStack(Material.BOW);
                    ItemMeta iim2 = ii2.getItemMeta();
                    iim2.setDisplayName("§6Bow LV. 3");
                    iim2.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
                    iim2.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
                    ii2.setItemMeta(iim2);
                    invBow.setItem(14, ii2);

                    ItemStack ii21be = new ItemStack(Material.ARROW);
                    ItemMeta iim21be = ii21be.getItemMeta();
                    ii21be.setItemMeta(iim21be);
                    invBow.setItem(16, ii21be);

                    ItemStack ii211be = new ItemStack(Material.EMERALD, 4);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    iim211be.setDisplayName("§aEmerald");
                    ii211be.setItemMeta(iim211be);
                    invBow.setItem(19, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.EMERALD, 8);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    iim2111be.setDisplayName("§aEmerald");
                    ii2111be.setItemMeta(iim2111be);
                    invBow.setItem(21, ii2111be);

                    ItemStack ii212be = new ItemStack(Material.EMERALD, 12);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§aEmerald");
                    ii212be.setItemMeta(iim212be);
                    invBow.setItem(23, ii212be);

                    ItemStack ii212be1 = new ItemStack(Material.DIAMOND, 2);
                    ItemMeta iim212be1 = ii212be1.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii212be1.setItemMeta(iim212be1);
                    invBow.setItem(25, ii212be1);

                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invBow.setItem(9, a);
                    invBow.setItem(17, a);
                    invBow.setItem(18, a);
                    invBow.setItem(26, a);
                    invBow.setItem(11, a);
                    invBow.setItem(13, a);
                    invBow.setItem(15, a);
                    invBow.setItem(20, a);
                    invBow.setItem(22, a);
                    invBow.setItem(24, a);
                    for (int o = 0; o <9; o++ ) {
                        invBow.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invBow.setItem(o, a);
                    }

                    p.openInventory(invBow);
                }else {


                }
                }

    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {

            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Bows")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            }else{

            }

    }


}

