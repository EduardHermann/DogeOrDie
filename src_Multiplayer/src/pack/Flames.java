package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Flame animation is getting created
 */
public class Flames {

  Timer t;
  Variables variables;

  public Flames(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createFlames() {
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (variables.flametemp == 0) {
          variables.flame1temp = 0;
          variables.flame2temp = 0;
          variables.flametemp++;
        } else if (variables.flametemp == 1) {
          variables.flame1temp = 1;
          variables.flame2temp = 1;
          variables.flametemp--;
        }
      }
    }, 0, 100);
  }
}
