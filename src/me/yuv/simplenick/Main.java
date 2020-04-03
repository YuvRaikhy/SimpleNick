package me.yuv.simplenick;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Nick v 1.0 by BokuWaLdesu(Yuvzz) is enabled!");
		getCommand("nick").setExecutor(new NickCommand());
		getCommand("unnick").setExecutor(new UnnickCommand());
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Nick v 1.0 by BokuWaLdesu(Yuvzz) is disabled!"); 
	}


}
