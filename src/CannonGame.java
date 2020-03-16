import org.newdawn.slick.*;

public class CannonGame extends BasicGame {

    Landscape lc;
    Cannon cannon;
    Ball ball;
    Target target;
    Input input = new Input(0);
    boolean isEnter = false;
    Font font40;
    Font font20;
    int shots;
    int score;

    public static void main(String[] args) {

    }

    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        gameContainer.setTargetFrameRate(60);
        lc = new Landscape();
        cannon = new Cannon();
        ball = new Ball();
        target = new Target();
        font40 = ResourceManager.getFont("resources/WHITRABT.ttf", 40);
        font20 = ResourceManager.getFont("resources/WHITRABT.ttf", 20);
        shots = 5;
        score=0;
        gameContainer.setShowFPS(false);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        lc.update(gameContainer, i);

        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            gameContainer.exit();
        }

        if (input.isKeyDown(Input.KEY_ENTER)) {
            isEnter = true;
            cannon.update(gameContainer, i);
            ball.update(gameContainer, i);
            target.update(gameContainer, i);
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        lc.render(gameContainer, graphics);

        if (isEnter) {

            cannon.render(gameContainer, graphics);
            ball.render(gameContainer, graphics);
            target.render(gameContainer, graphics);

            font20.drawString(10,10,"SHOTS : " + shots);
            font20.drawString(gameContainer.getWidth() - 175,10,"SCORE : " + score);
            font20.drawString(10,gameContainer.getHeight()/2, "ANGLE : " + cannon.rotation);
            font20.drawString(10,gameContainer.getHeight()/2+30, "POWER : " + cannon.strength);

        } else {


            font40.drawString(gameContainer.getWidth() / 2 - 130,
                    gameContainer.getHeight() / 2 - 30, "PRESS ENTER \n TO   START");

        }
    }
}