package me.yuv.simplenick;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnnickCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			String name = player.getName();
			
			if (cmd.getName().equalsIgnoreCase("unnick")) {
				if (player.hasPermission("simplenick.unnick")) {
					player.setDisplayName(name);
					player.setPlayerListName(name);
					player.sendMessage(ChatColor.GREEN + "[Nick] Your nickname has been removed!");
					return true;
				} else {
					sender.sendMessage(ChatColor.RED + "[Nick] You do not have permission to do that!");
					return true;
				}
			}
		} else {
			sender.sendMessage(ChatColor.RED + "Only players can use this command");
			return true;
		}
		return false;
	}

}
