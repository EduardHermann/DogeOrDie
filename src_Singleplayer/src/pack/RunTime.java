package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Creating a seconds counter
 */
public class RunTime {

  Timer t;
  Variables variables;

  public RunTime(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void createTimer() {
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        variables.time++;
      }
    }, 0, 1000);
  }
}
