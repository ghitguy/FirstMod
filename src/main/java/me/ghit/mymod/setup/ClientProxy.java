package me.ghit.mymod.setup;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy { // Would not be safe to be used in a server proxy
    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
