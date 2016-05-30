package net.thevoidmc.ula.pgui;

import net.minecraft.server.v1_8_R3.Item;
import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Skull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by Ula on 5/30/16.
 */
public class gui implements Listener {

    Main plugin;

    public gui(Main plugin){
        this.plugin = plugin;
    }


    String Prefix = "§4§lPUNISH §2§l> ";


    public static void PunishG(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "§e§lPunish   §4§l<PLAYER>");//ToDo Get Player from the command

        ItemStack Cancel = new ItemStack(Material.BARRIER);
        ItemMeta CancelMeta = Cancel.getItemMeta();
        CancelMeta.setDisplayName("§4§lCancel");
        Cancel.setItemMeta(CancelMeta);

        ItemStack PlayerP = new ItemStack(397, 1, (short) 3);
        SkullMeta PlayerPMeta = (SkullMeta) PlayerP.getItemMeta();
        PlayerPMeta.setDisplayName("§4§l<PLAYER>");//ToDo Get Player from the command
        PlayerPMeta.setOwner(p.getName());//ToDo Get Player from the command
        PlayerP.setItemMeta(PlayerPMeta);

        ItemStack tempMute = new ItemStack(Material.LAPIS_BLOCK);
        ItemMeta tempMuteMeta = tempMute.getItemMeta();
        tempMuteMeta.setDisplayName("§2§lTemp Mute a player");
        tempMute.setItemMeta(tempMuteMeta);

        ItemStack oneDayTempMute = new ItemStack(351, 1, (short) 4);
        ItemMeta oneDayTempMuteMeta = oneDayTempMute.getItemMeta();
        oneDayTempMuteMeta.setDisplayName("§2Temp Mute a player for §e1 §2day");
        oneDayTempMute.setItemMeta(oneDayTempMuteMeta);

        ItemStack FiveDayTempMute = new ItemStack(351, 1, (short) 4);
        ItemMeta FiveDayTempMuteMeta = FiveDayTempMute.getItemMeta();
        FiveDayTempMuteMeta.setDisplayName("§2Temp Mute a player for §e5 §2day(s)");
        FiveDayTempMute.setItemMeta(FiveDayTempMuteMeta);

        ItemStack TenDayTempMute = new ItemStack(351, 1, (short) 4);
        ItemMeta TenDayTempMuteMeta = TenDayTempMute.getItemMeta();
        TenDayTempMuteMeta.setDisplayName("§2Temp Mute a player for §e10 §2day(s)");
        TenDayTempMute.setItemMeta(TenDayTempMuteMeta);

        ItemStack ThirtyDayTempMute = new ItemStack(351, 1, (short) 4);
        ItemMeta ThirtyDayTempMuteMeta = ThirtyDayTempMute.getItemMeta();
        ThirtyDayTempMuteMeta.setDisplayName("§2Temp Mute a player for §e30 §2day(s)");
        ThirtyDayTempMute.setItemMeta(ThirtyDayTempMuteMeta);

        ItemStack tempBan = new ItemStack(Material.REDSTONE_BLOCK);
        ItemMeta tempBanMeta = tempBan.getItemMeta();
        tempBanMeta.setDisplayName("§2§lTemp ban a player");
        tempBan.setItemMeta(tempBanMeta);

        ItemStack oneDayTempBan = new ItemStack(Material.REDSTONE);
        ItemMeta oneDayBanTempMeta = oneDayTempBan.getItemMeta();
        oneDayBanTempMeta.setDisplayName("§2Temp Ban a player for §e1 §2day(s)");
        oneDayTempBan.setItemMeta(oneDayBanTempMeta);

        ItemStack FiveDayTempBan = new ItemStack(Material.REDSTONE);
        ItemMeta FiveDayBanTempMeta = FiveDayTempBan.getItemMeta();
        FiveDayBanTempMeta.setDisplayName("§2Temp Ban a player for §e5 §2day(s)");
        FiveDayTempBan.setItemMeta(FiveDayBanTempMeta);

        ItemStack TenDayTempBan = new ItemStack(Material.REDSTONE);
        ItemMeta TenDayTempBanMeta = TenDayTempBan.getItemMeta();
        TenDayTempBanMeta.setDisplayName("§2Temp Ban a player for §e10 §2day(s)");
        TenDayTempBan.setItemMeta(TenDayTempBanMeta);

        ItemStack ThirtyDayTempBan = new ItemStack(Material.REDSTONE);
        ItemMeta ThirtyDayTempBanMeta = ThirtyDayTempBan.getItemMeta();
        ThirtyDayTempBanMeta.setDisplayName("§2Temp Ban a player for §e30 §2day(s)");
        ThirtyDayTempBan.setItemMeta(ThirtyDayTempBanMeta);

