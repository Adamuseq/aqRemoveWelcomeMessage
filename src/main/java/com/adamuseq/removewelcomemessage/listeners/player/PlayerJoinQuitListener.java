package com.adamuseq.removewelcomemessage.listeners.player;

import com.adamuseq.removewelcomemessage.MainPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import com.adamuseq.removewelcomemessage.listeners.CustomListener;

public class PlayerJoinQuitListener extends CustomListener {


    public PlayerJoinQuitListener(Plugin plugin) {
        super(plugin);
    }

    @EventHandler
    public void playerJoinServer(PlayerJoinEvent e) {
            e.setJoinMessage("");

    }

    @EventHandler
    public void playerQuitServer(PlayerQuitEvent e) {
            e.setQuitMessage("");
    }
}
