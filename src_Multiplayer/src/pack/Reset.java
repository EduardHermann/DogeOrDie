package pack;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Whenever a rocket doesn't have any more health (loses), everything is getting reset. Both rockets
 * are getting their health reseted to 3, the seconds counter is getting reseted to 0, and the
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
        if (variables.rocket1health == 0 || variables.rocket2health == 0) {
          variables.settingAsteroidPosition();
          if (variables.rocket1health == 0) {
            variables.rocket2wins++;
          }

          if (variables.rocket2health == 0) {
            variables.rocket1wins++;
          }
          variables.winCounter();
          variables.rocket1health = 3;
          variables.rocket2health = 3;
          variables.time = 0;
        }
      }
    }, 0, 50);
  }
}
