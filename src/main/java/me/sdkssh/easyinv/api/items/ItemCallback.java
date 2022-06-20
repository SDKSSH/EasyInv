package me.sdkssh.easyinv.api.items;

import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class ItemCallback {
    public abstract void onExecute(Player p, Inventory inv, ItemStack itemStack, Action action);
    
}