        ItemStack PermMute = new ItemStack(Material.QUARTZ);
        ItemMeta PermMuteMeta = PermMute.getItemMeta();
        PermMuteMeta.setDisplayName("§2Perm Mute");
        PermMute.setItemMeta(PermMuteMeta);

        ItemStack PermBan = new ItemStack(Material.QUARTZ);
        ItemMeta PermBanMeta = PermMute.getItemMeta();
        PermBanMeta.setDisplayName("§2Perm Ban");
        PermBan.setItemMeta(PermBanMeta);

        ItemStack PHistory = new ItemStack(Material.BOOK_AND_QUILL);
        ItemMeta PHistoryMeta = PHistory.getItemMeta();
        PHistoryMeta.setDisplayName("§fPlayer's History");
        PHistory.setItemMeta(PHistoryMeta);


        inv.setItem(0, Cancel);
        inv.setItem(8, PlayerP);


        inv.setItem(10, tempMute);
        inv.setItem(19, oneDayTempMute);
        inv.setItem(28, FiveDayTempMute);
        inv.setItem(37, TenDayTempMute);
        inv.setItem(46, ThirtyDayTempMute);

        inv.setItem(12, tempBan);
        inv.setItem(21, oneDayTempBan);
        inv.setItem(30, FiveDayTempBan);
        inv.setItem(39, TenDayTempBan);
        inv.setItem(48, ThirtyDayTempBan);

        inv.setItem(14, PermMute);
        inv.setItem(23, PermBan);

        inv.setItem(53, PHistory);

        p.openInventory(inv);
    }




    @EventHandler
    public void PunishMenu(InventoryClickEvent event) {
        Player p = (Player) event.getWhoClicked();
        if (event.getInventory().getName() != "§e§lPunish   §4§l<PLAYER>") {
            return;
        }

        if(event.getCurrentItem()==null || event.getCurrentItem().getType()==Material.AIR||!event.getCurrentItem().hasItemMeta()){
            return;
        }

        if (event.getCurrentItem().getItemMeta().getDisplayName().contains("§4§lCancel")) {
            event.setCancelled(true);
            p.getPlayer().playSound(p.getPlayer().getLocation(), Sound.ENDERDRAGON_GROWL, 4F, 4F);
            p.closeInventory();
            p.sendMessage(Prefix + "§f§lCanceled the Punishment for " + "§4§l<PLAYER>");
        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§4§l<PLAYER")){
            event.setCancelled(true);
        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2§lTemp Mute a player")){
            event.setCancelled(true);
        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Mute a player for §e1 §2day")){
            event.setCancelled(true);
            //ToDo add Mute Command for 1 day
            p.sendMessage(Prefix + "§2Temp Mute §f<PLAYER> §2for §e1 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);
        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Mute a player for §e5 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Mute Command for 5 days
            p.sendMessage(Prefix + "§2Temp Mute §f<PLAYER> §2for §e5 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);


        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Mute a player for §e10 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Mute Command for 10 days
            p.sendMessage(Prefix + "§2Temp Mute §f<PLAYER> §2for §e10 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Mute a player for §e30 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Mute Command for 30 days
            p.sendMessage(Prefix + "§2Temp Mute §f<PLAYER> §2for §e30 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }


        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Ban a player for §e1 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Ban Command for 1 days
            p.sendMessage(Prefix + "§2Temp Ban §f<PLAYER> §2for §e1 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Ban a player for §e5 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Ban Command for 5 days
            p.sendMessage(Prefix + "§2Temp Ban §f<PLAYER> §2for §e5 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Ban a player for §e10 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Ban Command for 10 days
            p.sendMessage(Prefix + "§2Temp Ban §f<PLAYER> §2for §e10 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);


        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Temp Ban a player for §e30 §2day(s)")){
            event.setCancelled(true);
            //ToDo add Ban Command for 30 days
            p.sendMessage(Prefix + "§2Temp Ban §f<PLAYER> §2for §e30 §2day");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Perm Mute")){
            event.setCancelled(true);
            //ToDo add Ban Command for 30 days
            p.sendMessage(Prefix + "§2Perm Mute §f<PLAYER>");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);


        }
        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§2Perm Ban")){
            event.setCancelled(true);
            //ToDo add Ban Command for 30 days
            p.sendMessage(Prefix + "§2Perm Ban §f<PLAYER>");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }

        if(event.getCurrentItem().getItemMeta().getDisplayName().contains("§fPlayer's History")){
            event.setCancelled(true);
            //ToDo add Ban Command for 30 days
            p.sendMessage(Prefix + "§2Players History");
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 0.5F, 0.5F);

        }

    }



}
