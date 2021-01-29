package pack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Getting userinput whenever the user presses or releases the keys W, A, S, D
 */
public class KeyHandler implements KeyListener {

  Variables variables;

  public KeyHandler(Variables variables) {
    this.variables = variables;
  }

  @Override
  public void keyPressed(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_W) {
      variables.rocketmoveup = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_S) {
      variables.rocketmovedown = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_A) {
      variables.rocketmoveleft = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_D) {
      variables.rocketmoveright = true;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_W) {
      variables.rocketmoveup = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_S) {
      variables.rocketmovedown = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_A) {
      variables.rocketmoveleft = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_D) {
      variables.rocketmoveright = false;
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {}
}
