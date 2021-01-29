package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Whenever the rocket doesn't have any more health (loses), everything is getting reseted. The
 * rocket is getting his health reseted to 3, the seconds counter is getting reseted to 0, and the
 * current scoreboard is getting printed out.
 */
public class Reset {

  Timer t;
  Variables variables;

  public Reset(Variables variables) {
    this.variables = variables;
    t = new Timer();
  }

  public void doReset() {
    t.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        if (variables.rockethealth == 0) {
          variables.settingAsteroidPosition();
          variables.scoreCounter();
          variables.rockethealth = 3;
          variables.time = 0;
        }
      }
    }, 0, 50);
  }
}
