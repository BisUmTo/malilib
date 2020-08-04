package fi.dy.masa.malilib.gui.interfaces;

import javax.annotation.Nullable;
import fi.dy.masa.malilib.gui.button.ConfigButtonKeyBind;
import fi.dy.masa.malilib.gui.listener.ConfigOptionChangeListenerKeybind;

public interface IKeybindConfigGui extends IConfigGui
{
    /**
     * Adds a hotkey keybind change listener. These will be used for updating the used
     * keys in the keybind handler after the hotkeys were changed, and also
     * for updating the hotkey config buttons in the GUI.
     * @param listener
     */
    void addKeyBindChangeListener(ConfigOptionChangeListenerKeybind listener);

    /**
     * Sets or clears the currently active/selected hotkey config button.
     * The active button reference is used for capturing the new hotkey combination,
     * and for updating the button appearance when gaining or losing the focus.
     * @param button
     */
    void setActiveKeyBindButton(@Nullable ConfigButtonKeyBind button);
}
