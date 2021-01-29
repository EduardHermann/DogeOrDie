package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The rocket is able to move in the JFrame whenever the user presses W, A, S, D.
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
        if (variables.rocketmoveleft == true && variables.rocketx >= 0) {
          variables.rocketx -= variables.rocketspeedleft;
        }

        if (variables.rocketmoveright == true && variables.rocketx <= 710) {
          variables.rocketx += variables.rocketspeedright;
        }

        if (variables.rocketmoveup == true && variables.rockety >= 0) {
          variables.rockety -= variables.rocketspeedup;
        }

        if (variables.rocketmovedown == true && variables.rockety <= 435) {
          variables.rockety += variables.rocketspeeddown;
        }
      }
    }, 0, 10);
  }
}
