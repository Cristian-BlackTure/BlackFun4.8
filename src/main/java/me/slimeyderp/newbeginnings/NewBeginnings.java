package me.slimeyderp.newbeginnings;

import me.mrCookieSlime.Slimefun.Objects.Research;
import me.slimeyderp.newbeginnings.listeners.MainListener;
import me.slimeyderp.newbeginnings.materials.ExtraItemStack;
import me.slimeyderp.newbeginnings.materials.ExtraItems;
import me.slimeyderp.newbeginnings.resources.MythrilResource;
import org.bukkit.Color;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;


public class NewBeginnings extends JavaPlugin implements SlimefunAddon {

    private static NewBeginnings instance;


    @Override
    public void onEnable() {

        instance = this;

        //Registering and giving atributtes to the items.

        registerItems();
        enchantItems();
        registerResearches();

        // Calling the listener to kick into action.
        new MainListener(this);

        //Reporting everything went well. Hooray! :D
        getLogger().info("New-Beginnings has loaded Successfully!");
        getLogger().info("Enjoy the plugin!");
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimeyDerp/New-Begginings/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static NewBeginnings getInstance() {
        return instance;
    }

    // Registers all resources into SF Guide and the Geo-Miner.
    private void registerItems() {
        ExtraItems.MYTHRIL_PICKAXE.register(this);
}
    private void enchantItems() {
        ItemMeta mythrilPickaxe = ExtraItemStack.MYTHRIL_PICKAXE_STACK.getItemMeta();
        mythrilPickaxe.addEnchant(Enchantment.DURABILITY, 10, true);
        mythrilPickaxe.addEnchant(Enchantment.DIG_SPEED, 10, true);
        mythrilPickaxe.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
        mythrilPickaxe.setUnbreakable(true);
        ExtraItemStack.MYTHRIL_PICKAXE_STACK.setItemMeta(mythrilPickaxe);
}
    private void registerResearches() {
        Research MYTHRIL_FORGING_RESEARCH = new Research(new NamespacedKey(this, "mythril_forging"),
            875094722, "Mythril Forging", 32);
        MYTHRIL_FORGING_RESEARCH.addItems(
            ExtraItems.MYTHRIL_PICKAXE;
        MYTHRIL_FORGING_RESEARCH.register();
}
