package me.Ken980.data;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;

public class main extends JavaPlugin{
    
    private static void getData(Player p){
        p.sendMessage("--------------------------");
        p.sendMessage("Name: " + p.getName());
        p.sendMessage("Display Name: " + p.getDisplayName());
        p.sendMessage("Custom Name: " + p.getCustomName());
        p.sendMessage("Id: " + p.getEntityId());
        p.sendMessage("Ip: " + p.getAddress());
        p.sendMessage("Gamemode: " + p.getGameMode());
        p.sendMessage("Health: " + p.getHealth() + "/20");
        p.sendMessage("Hunger: " + p.getFoodLevel() + "/20");
        p.sendMessage("Level: " + p.getLevel());
        p.sendMessage("--------------------------");
    }
    
     @Override
    public void onEnable(){
        Bukkit.getServer().getLogger().info("[Data]-This plugin has been enable");
    }
    
    @Override
    public void onDisable(){
        Bukkit.getServer().getLogger().info("[Data]-This plugin has been Disable");
    }
    
    
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        
        if(cmd.getName().equalsIgnoreCase("data") && sender.isOp()){
            
            if(args.length==0 && sender instanceof Player){
                
            Player p = (Player) sender;
            
            main.getData(p);
            
            return true;
            }
        
            Player target = Bukkit.getPlayerExact(args[0]);
            
            main.getData(target);
            
        return true;
        }
    return true;
    }
}
