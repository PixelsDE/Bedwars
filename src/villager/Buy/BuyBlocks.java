package villager.Buy;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import util.methods.Messages;
import util.methods.Settings;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuyBlocks implements Listener {

    @EventHandler
    public void onBuy(InventoryClickEvent e) {
        YamlConfiguration cfg = Messages.cfg;
        String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("No_Material"));
        String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
        Player p = (Player) e.getWhoClicked();
        ItemStack i = e.getCurrentItem();

        org.bukkit.inventory.Inventory inv = e.getClickedInventory();
        if (e.getClickedInventory().getName() != null) {
            if (inv.getName().equalsIgnoreCase("§6Blocks")) {
                e.setCancelled(true);
                p.updateInventory();

                if (i.getType().equals(Material.SANDSTONE)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 1)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64)) {
                                p.getInventory().addItem(new ItemStack(Material.SANDSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }
                } else if (i.getType().equals(Material.ENDER_STONE)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 7)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 7)) {
                                p.getInventory().addItem(new ItemStack(Material.ENDER_STONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 7);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 7);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }

                } else if (i.getType().equals(Material.GLOWSTONE)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 10)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 10)) {
                                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 10);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 10);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }

                } else if (i.getType().equals(Material.GLASS)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 15)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 15)) {
                                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 15);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 15);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }

                } else if (i.getType().equals(Material.WOOD)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 25)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 25)) {
                                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 25);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 25);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }

                } else if (i.getType().equals(Material.WOOL)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 25)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 25)) {
                                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 25);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 25);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }

                } else if (i.getType().equals(Material.IRON_BLOCK)) {
                    if (p.getInventory().contains(Material.GOLD_INGOT, 25)) {
                        if (e.isShiftClick()) {
                            if (p.getInventory().contains(Material.GOLD_INGOT, 64 * 25)) {
                                p.getInventory().addItem(new ItemStack(Material.GLOWSTONE, 64));
                                ItemStack item = new ItemStack(Material.GOLD_INGOT, 64 * 25);
                                ItemMeta meta = item.getItemMeta();
                                meta.setDisplayName("§6Gold");
                                item.setItemMeta(meta);
                                p.getInventory().removeItem(item);
                                p.getInventory().addItem(i);
                                p.updateInventory();
                            } else {

                                p.sendMessage(prefix + msg);
                            }
                        } else {
                            ItemStack item = new ItemStack(Material.GOLD_INGOT, 25);
                            ItemMeta meta = item.getItemMeta();
                            meta.setDisplayName("§6Gold");
                            item.setItemMeta(meta);
                            p.getInventory().removeItem(item);
                            p.getInventory().addItem(i);
                            p.updateInventory();
                        }
                    } else {
                        p.sendMessage(prefix + msg);
                    }
                } else {

                }
            } else {

            }

        }else{

        }
    }


}
