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

    public class VillagerclickWork implements Listener {
        private static Main plugin;

        public VillagerclickWork(Main plugin) {
            villager.VillagerclickWork.plugin = plugin;
        }

        public static org.bukkit.inventory.Inventory invWork = Bukkit.createInventory(null, 9 * 4, "§6Tools");

        @Deprecated
        @EventHandler
        public void onInteract(final InventoryClickEvent e) {

            Inventory i = e.getClickedInventory();
            Player p = (Player) e.getWhoClicked();

            if (i.getName().equalsIgnoreCase("§6Shop")){
                e.setCancelled(true);
                p.updateInventory();
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7Tools")) {

                    e.setCancelled(true);
                    p.updateInventory();
                    ItemStack i1 = new ItemStack(Material.WOOD_PICKAXE, 1);
                    ItemMeta im = i1.getItemMeta();
                    im.addEnchant(Enchantment.DIG_SPEED, 1, true);
                    im.addEnchant(Enchantment.DURABILITY, 3, true);
                    im.setDisplayName("§6Pickaxe LV. 1");
                    i1.setItemMeta(im);
                    invWork.setItem(10, i1);

                    ItemStack ii1 = new ItemStack(Material.STONE_PICKAXE);
                    ItemMeta iim1 = ii1.getItemMeta();
                    iim1.setDisplayName("§6Pickaxe LV. 2");
                    iim1.addEnchant(Enchantment.DIG_SPEED, 1, true);
                    iim1.addEnchant(Enchantment.DURABILITY, 3, true);
                    ii1.setItemMeta(iim1);
                    invWork.setItem(11, ii1);

                    ItemStack ii2 = new ItemStack(Material.IRON_PICKAXE);
                    ItemMeta iim2 = ii2.getItemMeta();
                    ii2.setItemMeta(iim2);
                    iim2.setDisplayName("§6Pickaxe LV. 3");
                    iim2.addEnchant(Enchantment.DIG_SPEED, 1, true);
                    iim2.addEnchant(Enchantment.DURABILITY, 3, true);
                    invWork.setItem(12, ii2);

                    ItemStack i3 = new ItemStack(Material.IRON_PICKAXE);
                    ItemMeta im3 = i3.getItemMeta();
                    im3.addEnchant(Enchantment.DIG_SPEED, 2, true);
                    im3.addEnchant(Enchantment.DURABILITY, 3, true);
                    im3.setDisplayName("§6Pickaxe LV. 4");
                    i3.setItemMeta(im3);
                    invWork.setItem(13, i3);

                    ItemStack ii11 = new ItemStack(Material.STONE_AXE);
                    ItemMeta iim11 = ii11.getItemMeta();
                    iim11.addEnchant(Enchantment.DIG_SPEED, 1, true);
                    iim11.addEnchant(Enchantment.DURABILITY, 3, true);
                    iim11.setDisplayName("§6Axe LV. 1");
                    ii11.setItemMeta(iim11);
                    invWork.setItem(14, ii11);

                    ItemStack ii21b = new ItemStack(Material.IRON_AXE);
                    ItemMeta iim21b = ii21b.getItemMeta();
                    iim21b.setDisplayName("§6Axe Lv. 2");
                    iim21b.addEnchant(Enchantment.DIG_SPEED, 2, true);
                    iim21b.addEnchant(Enchantment.DURABILITY, 3, true);
                    ii21b.setItemMeta(iim21b);
                    invWork.setItem(15, ii21b);


                    ItemStack ii11d = new ItemStack(Material.SHEARS);
                    ItemMeta iim11d = ii11d.getItemMeta();
                    iim11d.addEnchant(Enchantment.DURABILITY, 3, true);
                    ii11d.setItemMeta(iim11d);
                    invWork.setItem(16, ii11d);


                    ItemStack ii21be = new ItemStack(Material.GOLD_INGOT, 4);
                    ItemMeta iim21be = ii21be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii21be.setItemMeta(iim21be);
                    invWork.setItem(19, ii21be);

                    ItemStack ii211be = new ItemStack(Material.GOLD_INGOT, 8);
                    ItemMeta iim211be = ii211be.getItemMeta();
                    im.setDisplayName("§6Gold");
                    ii211be.setItemMeta(iim211be);
                    invWork.setItem(20, ii211be);

                    ItemStack ii2111be = new ItemStack(Material.DIAMOND, 2);
                    ItemMeta iim2111be = ii2111be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii2111be.setItemMeta(iim2111be);
                    invWork.setItem(21, ii21be);

                    ItemStack ii212be = new ItemStack(Material.DIAMOND, 5);
                    ItemMeta iim212be = ii212be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii212be.setItemMeta(iim212be);
                    invWork.setItem(22, ii212be);

                    ItemStack ii213be = new ItemStack(Material.DIAMOND, 2);
                    ItemMeta iim213be = ii213be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii213be.setItemMeta(iim213be);
                    invWork.setItem(23, ii213be);

                    ItemStack ii214be = new ItemStack(Material.DIAMOND, 5);
                    ItemMeta iim214be = ii214be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii214be.setItemMeta(iim21be);
                    invWork.setItem(24, ii214be);

                    ItemStack ii216be = new ItemStack(Material.DIAMOND, 3);
                    ItemMeta iim216be = ii216be.getItemMeta();
                    im.setDisplayName("§bDiamond");
                    ii216be.setItemMeta(iim216be);
                    invWork.setItem(25, ii216be);


                    ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                    ItemMeta aa = a.getItemMeta();
                    im.setDisplayName("");
                    a.setItemMeta(aa);
                    invWork.setItem(9, a);
                    invWork.setItem(17, a);
                    invWork.setItem(18, a);
                    invWork.setItem(26, a);
                    for (int o = 0; o <9; o++ ) {
                        invWork.setItem(o, a);
                    }
                    for (int o = 27; o < 36; o++ ) {
                        invWork.setItem(o, a);
                    }
                    p.openInventory(invWork);
                }else {

                }
                }
        }


        @EventHandler
        public void onClick(InventoryClickEvent e) {
            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Tools")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            }else{

            }
        }


    }


