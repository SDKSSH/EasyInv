package me.sdkssh.easyinv.api;

import lombok.Getter;
import me.sdkssh.easyinv.api.items.GuiItem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public abstract class EasyInventory {
    @Getter
    private int rows;
    @Getter
    private String inventoryName;
    @Getter
    private Inventory inventory;
    @Getter
    private Map<Integer, GuiItem> items;

    public EasyInventory(String name, int rows){
        this.inventoryName = name;
        this.rows = rows;
        this.items = new HashMap<>();
    }

    public abstract void onOpen(Player player);

    public abstract void onClose(Player player);

    public abstract void onUpdate(Player player);

    public void open(Player p){
        this.inventory = Bukkit.createInventory(null, rows*9, inventoryName);
    }
}
