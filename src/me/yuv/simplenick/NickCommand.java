package me.yuv.simplenick;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (cmd.getName().equalsIgnoreCase("nick")) {
				if (player.hasPermission("simplenick.use")) {
					if (args.length == 0) {
						player.sendMessage(ChatColor.RED + "[Nick] Unable to nick! Please add a nickname after that to get nicked!");
						return true;
					} else { 
						String nick = args[0];
						player.setDisplayName(nick);
						player.setPlayerListName(nick);
						player.sendMessage(ChatColor.GREEN + "[Nick] Your nickname has been changed!");
						return true;
					}
				} else {
					sender.sendMessage(ChatColor.RED + "[Nick] You do not have permission to do that!");
					return true;
				}
			}
		} 
		else {
			sender.sendMessage(ChatColor.RED + "Only players can use this command!");
			return true;
		}
		return false;
	}
}