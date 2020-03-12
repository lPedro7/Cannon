import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

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
        graphics.drawRect(10,10,100,100);
    }
}