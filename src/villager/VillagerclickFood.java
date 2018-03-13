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

public class VillagerclickFood implements Listener {

    private static Main plugin;

    public VillagerclickFood(Main plugin) {
        this.plugin = plugin;
    }

    public static org.bukkit.inventory.Inventory invFood = Bukkit.createInventory(null, 9 * 4, "§6Food");
    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();


            if (i.getName().equalsIgnoreCase("§6Shop")){
                e.setCancelled(true);
                p.updateInventory();
                if (e.getCurrentItem().hasItemMeta()) {

                    if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Food")) {

                        e.setCancelled(true);
                        p.updateInventory();
                        ItemStack i1 = new ItemStack(Material.APPLE, 1);
                        ItemMeta im = i1.getItemMeta();
                        i1.setItemMeta(im);
                        invFood.setItem(11, i1);

                        ItemStack ii1 = new ItemStack(Material.COOKED_BEEF);
                        ItemMeta iim1 = ii1.getItemMeta();
                        ii1.setItemMeta(iim1);
                        invFood.setItem(13, ii1);

                        ItemStack ii2 = new ItemStack(Material.GOLDEN_APPLE);
                        ItemMeta iim2 = ii2.getItemMeta();
                        ii2.setItemMeta(iim2);
                        invFood.setItem(15, ii2);


                        ItemStack ii211be = new ItemStack(Material.GOLD_INGOT, 1);
                        ItemMeta iim211be = ii211be.getItemMeta();
                        im.setDisplayName("§6Gold");
                        ii211be.setItemMeta(iim211be);
                        invFood.setItem(20, ii211be);

                        ItemStack ii2111be = new ItemStack(Material.GOLD_INGOT, 3);
                        ItemMeta iim2111be = ii2111be.getItemMeta();
                        im.setDisplayName("§6Gold");
                        ii2111be.setItemMeta(iim2111be);
                        invFood.setItem(22, ii2111be);

                        ItemStack ii212be = new ItemStack(Material.EMERALD, 1);
                        ItemMeta iim212be = ii212be.getItemMeta();
                        im.setDisplayName("§aEmerald");
                        ii212be.setItemMeta(iim212be);
                        invFood.setItem(24, ii212be);

                        ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                        ItemMeta aa = a.getItemMeta();
                        im.setDisplayName("");
                        a.setItemMeta(aa);
                        invFood.setItem(9, a);
                        invFood.setItem(17, a);
                        invFood.setItem(18, a);
                        invFood.setItem(26, a);
                        invFood.setItem(10, a);
                        invFood.setItem(12, a);
                        invFood.setItem(14, a);
                        invFood.setItem(16, a);
                        invFood.setItem(19, a);
                        invFood.setItem(21, a);
                        invFood.setItem(23, a);
                        invFood.setItem(25, a);
                        invFood.setItem(26, a);
                        for (int o = 0; o <9; o++ ) {
                            invFood.setItem(o, a);
                        }
                        for (int o = 27; o < 36; o++ ) {
                            invFood.setItem(o, a);
                        }
                        p.openInventory(invFood);
                    } else {

                    }
                }
                }

    }


    @EventHandler
    public void onClick(InventoryClickEvent e) {

            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Food")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            }else{

            }

    }


}

