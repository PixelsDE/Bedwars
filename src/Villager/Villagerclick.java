package Villager;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import javax.swing.*;

//C ode by: PixelsDE /
// All rights reserved! /
// Website: bypixels.weebly.com /
// Youtube: byPixels /
public class Villagerclick implements Listener{


    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e){
        EntityType entity = EntityType.VILLAGER;
        if (e.getRightClicked().equals(entity)){
            if (entity.getName().equalsIgnoreCase("§6Shop")){

            }
        }

    }


}
