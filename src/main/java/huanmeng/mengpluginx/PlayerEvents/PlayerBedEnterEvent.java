package huanmeng.mengpluginx.PlayerEvents;

import huanmeng.mengpluginx.MengPluginX;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class PlayerBedEnterEvent implements Listener {
    Plugin plugin = huanmeng.mengpluginx.MengPluginX.getPlugin(huanmeng.mengpluginx.MengPluginX.class);
    @EventHandler
    public void PlayerBedEnterEvent(org.bukkit.event.player.PlayerBedEnterEvent bedEvent){
        Player sleep = bedEvent.getPlayer();
        if(bedEvent.getBedEnterResult() == org.bukkit.event.player.PlayerBedEnterEvent.BedEnterResult.OK) {
            sleep.sendMessage(ChatColor.YELLOW + plugin.getConfig().getString("Characters") + ChatColor.WHITE + plugin.getConfig().getString("Sleep"));
        }
    }
}
