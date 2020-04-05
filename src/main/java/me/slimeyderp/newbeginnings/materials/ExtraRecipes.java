package me.slimeyderp.newbeginnings.materials;

import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

public class ExtraRecipes {

    //This area contains all the recipes for the items to be able to register.

    public static final ItemStack[] EMPTY_RECIPE = {
        null, null, null,
        null, null, null,
        null, null, null
    };
    public static final ItemStack[] MYTHRIL_RECIPE = {
        ExtraItemStack.MYTHRIL_ORE_STACK, new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.CHORUS_FRUIT),
        SlimefunItems.SYNTHETIC_DIAMOND, null, null,
        null, null, null
    };
    public static final ItemStack[] MYTHRIL_HELMET_RECIPE = {
        SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT,
        ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK,
        null, null, null
    };
    public static final ItemStack[] MYTHRIL_CHESTPLATE_RECIPE = {
        ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK,
        SlimefunItems.LEAD_INGOT, new ItemStack(Material.ELYTRA), SlimefunItems.LEAD_INGOT,
        ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_LEGGINGS_RECIPE = {
        ExtraItemStack.MYTHRIL_STACK, SlimefunItems.LEAD_INGOT, ExtraItemStack.MYTHRIL_STACK,
        SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT,
        ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_BOOTS_RECIPE = {
        null, null, null,
        SlimefunItems.LEAD_INGOT, null, SlimefunItems.LEAD_INGOT,
        ExtraItemStack.MYTHRIL_STACK, null, ExtraItemStack.MYTHRIL_STACK
    };
    public static final ItemStack[] MYTHRIL_BLADE_RECIPE = {
        null, ExtraItemStack.MYTHRIL_STACK, null,
        null, ExtraItemStack.MYTHRIL_STACK, null,
        null, SlimefunItems.STAFF_ELEMENTAL, null
    };
    public static final ItemStack[] MYTHRIL_PICKAXE_RECIPE = {
        ExtraItemStack.MYTHRIL_STACK, ExtraItemStack.MYTHRIL_STACK, ExtraItemStack.MYTHRIL_STACK,
        null, new ItemStack(Material.STICK), null,
        null, SlimefunItems.STAFF_ELEMENTAL, null
    };
    public static final ItemStack[] SHULKER_SHELL_RECIPE = {
        ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.ENDER_PEARL), ExtraItemStack.MYTHRIL_STACK,
        null, new ItemStack(Material.POPPED_CHORUS_FRUIT), null,
        null, null, null
    };
    public static final ItemStack[] INFINITE_FIREWORK_RECIPE = {
        ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.GUNPOWDER), ExtraItemStack.MYTHRIL_STACK,
        new ItemStack(Material.PAPER), new ItemStack(Material.FIREWORK_ROCKET), new ItemStack(Material.PAPER),
        ExtraItemStack.MYTHRIL_STACK, new ItemStack(Material.GUNPOWDER), ExtraItemStack.MYTHRIL_STACK
    };
}
