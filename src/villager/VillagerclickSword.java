package villager;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import main.Main;
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

public class VillagerclickSword implements Listener {

    public static org.bukkit.inventory.Inventory invSword = Bukkit.createInventory(null, 9 * 4, "§6Swords");
    private static Main plugin;

    public VillagerclickSword(Main plugin) {
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
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Swords")) {
                e.setCancelled(true);
                p.updateInventory();

                ItemStack i1 = new ItemStack(Material.STICK, 1);
                ItemMeta im = i1.getItemMeta();
                im.addEnchant(Enchantment.KNOCKBACK, 1, true);
                im.setDisplayName("§6Stick LV. 1");
                i1.setItemMeta(im);
                invSword.setItem(10, i1);

                ItemStack ii1 = new ItemStack(Material.STICK);
                ItemMeta iim1 = ii1.getItemMeta();
                iim1.addEnchant(Enchantment.KNOCKBACK, 2, true);
                iim1.setDisplayName("§6Stick LV. 2");
                ii1.setItemMeta(iim1);
                invSword.setItem(11, ii1);

                ItemStack ii2 = new ItemStack(Material.STICK);
                ItemMeta iim2 = ii2.getItemMeta();
                iim2.addEnchant(Enchantment.KNOCKBACK, 3, true);
                iim2.setDisplayName("§6Stick LV. 3");
                ii2.setItemMeta(iim2);
                invSword.setItem(12, ii2);

                ItemStack i3 = new ItemStack(Material.GOLD_SWORD);
                ItemMeta im3 = i3.getItemMeta();
                im3.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
                im3.setDisplayName("§6Sword LV. 1");
                i3.setItemMeta(im3);
                invSword.setItem(13, i3);

                ItemStack ii11 = new ItemStack(Material.GOLD_SWORD);
                ItemMeta iim11 = ii11.getItemMeta();
                iim11.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
                iim11.setDisplayName("§6Sword LV. 2");
                ii11.setItemMeta(iim11);
                invSword.setItem(14, ii11);

                ItemStack ii21b = new ItemStack(Material.IRON_SWORD);
                ItemMeta iim21b = ii21b.getItemMeta();
                iim21b.setDisplayName("§6Sword Lv. 3");
                iim21b.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
                iim21b.addEnchant(Enchantment.KNOCKBACK, 1, true);
                ii21b.setItemMeta(iim21b);
                invSword.setItem(15, ii21b);


                ItemStack ii11d = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta iim11d = ii11d.getItemMeta();
                iim11d.setDisplayName("§6Sword Lv. 4");
                iim11d.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
                iim11d.addEnchant(Enchantment.KNOCKBACK, 1, true);
                ii11d.setItemMeta(iim11d);
                invSword.setItem(16, ii11d);


                ItemStack ii21be = new ItemStack(Material.GOLD_INGOT, 5);
                ItemMeta iim21be = ii21be.getItemMeta();
                im.setDisplayName("§6Gold");
                ii21be.setItemMeta(iim21be);
                invSword.setItem(19, ii21be);

                ItemStack ii211be = new ItemStack(Material.GOLD_INGOT, 10);
                ItemMeta iim211be = ii211be.getItemMeta();
                im.setDisplayName("§6Gold");
                ii211be.setItemMeta(iim211be);
                invSword.setItem(20, ii211be);

                ItemStack ii2111be = new ItemStack(Material.GOLD_INGOT, 15);
                ItemMeta iim2111be = ii2111be.getItemMeta();
                im.setDisplayName("§6Gold");
                ii2111be.setItemMeta(iim2111be);
                invSword.setItem(21, ii2111be);

                ItemStack ii212be = new ItemStack(Material.DIAMOND, 1);
                ItemMeta iim212be = ii212be.getItemMeta();
                im.setDisplayName("§6Gold");
                ii212be.setItemMeta(iim212be);
                invSword.setItem(22, ii212be);

                ItemStack ii213be = new ItemStack(Material.DIAMOND, 3);
                ItemMeta iim213be = ii213be.getItemMeta();
                im.setDisplayName("§bDiamond");
                ii213be.setItemMeta(iim213be);
                invSword.setItem(23, ii213be);

                ItemStack ii214be = new ItemStack(Material.EMERALD, 5);
                ItemMeta iim214be = ii214be.getItemMeta();
                im.setDisplayName("§aEmerald");
                ii214be.setItemMeta(iim21be);
                invSword.setItem(24, ii214be);

                ItemStack ii216be = new ItemStack(Material.EMERALD, 8);
                ItemMeta iim216be = ii216be.getItemMeta();
                im.setDisplayName("§aEmerald");
                ii216be.setItemMeta(iim216be);
                invSword.setItem(25, ii216be);

                ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                ItemMeta aa = a.getItemMeta();
                im.setDisplayName("");
                a.setItemMeta(aa);
                invSword.setItem(9, a);
                invSword.setItem(17, a);
                invSword.setItem(18, a);
                invSword.setItem(26, a);
                for (int o = 0; o < 9; o++) {
                    invSword.setItem(o, a);
                }
                for (int o = 27; o < 36; o++) {
                    invSword.setItem(o, a);
                }
                p.openInventory(invSword);
            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getClickedInventory().getName().equalsIgnoreCase("§6Swords")) {
            Player p = (Player) e.getWhoClicked();
            e.setCancelled(true);

            p.updateInventory();
        }
    }


}

