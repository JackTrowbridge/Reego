package org.reego.reego;

import org.bukkit.plugin.java.JavaPlugin;

public final class Reego extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Enabling the main plugin...");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("Disabling the main plugin...");
    }
    
}
