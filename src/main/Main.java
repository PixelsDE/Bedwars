package main;


import util.Autoupdater;
import util.Scoreboard;
import villager.Buy.*;
import villager.*;
import commands.*;
import gamestates.GameState;
import gamestates.GameStateHandler;
import listeners.*;
import util.methods.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public static Main getPlugin() {
        return plugin;
    }

    public void onEnable() {
        Messages.setMessages();
        Bed.setbed();

        Bukkit.getServer().setSpawnRadius(0);


        if (Settings.cfg.getBoolean("Edit_Mode") == true) {
            Bukkit.getConsoleSender().sendMessage("§cThe Server is in EditMode!");
        } else {

        }
        Settings.settings();
        plugin = this;
        init();


        new Autoupdater(this).checkUpdate("41971");
        new GameStateHandler();


        GameStateHandler.setGameState(GameState.LOBBY_STATE);
        Bukkit.getConsoleSender().sendMessage("§a-> §b[main] §aBedwars has been enabled!");
    }

    public void onDisable() {
        if (Settings.cfg.getBoolean("Edit_Mode") == true)
            Bukkit.getConsoleSender().sendMessage("§a-> §b[main] §cEditmode is still ON!");
        Settings.cfg.set("Edit_Mode", false);
        Settings.editmode = false;

        Bukkit.getConsoleSender().sendMessage("§a-> §b[main] §cBedwars has been disabled!");

    }

    private void init() {

        this.getCommand("start").setExecutor(new CMDstart());
        this.getCommand("setvillager").setExecutor(new CMDsetVillager());
        this.getCommand("setgold").setExecutor(new CMDgold(this));
        this.getCommand("setdiamond").setExecutor(new CMDdiamond(this));
        this.getCommand("setemerald").setExecutor(new CMDemerald(this));
        this.getCommand("setlobby").setExecutor(new CMDsetLobby());
        this.getCommand("setspectator").setExecutor(new CMDsetSpectator());
        this.getCommand("setspawn").setExecutor(new CMDsetspawn(this));
        this.getCommand("leave").setExecutor(new CMDleave());
        this.getCommand("setbed").setExecutor(new CMDsetbed(this));
        this.getCommand("setspawn").setExecutor(new CMDsetspawn(this));


        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new EVENTjoin(this), this);

        pm.registerEvents(new EVENTquit(), this);
        pm.registerEvents(new EVENTteam(), this);
        pm.registerEvents(new VillagerclickMain(this), this);
        pm.registerEvents(new Scoreboard(this), this);
        pm.registerEvents(new EVENTchat(this), this);
        pm.registerEvents(new EVENTBett(this), this);
        pm.registerEvents(new VillagerclickBlocks(this), this);
        pm.registerEvents(new VillagerclickArmor(this), this);
        pm.registerEvents(new VillagerclickWork(this), this);
        pm.registerEvents(new VillagerclickSword(this), this);
        pm.registerEvents(new VillagerclickBow(this), this);
        pm.registerEvents(new VillagerclickFood(this), this);
        pm.registerEvents(new VillagerclickChest(this), this);
        pm.registerEvents(new VillagerclickPotion(this), this);
        pm.registerEvents(new VillagerclickSpecial(this), this);
        pm.registerEvents(new BuyBlocks(), this);
        pm.registerEvents(new BuyArmor(), this);
        pm.registerEvents(new BuySword(), this);
        pm.registerEvents(new BuyTools(), this);
        pm.registerEvents(new BuyBow(), this);
        pm.registerEvents(new BuySpecial(), this);
        pm.registerEvents(new BuyChests(), this);
        pm.registerEvents(new BuyPotion(), this);
        pm.registerEvents(new BuyFood(), this);
        pm.registerEvents(new EVENTmap(), this);
        pm.registerEvents(new EVENTkill(this), this);
        pm.registerEvents(new EVENTworkbench(), this);
        pm.registerEvents(new Spectator(), this);

    }
}


