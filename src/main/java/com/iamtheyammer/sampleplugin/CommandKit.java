package com.iamtheyammer.sampleplugin;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {
            commandSender.sendMessage("You must be a player to execute this command.");
            return false;
        }

        Player player = (Player) commandSender;


        ItemStack stones = new ItemStack(Material.STONE, 20);
        ItemStack diamonds = new ItemStack(Material.DIAMOND, 10);

        player.getInventory().addItem(stones, diamonds);

        return true;
    }
}
