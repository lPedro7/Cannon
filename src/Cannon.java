import org.newdawn.slick.*;

public class Cannon extends CannonGame {

    int x;
    int y;

    double rotation = 5;
    double strength = 50;
    Image cannon;
    Image base_cannon;


    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        if (ball != null) {
            ball.update(gameContainer, i);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        x = 25;
        y = gameContainer.getHeight() - 150;
        cannon = ResourceManager.getImage("resources/cannon.png");
        base_cannon = ResourceManager.getImage("resources/cannon_base.png");
        graphics.drawImage(cannon, x, y);
        graphics.drawImage(base_cannon, x, y + 25);

        if (ball != null) {
            ball.render(gameContainer, graphics);
        }

        cannon.setCenterOfRotation(35, 35);
        if (input.isKeyDown(Input.KEY_DOWN)) {
            if (cannon.getRotation() * -1 > 5) {
                cannon.rotate(1);
                rotation = cannon.getRotation() * -1;
            }
        }
        if (input.isKeyDown(Input.KEY_UP)) {
            if (cannon.getRotation() * -1 < 85) {
                cannon.rotate(-1);
                rotation = cannon.getRotation() * -1;
            }
        }

        if (input.isKeyDown(Input.KEY_RIGHT)) {
            if (strength < 100) {
                strength++;
            }
        }
        if (input.isKeyDown(Input.KEY_LEFT)) {
            if (strength > 0) {
                strength--;
            }
        }

        if (input.isKeyDown(Input.KEY_SPACE)) {
            fire(ball);
        }

    }

    void fire(Ball ball) {
        ball.setFire();
    }

    void updateRotation(double deltaRotation) {
        cannon.setRotation(45);
    }

    void updateStrength(double deltaStrength) {
    }

    double getRotation() {
        return this.rotation;
    }

    double getStrength() {
        return this.strength;
    }
}
