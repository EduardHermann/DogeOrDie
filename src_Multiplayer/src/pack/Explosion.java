package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Creates an explosion whenever a rocket collides with an asteroid
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
        if (variables.rocket1collision) {
          if (variables.explosiontemp1 < 10) {
            variables.explosiontemp1++;
          } else if (variables.explosiontemp1 == 10) {
            variables.explosiontemp1 = 0;
            variables.rocket1collision = false;
          }
        }
      }
    }, 0, 50);

    t.scheduleAtFixedRate(new TimerTask() {

      @Override
      public void run() {
        if (variables.rocket2collision) {
          if (variables.explosiontemp2 < 10) {
            variables.explosiontemp2++;
          } else if (variables.explosiontemp2 == 10) {
            variables.explosiontemp2 = 0;
            variables.rocket2collision = false;
          }
        }
      }
    }, 0, 50);
  }
}
