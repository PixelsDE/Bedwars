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

public class VillagerclickArmor implements Listener {

    public static org.bukkit.inventory.Inventory invArmor = Bukkit.createInventory(null, 9 * 4, "§6Armor");
    private static Main plugin;

    public VillagerclickArmor(Main plugin) {
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
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Armor")) {
                    e.setCancelled(true);
                    p.updateInventory();

                    ItemStack i1 = new ItemStack(Material.LEATHER_BOOTS, 1);
                    ItemMeta im = i1.getItemMeta();
                    im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                    i1.setItemMeta(im);
                    invArmor.setItem(10, i1);

                    ItemStack ii1 = new ItemStack(Material.LEATHER_LEGGINGS);
                    ItemMeta iim1 = ii1.getItemMeta();
                    iim1.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                    ii1.setItemMeta(iim1);
                    invArmor.setItem(11, ii1);

                    ItemStack ii2 = new ItemStack(Material.LEATHER_HELMET);
                    ItemMeta iim2 = ii2.getItemMeta();
                    iim2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                    ii2.setItemMeta(iim2);
                    invArmor.setItem(12, ii2);

                    ItemStack i3 = new ItemStack(Material.LEATHER_CHESTPLATE);
                    ItemMeta im3 = i3.getItemMeta();
                    im3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                    im3.setDisplayName("§6Chestplate LV. 1");
                    i3.setItemMeta(im3);
                    invArmor.setItem(13, i3);

                    ItemStack ii11 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                    ItemMeta iim11 = ii11.getItemMeta();
                    iim11.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
                    iim11.setDisplayName("§6Chestplate LV. 2");
                    ii11.setItemMeta(iim11);
                    invArmor.setItem(14, ii11);

                    ItemStack ii21b = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                    ItemMeta iim21b = ii21b.getItemMeta();
                    iim21b.setDisplayName("§6Chestplate Lv. 3");
                    iim21b.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
                    ii21b.setItemMeta(iim21b);
                    invArmor.setItem(15, ii21b);


                    ItemStack ii11d = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                    ItemMeta iim11d = ii11d.getItemMeta();
                    iim11d.setDisplayName("§6Chestplate Lv. 4");
                    iim11d.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
                    ii11d.setItemMeta(iim11d);
                    invArmor.setItem(16, ii11d);


                    ItemStack ii21be = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta iim21be = ii21be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii21be.setItemMeta(iim21be);
                    invArmor.setItem(19, ii21be);

                    ItemStack ii211be = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii211be.setItemMeta(iim211be);
                    invArmor.setItem(20, ii211be);
                    ItemStack ii2111be = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii2111be.setItemMeta(iim2111be);
                    invArmor.setItem(21, ii21be);

                    ItemStack ii212be = new ItemStack(Material.GOLD_INGOT, 1);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii212be.setItemMeta(iim212be);
                    invArmor.setItem(22, ii212be);

                    ItemStack ii213be = new ItemStack(Material.DIAMOND);
                    ItemMeta iim213be = ii213be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii213be.setItemMeta(iim213be);
                    invArmor.setItem(23, ii213be);

                    ItemStack ii214be = new ItemStack(Material.DIAMOND, 3);
                    ItemMeta iim214be = ii214be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii214be.setItemMeta(iim21be);
                    invArmor.setItem(24, ii214be);

                    ItemStack ii216be = new ItemStack(Material.DIAMOND, 7);
                    ItemMeta iim216be = ii216be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii216be.setItemMeta(iim216be);
                    invArmor.setItem(25, ii216be);


                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invArmor.setItem(9, a);
                    invArmor.setItem(17, a);
                    invArmor.setItem(18, a);
                    invArmor.setItem(26, a);
                    for (int o = 0; o <9; o++ ) {
                        invArmor.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invArmor.setItem(o, a);
                    }
                    p.openInventory(invArmor);
                } else {

                }
            }else{

            }

    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {

            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Armor")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            } else {

            }

    }


}

