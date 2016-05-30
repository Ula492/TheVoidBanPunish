package net.thevoidmc.ula;

import net.thevoidmc.ula.pgui.gui;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ula on 5/30/16.
 */
public class Main extends JavaPlugin implements Listener {

    private static Plugin plugin;

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable(){
        plugin = this;
        instance = this;

        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new gui(this), this);
    }

    @Override
    public void onDisable(){



    }







    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player) sender;

            if(cmd.getName().equalsIgnoreCase("punish")){
                if(!sender.hasPermission("p.use")){
                    p.sendMessage("§5THIS COMMAND REQUIRES RANK §f[§8TRAINEE]");
                }
                gui.PunishG(p);
            }
        }    return false;
    }






}
