import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.awt.*;
import java.util.Random;

public class Target extends CannonGame {

    Shape shape;
    Image target;


    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        target = ResourceManager.getImage("resources/target.png");
/*
        Random r = new Random();
        int randomPosition = r.nextInt((gameContainer.getHeight() - 30 - 100) + 1) + 100;
        graphics.drawImage(target, randomPosition, gameContainer.getHeight() - 100);
  */
    }

    static boolean hit() {

        return false;
    }

    static void reset() {
    }

    Shape getShape() {
        this.shape = new Rectangle(target.getWidth(), target.getHeight());

        return shape;
    }

}
