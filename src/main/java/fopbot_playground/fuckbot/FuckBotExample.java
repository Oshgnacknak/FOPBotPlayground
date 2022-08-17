package fopbot_playground.fuckbot;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

public class FuckBotExample {

  public static void main(String[] args) {
    World.setVisible(true);

    var r = new Robot(4, 4, Direction.UP, 99);
    FuckBot.exec("((.^?|)<)", r);
  }
}
