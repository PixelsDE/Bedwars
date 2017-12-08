package Villager;

import Bedwars.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class VillagerclickBlocks implements Listener {

    private static Main plugin;

    public VillagerclickBlocks(Main plugin) {
        VillagerclickBlocks.plugin = plugin;
    }

    public static org.bukkit.inventory.Inventory invBlocks = Bukkit.createInventory(null, 9 * 4, "§6Blocks");


    @Deprecated
    @EventHandler
    public void onInteract(final InventoryClickEvent e) {

        Inventory i = e.getClickedInventory();
        Player p = (Player) e.getWhoClicked();


            if (i.getName().equalsIgnoreCase("§6Shop")){

                e.setCancelled(true);
                p.updateInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Blocks")) {
                    e.setCancelled(true);
                    p.updateInventory();
                    ItemStack i1 = new ItemStack(Material.SANDSTONE, 2);
                    ItemMeta im = i1.getItemMeta();
                    i1.setItemMeta(im);
                    invBlocks.setItem(10, i1);

                    ItemStack ii1 = new ItemStack(Material.ENDER_STONE);
                    ItemMeta iim1 = ii1.getItemMeta();
                    ii1.setItemMeta(iim1);
                    invBlocks.setItem(11, ii1);

                    ItemStack ii2 = new ItemStack(Material.GLOWSTONE);
                    ItemMeta iim2 = ii2.getItemMeta();
                    ii2.setItemMeta(iim2);
                    invBlocks.setItem(12, ii2);

                    ItemStack i3 = new ItemStack(Material.GLASS);
                    ItemMeta im3 = i3.getItemMeta();
                    i3.setItemMeta(im3);
                    invBlocks.setItem(13, i3);

                    ItemStack ii11 = new ItemStack(Material.WOOD);
                    ItemMeta iim11 = ii11.getItemMeta();
                    ii11.setItemMeta(iim11);
                    invBlocks.setItem(14, ii11);

                    ItemStack ii21b = new ItemStack(Material.WOOL);
                    ItemMeta iim21b = ii21b.getItemMeta();
                    ii21b.setItemMeta(iim21b);
                    invBlocks.setItem(15, ii21b);


                    ItemStack ii11d = new ItemStack(Material.IRON_BLOCK);
                    ItemMeta iim11d = ii11d.getItemMeta();
                    ii11d.setItemMeta(iim11d);
                    invBlocks.setItem(16, ii11d);


                    ItemStack ii21be = new ItemStack(Material.GOLD_INGOT);
                    ItemMeta iim21be = ii21be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii21be.setItemMeta(iim21be);
                    invBlocks.setItem(19, ii21be);

                    ItemStack ii211be = new ItemStack(Material.GOLD_INGOT, 7);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii211be.setItemMeta(iim211be);
                    invBlocks.setItem(20, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.GOLD_INGOT, 10);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii2111be.setItemMeta(iim2111be);
                    invBlocks.setItem(21, ii2111be);

                    ItemStack ii212be = new ItemStack(Material.GOLD_INGOT, 15);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii212be.setItemMeta(iim212be);
                    invBlocks.setItem(22, ii212be);

                    ItemStack ii213be = new ItemStack(Material.GOLD_INGOT, 25);
                    ItemMeta iim213be = ii213be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii213be.setItemMeta(iim213be);
                    invBlocks.setItem(23, ii213be);

                    ItemStack ii214be = new ItemStack(Material.GOLD_INGOT, 25);
                    ItemMeta iim214be = ii214be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii214be.setItemMeta(iim21be);
                    invBlocks.setItem(24, ii214be);

                    ItemStack ii216be = new ItemStack(Material.GOLD_INGOT, 25);
                    ItemMeta iim216be = ii216be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii216be.setItemMeta(iim216be);
                    invBlocks.setItem(25, ii216be);


                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invBlocks.setItem(9, a);
                    invBlocks.setItem(17, a);
                    invBlocks.setItem(18, a);
                    invBlocks.setItem(26, a);
                    for (int o = 0; o <9; o++ ) {
                        invBlocks.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invBlocks.setItem(o, a);
                    }

                    p.openInventory(invBlocks);
                }else {

                }
                }else{

            }

    }



    @EventHandler
    public void onClick(InventoryClickEvent e) {

            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Blocks")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            }else{

            }

    }


}
