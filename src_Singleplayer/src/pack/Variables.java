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

  int rocketwins = 0;
  int rockethealth = 3;
  boolean rocketcollision = false;
  int rocketx = 365, rockety = 450;
  boolean rocketmoveup = false, rocketmovedown = false, rocketmoveleft = false,
      rocketmoveright = false;

  int heartwidth = 50, hearthight = 50;
  int heart1x1 = 0, heart1y1 = 0;
  int heart1x2 = 50, heart1y2 = 0;
  int heart1x3 = 100, heart1y3 = 0;

  int flamewidth = 50, flamehight = 60;
  int flametemp = 0;

  int explosionwidth = 70, explosionhight = 95;
  int explosiontemp = 0;

  int asteroidwidth = 100, asteroidhight = 75;
  int[] asteroidx;
  int[] asteroidy;
  int[] asteroidspeed;

  Label label;
  BufferedImage background, rocket, flame1, flame2, asteroid, heart;
  BufferedImage[] explosion;
  ImageIcon icon;

  public Variables() {
    try {

      asteroidx = new int[5];
      asteroidy = new int[5];
      asteroidspeed = new int[] {1, 3, 2, 1, 2};
      explosion = new BufferedImage[10];

      background = ImageIO.read(new File("rsc/background/background.png"));
      rocket = ImageIO.read(new File("rsc/rocket/rocket_red.png"));
      flame1 = ImageIO.read(new File("rsc/flame/flame_red_1.png"));
      flame2 = ImageIO.read(new File("rsc/flame/flame_red_2.png"));
      asteroid = ImageIO.read(new File("rsc/asteroid/asteroid.png"));
      heart = ImageIO.read(new File("rsc/heart/heart_red.png"));

      for (int i = 0; i <= 9; i++) {
        explosion[i] = ImageIO.read(new File("rsc/explosion/explosion_" + i + ".png"));
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
    System.out.println("The Game DodgeOrDieSingleplayer was produced by Eduard Hermann");
    System.out.println("on 09.11.2020");
  }

  /**
   * Prints the current scoreboard
   */
  public void scoreCounter() {
    System.out.println("********");
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
