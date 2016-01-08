package net.sacredlabyrinth.phaed.dynmap.simpleclans;

import com.p000ison.dev.simpleclans2.clanplayer.ClanPlayer;
import net.sacredlabyrinth.phaed.dynmap.simpleclans.entries.KillEntry;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.server.PluginEnableEvent;

public class DynmapSimpleClansListener implements Listener
{
    private DynmapSimpleClans plugin;

    public DynmapSimpleClansListener()
    {
        plugin = DynmapSimpleClans.getInstance();
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPluginEnable(PluginEnableEvent event)
    {
        String name = event.getPlugin().getDescription().getName();

        if (name.equals("dynmap") || name.equals("SimpleClans"))
        {
            plugin.activate();
        }
    }
}
