package com.example.examplemod;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.lwjgl.input.Keyboard.KEY_RSHIFT;

public class Client {
    public static final Object DEFAULT_HUD_KEY = KEY_RSHIFT;
    public static String PlayerName = Minecraft.getMinecraft().getSession().getUsername();
    public static String name = "DELTA Client 1.12.2 | " + PlayerName;
    public static String cName = "Delta \u00A7aClient";
    public static final String DIRECTORY_PATH = "Delta Client";

    public static void startup(){
        Display.setTitle(name);

    }
}

