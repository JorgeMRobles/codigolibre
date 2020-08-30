package chatApp;

import chatApp.gui.MainScreen;

public class MyChatAppp {

    /**
     * @param 
     * -----HOW TO USE----- 
     * This program is used as a chat between members on the unique network
     * On the big text field on screen's top you put the public IP direction or write "localhost"
     * To receive and send messages you have to click the listener button
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        
        MainScreen screen = new MainScreen();
        screen.show();
    }
}
