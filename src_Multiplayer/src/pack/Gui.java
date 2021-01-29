package pack;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * The graphical user interface is getting created.
 */
public class Gui {

  Variables variables;

  public Gui(Variables variables) {
    this.variables = variables;
    variables.JF = new JFrame();
    variables.label = new Label(variables);
    variables.icon = new ImageIcon("rsc/icon/icon.png");
  }

  public void createJFrame() {
    variables.JF.setTitle("DodgeOrDieMultiplayer");
    variables.JF.setSize(variables.windowwidth, variables.windowhight);
    variables.JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    variables.JF.setLocationRelativeTo(null);
    variables.JF.setResizable(false);
    variables.JF.setVisible(true);
    variables.JF.addKeyListener(new KeyHandler(variables));

    variables.label.setBounds(0, 0, variables.windowwidth, variables.windowhight);
    variables.JF.add(variables.label);

    variables.JF.setIconImage(variables.icon.getImage());
  }
}
