import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class MyGame {

    static final int WIDTH = 1024;
    static final int HEIGHT = 768;

    public static void main(String[] args) throws SlickException {

        CannonGame cg = new CannonGame();
        AppGameContainer ap = new AppGameContainer(cg,WIDTH,HEIGHT,false);
        ap.start();

    }

}
