package fi.dy.masa.malilib.input;

import java.util.List;

public interface KeyBindProvider
{
    /**
     * Returns a list of all hotkeys that should be registered.
     * This is called when the master hotkey list in malilib is being rebuilt,
     * so any hotkeys not on the returned list will not function.
     * @return
     */
    List<? extends Hotkey> getAllHotkeys();

    /**
     * Returns a list of all the hotkeys, per categories, that should appear
     * on the combined list of all hotkeys from all mods using the malilib hotkey system.
     * Keys/categories not on this list will simply not appear on the combined list,
     * but the hotkeys will still function normally.
     * @return
     */
    List<KeyBindCategory> getHotkeyCategoriesForCombinedView();
}
