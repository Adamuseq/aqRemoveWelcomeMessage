package com.adamuseq.removewelcomemessage.listeners;


import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class CustomListener implements Listener {
        private final Plugin plugin;
        public CustomListener(final Plugin plugin) {
            this.plugin = plugin;
            this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
        }

        protected Plugin getPlugin() { return plugin; }
    }
    

