package listeners;
// Made by PixelsDE /
// Minecraft-Developer /
// Copyright PixelsDE /
// youtube.com/bypixels /

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EVENTworkbench implements Listener{

    @EventHandler
    public void onCraft(PlayerInteractEvent e){
        try {
            Block b = e.getClickedBlock();
            if (b.getType().equals(Material.WORKBENCH)){
                e.setCancelled(true);
            }else if (b.getType().equals(Material.ANVIL)){
                e.setCancelled(true);
            }else{

            }
        } catch (Exception e1) {

        }
    }


}
