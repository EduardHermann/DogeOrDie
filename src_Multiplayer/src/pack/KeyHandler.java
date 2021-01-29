package pack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Getting userinput whenever the user presses or releases the keys W, A, S, D or the arrow keys
 */
public class KeyHandler implements KeyListener {

  Variables variables;

  public KeyHandler(Variables variables) {
    this.variables = variables;
  }

  @Override
  public void keyPressed(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_W) {
      variables.rocket1moveup = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_S) {
      variables.rocket1movedown = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_A) {
      variables.rocket1moveleft = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_D) {
      variables.rocket1moveright = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      variables.rocket2moveup = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      variables.rocket2movedown = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      variables.rocket2moveleft = true;
    }

    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      variables.rocket2moveright = true;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_W) {
      variables.rocket1moveup = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_S) {
      variables.rocket1movedown = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_A) {
      variables.rocket1moveleft = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_D) {
      variables.rocket1moveright = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      variables.rocket2moveup = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      variables.rocket2movedown = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      variables.rocket2moveleft = false;
    }

    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      variables.rocket2moveright = false;
    }
  }

  @Override
  public void keyTyped(KeyEvent e) {}
}
