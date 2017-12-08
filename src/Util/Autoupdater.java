
package Util;


import Bedwars.Main;
import methods.Messages;
import methods.Settings;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Autoupdater {

    private static Main plugin;
    public Autoupdater(Main plugin){

        Autoupdater.plugin = plugin;

    }

    public void checkUpdate(String resourceId) {
        YamlConfiguration cfg1 = Settings.cfg;
        Boolean ja = Settings.cfg.getBoolean("Autoupdate");
        if (ja == true) {
            try {
                HttpURLConnection con = (HttpURLConnection) new URL("http://www.spigotmc.org/api/general.php")
                        .openConnection();
                con.setDoOutput(true);
                con.setRequestMethod("POST");
                con.getOutputStream().write(("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=" + resourceId)
                        .getBytes("UTF-8"));
                String version = new BufferedReader(new java.io.InputStreamReader(con.getInputStream())).readLine();
                if (!version.equals(Main.getPlugin().getDescription().getVersion())) {
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Autoupdate"));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.getConsoleSender().sendMessage(prefix + msg);
                } else {
                    YamlConfiguration cfg = Messages.cfg;
                    String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Update_True"));
                    String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                    Bukkit.getConsoleSender().sendMessage(prefix + msg);
                }
            } catch (Exception ex) {
                YamlConfiguration cfg = Messages.cfg;
                String msg = ChatColor.translateAlternateColorCodes('&', cfg.getString("Update_Error"));
                String prefix = ChatColor.translateAlternateColorCodes('&', Settings.cfg.getString("Prefix"));
                Bukkit.getConsoleSender().sendMessage(prefix + msg);
            }
        }else{

        }

    }


}
