package me.sdkssh.easyinv.api.items;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class ItemCallback {
    public abstract void onExecute(Player p, Inventory inv, ItemStack itemStack, InventoryAction action);

    public void execute(InventoryClickEvent e){
        onExecute((Player) e.getWhoClicked(), e.getInventory(), e.getCurrentItem(), e.getAction());
    }
}
