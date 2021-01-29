package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The rocket1 is able to move in the JFrame whenever the user presses W, A, S, D. The rocket2 is
 * able to move in the JFrame whenever the user presses the arrow keys.
 */
public class Playermovement {

  Timer t;
  Variables variables;

  public Playermovement(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createPlayermovement() {
    t.schedule(new TimerTask() {

      @Override
      public void run() {
        if (variables.rocket1moveleft == true && variables.rocket1x >= 0) {
          variables.rocket1x -= variables.rocketspeedleft;
        }

        if (variables.rocket1moveright == true && variables.rocket1x <= 710) {
          variables.rocket1x += variables.rocketspeedright;
        }

        if (variables.rocket1moveup == true && variables.rocket1y >= 0) {
          variables.rocket1y -= variables.rocketspeedup;
        }

        if (variables.rocket1movedown == true && variables.rocket1y <= 435) {
          variables.rocket1y += variables.rocketspeeddown;
        }

        if (variables.rocket2moveleft == true && variables.rocket2x >= 0) {
          variables.rocket2x -= variables.rocketspeedleft;
        }

        if (variables.rocket2moveright == true && variables.rocket2x <= 710) {
          variables.rocket2x += variables.rocketspeedright;
        }

        if (variables.rocket2moveup == true && variables.rocket2y >= 0) {
          variables.rocket2y -= variables.rocketspeedup;
        }

        if (variables.rocket2movedown == true && variables.rocket2y <= 435) {
          variables.rocket2y += variables.rocketspeeddown;
        }
      }
    }, 0, 10);
  }
}
