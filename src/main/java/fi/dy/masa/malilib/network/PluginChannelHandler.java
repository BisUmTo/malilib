package fi.dy.masa.malilib.network;

import java.util.List;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

public interface PluginChannelHandler
{
    List<ResourceLocation> getChannels();

    void onPacketReceived(PacketBuffer buf);
}
