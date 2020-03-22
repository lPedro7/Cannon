import org.newdawn.slick.*;

// Classe CannonGame, inicialitza tot el joc
public class CannonGame extends BasicGame {

    // Variables que intervendràn en el desenvolupament del joc
    static Landscape lc;
    static Ball ball;
    static Cannon cannon;
    static Target target;
    Input input = new Input(0);
    boolean isEnter = false;
    Font font40;
    Font font20;
    int shots;
    int score;

    // Constructor del joc, donam el nom del joc
    public CannonGame() {
        super("Cannon Game");
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        // FPS sempre aniran a 60
        gameContainer.setTargetFrameRate(60);
        gameContainer.setShowFPS(false);

        // Declaram els components del nostre joc :
        // Landscape ( mapa )
        // Cannon ( canó )
        // Target ( objectiu )
        // font40 i font20 ( tipus de lletra )
        lc = new Landscape();
        cannon = new Cannon();
        target = new Target();
        font40 = ResourceManager.getFont("resources/WHITRABT.ttf", 40);
        font20 = ResourceManager.getFont("resources/WHITRABT.ttf", 20);
        ball = new Ball();

        // Declaram variables shots ( nombre de tirs ) i score ( puntuació )
        shots = 5;
        score = 0;
    }

    // Actualitza el joc
    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        lc.update(gameContainer, i);
        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            gameContainer.exit();
        }

        if (input.isKeyDown(Input.KEY_ENTER)) {
            isEnter = true;
            cannon.update(gameContainer, i);
            target.update(gameContainer, i);
            ball.update(gameContainer, i);
        }

        if (input.isKeyDown(Input.KEY_R)) {
            gameContainer.reinit();
            isEnter = false;
        }


    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        lc.render(gameContainer, graphics);
        if (isEnter) {

            cannon.render(gameContainer, graphics);
            target.render(gameContainer, graphics);
            font20.drawString(10, 10, "SHOTS : " + shots);
            font20.drawString(gameContainer.getWidth() - 175, 10, "SCORE : " + score);
            font20.drawString(10, gameContainer.getHeight() / 2, "ANGLE : " + cannon.rotation);
            font20.drawString(10, gameContainer.getHeight() / 2 + 30, "POWER : " + cannon.strength);ball.render(gameContainer, graphics);

        } else {


            font40.drawString(gameContainer.getWidth() / 2 - 130,
                    gameContainer.getHeight() / 2 - 30, "PRESS ENTER \n TO   START");

        }
    }
}