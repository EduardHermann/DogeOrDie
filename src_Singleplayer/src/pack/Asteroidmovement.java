package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Makes the asteroids fall down
 */
public class Asteroidmovement {

  Timer t;
  Variables variables;

  public Asteroidmovement(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createAsteroid() {
    variables.settingAsteroidPosition();
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        for (int i = 0; i <= 4; i++) {
          variables.asteroidy[i] += variables.asteroidspeed[i];
          if (variables.asteroidy[i] >= variables.windowhight) {
            variables.asteroidy[i] = -100;
          }
        }
      }
    }, 0, 7);
  }
}
