package me.sdkssh.easyinv.api;

import lombok.Getter;

public abstract class EasyInventory {
    @Getter
    private int rows;
    @Getter
    private String inventoryName;

    public EasyInventory(String name, int rows){
        this.inventoryName = name;
        this.rows = rows;
    }
}
