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

    g.drawImage(variables.rocket, variables.rocketx, variables.rockety, variables.rocketwidth,
        variables.rockethight, null);

    if (variables.flametemp == 0) {
      g.drawImage(variables.flame1, variables.rocketx + 9, variables.rockety + 107,
          variables.flamewidth, variables.flamehight, null);
    } else if (variables.flametemp == 1) {
      g.drawImage(variables.flame2, variables.rocketx + 9, variables.rockety + 107,
          variables.flamewidth, variables.flamehight, null);
    }

    for (int i = 0; i <= 4; i++) {
      g.drawImage(variables.asteroid, variables.asteroidx[i], variables.asteroidy[i],
          variables.asteroidwidth, variables.asteroidhight, null);
    }

    if (variables.rockethealth == 3) {
      g.drawImage(variables.heart, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart, variables.heart1x2, variables.heart1y2, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart, variables.heart1x3, variables.heart1y3, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rockethealth == 2) {
      g.drawImage(variables.heart, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
      g.drawImage(variables.heart, variables.heart1x2, variables.heart1y2, variables.heartwidth,
          variables.hearthight, null);
    } else if (variables.rockethealth == 1) {
      g.drawImage(variables.heart, variables.heart1x1, variables.heart1y1, variables.heartwidth,
          variables.hearthight, null);
    }

    if (variables.rocketcollision) {
      for (int i = 0; i <= 9; i++) {
        if (variables.explosiontemp == i) {
          g.drawImage(variables.explosion[i], variables.rocketx, variables.rockety + 15,
              variables.explosionwidth, variables.explosionhight, null);
        }
      }
    }
    repaint();
  }
}
