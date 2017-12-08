package Villager;

import Bedwars.Main;
import methods.Settings;
import methods.Var;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class VillagerclickMain implements Listener {

    private static Main plugin;

    public VillagerclickMain(Main plugin) {
        VillagerclickMain.plugin = plugin;
    }
    public static org.bukkit.inventory.Inventory invMain = Bukkit.createInventory(null, 9*3, "§6Shop");
    @Deprecated
    @EventHandler
    public void onInteract(final PlayerInteractEntityEvent e) {

        if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            EntityType entity = EntityType.VILLAGER;
            if (e.getRightClicked().getType() == EntityType.VILLAGER) {
                Player p = e.getPlayer();
                if (Var.playing.contains(p)) {
                    Villager v = (Villager) e.getRightClicked();

                    p.closeInventory();
                    if (v.getCustomName().equalsIgnoreCase("§6Shop")) {
                        e.setCancelled(true);
                        p.updateInventory();
                        ItemStack i = new ItemStack(Material.SANDSTONE);
                        ItemMeta im = i.getItemMeta();
                        im.setDisplayName("§7Blocks");
                        i.setItemMeta(im);
                        invMain.setItem(9, i);
                        ItemStack ii1 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
                        ItemMeta iim1 = ii1.getItemMeta();
                        iim1.setDisplayName("§7Armor");
                        ii1.setItemMeta(iim1);
                        invMain.setItem(10, ii1);
                        ItemStack ii2 = new ItemStack(Material.STONE_PICKAXE);
                        ItemMeta iim2 = ii2.getItemMeta();
                        iim2.setDisplayName("§7Tools");
                        ii2.setItemMeta(iim2);
                        invMain.setItem(11, ii2);
                        ItemStack i3 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta im3 = i3.getItemMeta();
                        im3.setDisplayName("§7Swords");
                        i3.setItemMeta(im3);
                        invMain.setItem(12, i3);
                        ItemStack ii11 = new ItemStack(Material.BOW);
                        ItemMeta iim11 = ii11.getItemMeta();
                        iim11.setDisplayName("§7Bows");
                        ii11.setItemMeta(iim11);
                        invMain.setItem(13, ii11);
                        ItemStack ii21b = new ItemStack(Material.APPLE);
                        ItemMeta iim21b = ii21b.getItemMeta();
                        iim21b.setDisplayName("§7Food");
                        ii21b.setItemMeta(iim21b);
                        invMain.setItem(14, ii21b);
                        ItemStack i3c = new ItemStack(Material.CHEST);
                        ItemMeta im3c = i3c.getItemMeta();
                        im3c.setDisplayName("§7Chests");
                        i3c.setItemMeta(im3c);
                        invMain.setItem(15, i3c);
                        ItemStack ii11d = new ItemStack(Material.POTION);
                        ItemMeta iim11d = ii11d.getItemMeta();
                        iim11d.setDisplayName("§7Potions");
                        ii11d.setItemMeta(iim11d);
                        invMain.setItem(16, ii11d);
                        ItemStack ii21be = new ItemStack(Material.TNT);
                        ItemMeta iim21be = ii21be.getItemMeta();
                        iim21be.setDisplayName("§7Special");
                        ii21be.setItemMeta(iim21be);
                        invMain.setItem(17, ii21be);
                        ItemStack a = new ItemStack(Material.STAINED_GLASS_PANE);
                        ItemMeta aa = a.getItemMeta();
                        im.setDisplayName("");
                        a.setItemMeta(aa);

                        for (int o = 0; o <9; o++ ) {
                            invMain.setItem(o, a);
                        }
                        for (int o = 18; o < 27; o++ ) {
                            invMain.setItem(o, a);
                        }

                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
                            @Override
                            public void run() {
                                p.openInventory(invMain);
                                p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1, 1);
                            }

                        }, 1);


                    } else {

                    }
                } else {
                    e.setCancelled(true);
                }
            } else {

            }

        }else{

        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (Settings.cfg.getBoolean("Edit_Mode") == false) {
            if (e.getClickedInventory().getName().equalsIgnoreCase("§6Shop")) {
                e.setCancelled(true);
                Player p = (Player) e.getWhoClicked();
                p.updateInventory();
            } else {

            }
        }else {

        }

    }

}
