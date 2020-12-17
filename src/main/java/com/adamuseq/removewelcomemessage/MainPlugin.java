package com.adamuseq.removewelcomemessage;

import org.bukkit.plugin.java.JavaPlugin;
import com.adamuseq.removewelcomemessage.listeners.player.PlayerJoinQuitListener;

public class MainPlugin extends JavaPlugin {

    private static MainPlugin instance;

    @Override
    public void onEnable() {
        new PlayerJoinQuitListener(this);
    }

}
