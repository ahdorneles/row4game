package org.academiadecodigo.bootcamp;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;

/**
 * Created by codecadet on 15/03/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        GUIScreen gui = TerminalFacade.createGUIScreen();
        gui.getScreen().startScreen();

        Window window = new Window("Hello World");
        gui.showWindow(window);

        gui.getScreen().stopScreen();
    }
}
