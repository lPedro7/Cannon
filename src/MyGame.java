import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

// Classe MyGame, inicialitzam el joc

public class MyGame {

    // Variables que defineixen la mesura de la finestra
    static final int WIDTH = 1024;
    static final int HEIGHT = 768;
    static final boolean fullScreen = false;
    public static void main(String[] args) throws SlickException {

        CannonGame cg = new CannonGame();
        AppGameContainer ap = new AppGameContainer(cg,WIDTH,HEIGHT,fullScreen);
        ap.start();

    }

}
