import org.newdawn.slick.*;

public class Landscape extends CannonGame{


    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        Image background = ResourceManager.getImage("resources/landscape.jpg");

        background = background.getScaledCopy(gameContainer.getWidth(),gameContainer.getHeight());

        graphics.drawImage(background,0,0);


    }

}
