package pack;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * This class handles every variable and the most used methods.
 */
public class Variables {

  JFrame JF;
  int windowwidth = 800, windowhight = 600;
  int backgroundy1 = 0, backgroundy2 = -600;

  int rocketspeedup = 4, rocketspeeddown = 4, rocketspeedleft = 4, rocketspeedright = 4;
  int rocketwidth = 70, rockethight = 125;
  int time = 0;

  int rocket1wins = 0;
  int rocket1health = 3;
  boolean rocket1collision = false;
  int rocket1x = 200, rocket1y = 450;
  boolean rocket1moveup = false, rocket1movedown = false, rocket1moveleft = false,
      rocket1moveright = false;

  int rocket2wins = 0;
  int rocket2health = 3;
  boolean rocket2collision = false;
  int rocket2x = 530, rocket2y = 450;
  boolean rocket2moveup = false, rocket2movedown = false, rocket2moveleft = false,
      rocket2moveright = false;

  int heartwidth = 50, hearthight = 50;
  int heart1x1 = 0, heart1y1 = 0;
  int heart1x2 = 50, heart1y2 = 0;
  int heart1x3 = 100, heart1y3 = 0;
  int heart2x1 = 635, heart2y1 = 0;
  int heart2x2 = 685, heart2y2 = 0;
  int heart2x3 = 735, heart2y3 = 0;

  int flamewidth = 50, flamehight = 60;
  int flametemp = 0;
  int flame1temp = 0, flame2temp = 0;;

  int explosionwidth = 70, explosionhight = 95;
  int explosiontemp1 = 0, explosiontemp2 = 0;

  int asteroidwidth = 100, asteroidhight = 75;
  int[] asteroidx;
  int[] asteroidy;
  int[] asteroidspeed;

  Label label;
  BufferedImage background, rocket1, rocket2, flame1, flame2, flame3, flame4, asteroid, heart1,
      heart2;
  BufferedImage[] explosion1, explosion2;
  ImageIcon icon;

  public Variables() {
    try {

      asteroidx = new int[5];
      asteroidy = new int[5];
      asteroidspeed = new int[] {1, 3, 2, 1, 2};
      explosion1 = new BufferedImage[10];
      explosion2 = new BufferedImage[10];

      background = ImageIO.read(new File("rsc/background/background.png"));
      rocket1 = ImageIO.read(new File("rsc/rocket/rocket_red.png"));
      rocket2 = ImageIO.read(new File("rsc/rocket/rocket_blue.png"));
      flame1 = ImageIO.read(new File("rsc/flame/flame_red_1.png"));
      flame2 = ImageIO.read(new File("rsc/flame/flame_red_2.png"));
      flame3 = ImageIO.read(new File("rsc/flame/flame_blue_1.png"));
      flame4 = ImageIO.read(new File("rsc/flame/flame_blue_2.png"));
      asteroid = ImageIO.read(new File("rsc/asteroid/asteroid.png"));
      heart1 = ImageIO.read(new File("rsc/heart/heart_red.png"));
      heart2 = ImageIO.read(new File("rsc/heart/heart_blue.png"));

      for (int i = 0; i <= 9; i++) {
        explosion1[i] = ImageIO.read(new File("rsc/explosion/explosion_" + i + ".png"));
        explosion2[i] = ImageIO.read(new File("rsc/explosion/explosion_" + i + ".png"));
      }

    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Variables couldn't be identified");
    }
  }

  /**
   * Prints the name of the programm author and the release date
   */
  public void startingMessage() {
    System.out.println("The Game DodgeOrDieMultiplayer was produced by Eduard Hermann");
    System.out.println("on 09.11.2020");
  }

  /**
   * Prints the current scoreboard
   */
  public void winCounter() {
    System.out.println("*****************");
    System.out.println("Red rocket wins:");
    System.out.println(rocket1wins);
    System.out.println("Blue rocket wins:");
    System.out.println(rocket2wins);
    System.out.println("Time:");
    System.out.println(time + " sec");
  }

  /**
   * Places the asteroids above the JFrame
   */
  public void settingAsteroidPosition() {
    int asteroidtemp = 17;
    for (int i = 0; i <= 4; i++) {
      asteroidx[i] = asteroidtemp;
      asteroidy[i] = -400 - asteroidtemp;
      asteroidtemp += 160;
    }
    asteroidtemp = 17;
  }
}
