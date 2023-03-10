package huanmeng.mengpluginx;

import huanmeng.mengpluginx.Commands.*;
import huanmeng.mengpluginx.PlayerEvents.*;
import huanmeng.mengpluginx.PlaceholderAPI.*;
import huanmeng.mengpluginx.Worlds.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class MengPluginX extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件正在加载");

        //getConfig().options().copyDefaults();

        saveDefaultConfig();
        saveResource("keyWords.yml", false);

        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedEnterEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeaveEvent(),this);
        getServer().getPluginManager().registerEvents(new DirtyWords(),this);
        getServer().getPluginManager().registerEvents(new StemWords(),this);

        Objects.requireNonNull(getCommand("mpx")).setExecutor(new MengPluginXCommands());
        Objects.requireNonNull(getCommand("gm0")).setExecutor(new Gamemode());
        Objects.requireNonNull(getCommand("gm1")).setExecutor(new Gamemode());
        Objects.requireNonNull(getCommand("gm2")).setExecutor(new Gamemode());
        Objects.requireNonNull(getCommand("gm3")).setExecutor(new Gamemode());
        Objects.requireNonNull(getCommand("tps")).setExecutor(new GetServerTPS());
        Objects.requireNonNull(getCommand("ping")).setExecutor(new GetPlayerPing());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件正在关闭");
    }
}
