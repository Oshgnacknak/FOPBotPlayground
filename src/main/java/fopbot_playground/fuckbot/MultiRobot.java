package fopbot_playground.fuckbot;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.LEFT;
import static fopbot.Direction.RIGHT;

public class MultiRobot {

  public static void main(String[] args) {
    World.setVisible(true);

    Robot a = new Robot(0, 0, RIGHT, 20);
    Robot b = new Robot(9, 9, LEFT, 20);

    FuckBot.exec("(^.1^.0?|)<1<0(^.1^.0?|)",
      a, b);
  }
}
