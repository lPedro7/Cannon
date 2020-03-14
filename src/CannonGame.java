import org.newdawn.slick.*;

public class CannonGame extends BasicGame {


    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        gameContainer.setTargetFrameRate(60);

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        Landscape lc = new Landscape();
        lc.render(gameContainer, graphics);

    }
}