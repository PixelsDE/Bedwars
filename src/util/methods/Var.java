package util.methods;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class Var {


    public static ArrayList<Player> playing = new ArrayList<>();
    public static ArrayList<Player> spectating = new ArrayList<>();
    public static ArrayList<Player> blue = new ArrayList<>();
    public static ArrayList<Player> green = new ArrayList<>();
    public static ArrayList<Player> yellow = new ArrayList<>();
    public static ArrayList<Player> red = new ArrayList<>();
    public static File cfgFile = new File("plugins/main/administration/config.yml");
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(cfgFile);






    public static boolean bed_yellow = true;
    public static boolean bed_blue = true;
    public static boolean bed_green = true;
    public static boolean bed_red = true;

    public static ArrayList<Player> plays = new ArrayList<>();


}


