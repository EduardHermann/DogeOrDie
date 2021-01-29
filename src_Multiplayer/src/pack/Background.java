package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Animates the background movement
 */
public class Background {

  Timer t;
  Variables variables;

  public Background(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createBackground() {
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (variables.backgroundy1 < 590) {
          variables.backgroundy1 += 2;
        } else {
          variables.backgroundy1 = -600;
        }

        if (variables.backgroundy2 < 590) {
          variables.backgroundy2 += 2;
        } else {
          variables.backgroundy2 = -600;
        }
      }
    }, 0, 7);
  }
}
