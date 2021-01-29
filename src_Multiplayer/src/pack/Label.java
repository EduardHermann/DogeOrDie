package pack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

/**
 * Everything is getting drawn onto the JFrame
 */
public class Label extends JLabel {

  private static final long serialVersionUID = 1L;
  Variables variables;

  public Label(Variables variables) {
    this.variables = variables;
  }

  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
    Graphics g2d = (Graphics2D) g;
    ((Graphics2D) g2d).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);

    g.drawImage(variables.background, 0, variables.backgroundy1, variables.windowwidth,
        variables.windowhight, null);
    g.drawImage(variables.background, 0, variables.backgroundy2, variables.windowwidth,
        variables.windowhight, null);

    g.drawImage(variables.rocket2, variables.rocket2x, variables.rocket2y, variables.rocketwidth,
        variables.rockethight, null);

    if (variables.flame2temp == 0) {
      g.drawImage(variables.flame3, variables.rocket2x + 9, variables.rocket2y + 107,
          variables.flamewidth, variables.flamehight, null);
    } else if (variables.flame2temp == 1) {
      g.drawImage(variables.flame4, variables.rocket2x + 9, variables.rocket2y + 107,
          variables.flamewidth, variables.flamehight, null);
    }

    g.drawImage(variables.rocket1, variables.rocket1x, variables.rocket1y, variables.rocketwidth,
        variables.rockethight, null);

    if (variables.flame1temp == 0) {
      g.drawImage(variables.flame1, variables.rocket1x + 9, variables.rocket1y + 107,
          variables.flamewidth, variables.flamehight, null);
    } else if (variables.flame1temp == 1) {
      g.drawImage(variables.flame2, variables.rocket1x + 9, variables.rocket1y + 107,
          variables.flamewidth, variables.flamehight, null);
    }

    for (int i = 0; i <= 4; i++) {
      g.drawImage(variables.asteroid, variables.asteroidx[i], variables.asteroidy[i],
          variables.asteroidwidth, variables.asteroidhight, null);
    }

    if (variables.rocket2health == 3) {
      g.drawImage(variables.heart2, variables.heart2x1, variables.heart2y1, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart2, variables.heart2x2, variables.heart2y2, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart2, variables.heart2x3, variables.heart2y3, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rocket2health == 2) {
      g.drawImage(variables.heart2, variables.heart2x2, variables.heart2y2, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart2, variables.heart2x3, variables.heart2y2, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rocket2health == 1) {
      g.drawImage(variables.heart2, variables.heart2x3, variables.heart2y3, variables.heartwidth,
          variables.hearthight, null);
    }

    if (variables.rocket1health == 3) {
      g.drawImage(variables.heart1, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart1, variables.heart1x2, variables.heart1y2, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart1, variables.heart1x3, variables.heart1y3, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rocket1health == 2) {
      g.drawImage(variables.heart1, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart1, variables.heart1x2, variables.heart1y2, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rocket1health == 1) {
      g.drawImage(variables.heart1, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
    }

    if (variables.rocket2collision) {
      for (int i = 0; i <= 9; i++) {
        if (variables.explosiontemp2 == i) {
          g.drawImage(variables.explosion2[i], variables.rocket2x, variables.rocket2y + 15,
              variables.explosionwidth, variables.explosionhight, null);
        }
      }
    }

    if (variables.rocket1collision) {
      for (int i = 0; i <= 9; i++) {
        if (variables.explosiontemp1 == i) {
          g.drawImage(variables.explosion1[i], variables.rocket1x, variables.rocket1y + 15,
              variables.explosionwidth, variables.explosionhight, null);
        }
      }
    }
    repaint();
  }
}
