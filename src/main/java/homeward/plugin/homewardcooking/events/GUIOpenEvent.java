package homeward.plugin.homewardcooking.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class GUIOpenEvent extends Event implements Cancellable {

    private Player player;
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelledFlag = false;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GUIOpenEvent (Player player) {
        this.player = player;
    }

    @Override
    public boolean isCancelled() {
        return cancelledFlag;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelledFlag = cancel;
    }

    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }


}
