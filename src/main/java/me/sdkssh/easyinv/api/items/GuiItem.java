package me.sdkssh.easyinv.api.items;

import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@Getter
public class GuiItem {
    private ItemCallback callback;
    private ItemStack itemStack;

    public GuiItem(ItemStack it){
        this.itemStack = it;
        this.callback = null;
    }

    public void setCallBack(ItemCallback callback) {
        this.callback = callback;
    }
}
