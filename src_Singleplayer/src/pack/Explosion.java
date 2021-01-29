package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Creates an explosion whenever the rocket collides with an asteroid
 */
public class Explosion {

  Timer t;
  Variables variables;

  public Explosion(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createExplosion() {
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (variables.rocketcollision) {
          if (variables.explosiontemp < 10) {
            variables.explosiontemp++;
          } else if (variables.explosiontemp == 10) {
            variables.explosiontemp = 0;
            variables.rocketcollision = false;
          }
        }
      }
    }, 0, 50);
  }
}
