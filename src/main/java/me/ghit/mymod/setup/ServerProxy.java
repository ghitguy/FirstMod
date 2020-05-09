package me.ghit.mymod.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("This can only be run on the client!");
    }
}
