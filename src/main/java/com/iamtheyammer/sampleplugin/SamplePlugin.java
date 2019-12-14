package com.iamtheyammer.sampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class SamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable has been called");

        this.getCommand("yammer").setExecutor(new CommandKit());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been called");
    }
}
