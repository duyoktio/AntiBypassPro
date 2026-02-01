package me.antibypass;

import org.bukkit.plugin.java.JavaPlugin;

public final class AntiBypassPro extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("AntiBypassPro enabled (1.21 Pufferfish)");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiBypassPro disabled");
    }
}
