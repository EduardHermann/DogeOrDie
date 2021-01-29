package pack;

import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Creates Hitboxes around the Objects of the game in oder to make them collidable
 */
public class AsteroidCollision {

  Timer t;
  Rectangle[] Hitboxes;
  Rectangle Hitboxr;
  Variables variables;

  public AsteroidCollision(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createCollision() {

    Hitboxes = new Rectangle[5];
    Hitboxr = new Rectangle();

    t.scheduleAtFixedRate(new TimerTask() {

      @Override
      public void run() {
        Hitboxes[0] = new Rectangle(variables.asteroidx[0], variables.asteroidy[0],
            variables.asteroidwidth, variables.asteroidhight);
        Hitboxes[1] = new Rectangle(variables.asteroidx[1], variables.asteroidy[1],
            variables.asteroidwidth, variables.asteroidhight);
        Hitboxes[2] = new Rectangle(variables.asteroidx[2], variables.asteroidy[2],
            variables.asteroidwidth, variables.asteroidhight);
        Hitboxes[3] = new Rectangle(variables.asteroidx[3], variables.asteroidy[3],
            variables.asteroidwidth, variables.asteroidhight);
        Hitboxes[4] = new Rectangle(variables.asteroidx[4], variables.asteroidy[4],
            variables.asteroidwidth, variables.asteroidhight);

        Hitboxr = new Rectangle(variables.rocketx, variables.rockety, variables.rocketwidth,
            variables.rockethight);

        for (int i = 0; i <= 4; i++) {
          if (Hitboxes[i].intersects(Hitboxr)) {
            variables.asteroidy[i] = -100;
            variables.rocketcollision = true;
            if (variables.rockethealth > 0) {
              variables.rockethealth--;
            }
          }
        }
      }
    }, 0, 50);
  }
}
