import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;

import java.awt.*;
import java.lang.annotation.Target;

public class Ball extends CannonGame {

    int x = 25;
    int y = 650;

    Target target;
    Shape shape;
    Image ball;
    boolean fire = false;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        if (fire) {

            y -= cannon.getStrength();
            x +=cannon.getRotation();
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        if (fire) {
            y -= cannon.getRotation();
            x +=cannon.getStrength();
        }
        ball = ResourceManager.getImage("resources/ball.png");
        graphics.drawImage(ball, x, y);

        if (y > gameContainer.getWidth() || x > gameContainer.getHeight()){

            hasFallen();
            fire = false;
            setInitialPosition();
        }
    }

    void setTarget(Target t) {
        setTarget((Target) super.target);
    }

    static boolean hasFallen() {
        return true;
    }

    void setFire(){
        fire = true;
    }
    void setInitialPosition(){
        x = 30;
        y = 650;
    }


}
