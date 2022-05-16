package main;

import debug.Save;

public class Main {
    public static void main(String[] args) {
        Save save = new Save();

        save.setMegamiList();
        save.saveFile();
        save.loadFile();
        save.printOut();
    }
}
