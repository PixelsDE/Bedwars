package util.methods;
//Code by: PixelsDE

import main.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages {

    private static Main plugin;

    public Messages(Main plugin) {
        Messages.plugin = plugin;
    }

    public static File File = new File("plugins/main/messages.yml");
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(File);

    public static void setMessages() {

        cfg.addDefault("Game_Start", "&aDas Spiel hat nun begonnen!");
        cfg.addDefault("Must_Player", "&cYou must be a Player to do that!");
        cfg.addDefault("Game_End", "&cDas Spiel ist beendet!");
        cfg.addDefault("Game_Restart", "&7Der Server startet in &6%seconds% Sekunden &7neu!");
        cfg.addDefault("Game_Timer", "&7Das Spiel startet in &6%seconds% &7Sekunden");
        cfg.addDefault("Missing_Player", "&7Zum Spielstart fehlen(fehlt) noch&c %missing% &7Spieler.");
        cfg.addDefault("Win_Green", "&aDas Spiel ist vorbei das Team &aGruen &ahat gewonnen");
        cfg.addDefault("Win_Red", "&aDas Spiel ist vorbei das Team &cRot &ahat gewonnen");
        cfg.addDefault("Win_Blue", "&aDas Spiel ist vorbei das Team &9Blau &ahat gewonnen");
        cfg.addDefault("Win_Yellow", "&aDas Spiel ist vorbei das Team &eGelb &ahat gewonnen");
        cfg.addDefault("Ingame_Respawn", "&aDu konntest Respawnen da dein Bett noch da ist!");
        cfg.addDefault("Ingame_Out", "&cDu bist raus da dein Bett kaputt ist!");
        cfg.addDefault("Left_Green", "&cDas Team Gruen hat noch &6%size% &cSpieler!");
        cfg.addDefault("Left_Blue", "&cDas Team Blau hat noch &6%size% &cSpieler!");
        cfg.addDefault("Left_Red", "&cDas Team Rot hat noch &6%size% &cSpieler!");
        cfg.addDefault("Left_Yellow", "&cDas Team Gelb hat noch &6%size% &cSpieler!");
        cfg.addDefault("Game_Join", "&7Der Spieler %player% &7ist beigetreten! [&n %playing% / %max_players%]");
        cfg.addDefault("Game_Notbuild", "&cDu kannst in der Lobby nicht bauen!");
        cfg.addDefault("Game_Notdefined", "&cDas Game wurde noch nicht definiert!");
        cfg.addDefault("Game_Nothit", "&cDu kannst wärend der Lobbyphase keinen Schlagen!");
        cfg.addDefault("Game_Quit", "&7Der Spieler &c%player% &7hat das Spiel verlassen! [&n %playing% / %max_players%]");
        cfg.addDefault("Ingame_Quit", "&7Der Spieler &c%player% &7hat das Spiel verlassen!");
        cfg.addDefault("Team_Choose", "&cBitte wähle ein Team!");
        cfg.addDefault("Team_Full", "&cDas Team ist bereits voll!");
        cfg.addDefault("Team_Blue", "&7Du bist nun in Team &9Blau&7!");
        cfg.addDefault("Team_Red", "&7Du bist nun in Team &cRot&7!");
        cfg.addDefault("Team_Yellow", "&7Du bist nun in Team &eGelb&7!");
        cfg.addDefault("Team_Green", "&7Du bist nun in Team &aGruen&7!");
        cfg.addDefault("Start_Use", "&cBitte benutze /start!");
        cfg.addDefault("Start_Used", "&aDer Spielstart wurde beschleunigt!");
        cfg.addDefault("Start_Lobby", "&cDu kannst den Countdown nur in der Lobby uwberspringen!");
        cfg.addDefault("Noperm", "&cDazu hast du keine Rechte!");
        cfg.addDefault("Setvillager", "&aDu hast den villager gesetzt!");
        cfg.addDefault("Setspectator", "&aDer Spawn für die Spectator wurde gesetzt!");
        cfg.addDefault("Setlobby", "&aDer Spawn für die Lobby wurde gesetzt!");
        cfg.addDefault("SetGold", "&aDu hast den Spawn &e%int% &afür &6Gold &agesetzt!");
        cfg.addDefault("SetDiamond", "&aDu hast den Spawn &e%int% &afür &bDiamond &agesetzt!");
        cfg.addDefault("SetEmerald", "&aDu hast den Spawn &e%int% &afür &aEmerald &agesetzt!");
        cfg.addDefault("SetSpawns", "&aDer Teamspawn für Team &6%team% &awurde gesetzt!");
        cfg.addDefault("Kickmessage", "&cDas Spiel ist beendet!");
        cfg.addDefault("Deathmessage", "&fDer Spieler %player% &fist gestorben!");
        cfg.addDefault("Already_Team", "&cDu bist bereits in diesem Team!");
        cfg.addDefault("Autoupdate", "&cDas Plugin hat eine neue Version!");
        cfg.addDefault("Update_Error", "&cKonnte nicht nach Updates gucken!");
        cfg.addDefault("Update_True", "&aDas Plugin ist Aktuell!");
        cfg.addDefault("Death_Message", "&fDer Spieler %player% wurde von %killer% umgebracht!");
        cfg.addDefault("SetBed", "&aDas Bett für Team &6%team% &awurde gesetzt!");
        cfg.addDefault("Break_Yellow", "&fDas Bett von Team &aGelb &fwurde von %player% &fkaputt gemacht!");
        cfg.addDefault("Break_Green", "&fDas Bett von Team &eGruen &fwurde von %player% &fkaputt gemacht!");
        cfg.addDefault("Break_Red", "&fDas Bett von Team &cRot &fwurde von %player% &fkaputt gemacht!");
        cfg.addDefault("Break_Blue", "&fDas Bett von Team &9Blau &fwurde von %player% &fkaputt gemacht!");
        cfg.addDefault("Break_Team", "&cDas Bett von deinem Team wurde zerstört! Du respawnst nicht mehr!");
        cfg.addDefault("Break_Own", "&cDu kannst dein eigenes Bett nicht zerstören!");
        cfg.addDefault("No_Material", "&cDu hast nicht genuegend Resourcen!");
        cfg.addDefault("Map_Break", "&cDu kannst den Block &6%block% &cnicht abbauen!");
        cfg.addDefault("Not_Enoght", "&7To start the Game we need: &c%missing%&7 more Player!");
        cfg.addDefault("Vote_Yes", "&7You voted for &aYes&7!");
        cfg.addDefault("Vote_No", "&7You voted for &cNo&7!");
        try {
            cfg.options().copyDefaults(true);
            cfg.save(File);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
