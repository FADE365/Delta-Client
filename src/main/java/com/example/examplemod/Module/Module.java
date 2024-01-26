package com.example.examplemod.Module;

import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Locale;

public class Module {
    public static ArrayList<Category> categories = new ArrayList<>();
    public static String name;
    public static Category category;
    public static int keyCode;
    public static boolean toggled;

    public Module(String name, Category cat, int keyin) {
        this.name = name;
        this.category = cat;
        this.keyCode = keyin;
    }

    public enum Category {
        COMBAT,
        MOVEMENT,
        PLAYER,
        RENDER,
        MISC,
        CLIENT,
        EXPLOIT,
        AUTODUPE;
    }
    //Getters ->
    public static boolean getState() {
        return toggled;
    }
    public static int getKeyCode() {
        return keyCode;
    }
    public Category getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public void onEnable() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    public void onDisable() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    //Setters ->
    public void SetKey(int KeyCode) {
        this.keyCode = KeyCode;
    }
    public void setToggled(boolean toggled) {
        this.toggled = toggled;
        if (this.toggled) this.onEnable(); else onDisable();
    }
    public void toggle() {
        toggled = !toggled;
        if (toggled) onEnable(); else onDisable();
    }

}
