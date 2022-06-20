package me.sdkssh.easyinv.api;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class EasyInventory {
    @Getter
    private int rows;
    @Getter
    private String inventoryName;
    @Getter
    private Inventory inventory;

    public EasyInventory(String name, int rows){
        this.inventoryName = name;
        this.rows = rows;
    }

    public abstract void onOpen(Player player);

    public abstract void onClose(Player player);

    public abstract void onUpdate(Player player);
}
