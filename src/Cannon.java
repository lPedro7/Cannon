import org.newdawn.slick.*;

public class Cannon extends CannonGame {

    double rotation = 5;
    double strength = 50;

    Image cannon;
    Image base_cannon;

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {


        cannon = ResourceManager.getImage("resources/cannon.png");
        base_cannon = ResourceManager.getImage("resources/cannon_base.png");
        graphics.drawImage(cannon, 25, gameContainer.getHeight() - 150);
        graphics.drawImage(base_cannon, 25, gameContainer.getHeight() - 125);
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

        if (input.isKeyDown(Input.KEY_RIGHT)){
            if (strength < 100){
                strength++;
            }
        }
        if (input.isKeyDown(Input.KEY_LEFT)){
            if (strength > 0) {
                strength--;
            }
        }
    }

    void fire() {
    }

    void updateRotation(double deltaRotation) {
        cannon.setRotation(45);
    }

    void updateStrength(double deltaStrength) {
    }

    double getRotation() {
        return cannon.getCenterOfRotationX();
    }

    double getStrength() {
        return 0;
    }
}
