package pack;

/**
 * @author Eduard Hermann
 * @version 2020.11.09
 */
public class Main {

  public static void main(String[] args) {
    Variables variables = new Variables();
    variables.startingMessage();
    Gui gui = new Gui(variables);
    gui.createJFrame();
    new KeyHandler(variables);
    Background background = new Background(variables);
    background.createBackground();
    Playermovement playermovement = new Playermovement(variables);
    playermovement.createPlayermovement();
    Flames flames = new Flames(variables);
    flames.createFlames();
    Asteroidmovement asteroidmovement = new Asteroidmovement(variables);
    asteroidmovement.createAsteroid();
    AsteroidCollision asteroidCollision = new AsteroidCollision(variables);
    asteroidCollision.createCollision();
    Explosion explosion = new Explosion(variables);
    explosion.createExplosion();
    Reset reset = new Reset(variables);
    reset.doReset();
    RunTime timer = new RunTime(variables);
    timer.createTimer();
  }
}
