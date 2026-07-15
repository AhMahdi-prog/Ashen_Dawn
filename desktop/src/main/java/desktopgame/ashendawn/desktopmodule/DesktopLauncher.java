package desktopgame.ashendawn.desktopmodule;

import desktopgame.ashendawn.game.AshenDawn;
import com.jme3.system.AppSettings;

/**
 * Used to launch a jme application in desktop environment
 *
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        final AshenDawn game = new AshenDawn();

        final AppSettings appSettings = new AppSettings(true);

        game.setSettings(appSettings);
        game.start();
    }
}
