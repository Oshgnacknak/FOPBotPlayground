package fopbot_playground.fuckbot;

import fopbot.Robot;

public class FuckBot {

  public static void exec(String proc, Robot... robots) {
    var r = robots[0];
    int isp = 0;

    while (isp < proc.length()) {
      switch (proc.charAt(isp)) {
        case '<' -> r.turnLeft();
        case '^' -> r.move();
        case '.' -> r.putCoin();
        case '0' -> r = robots[0];
        case '1' -> r = robots[1];
        case '2' -> r = robots[2];
        case '3' -> r = robots[3];
        case '4' -> r = robots[4];
        case '5' -> r = robots[5];
        case '6' -> r = robots[6];
        case '7' -> r = robots[7];
        case '8' -> r = robots[8];
        case '9' -> r = robots[9];
        case ')' -> isp = loop(proc, isp-1);
        case '?' -> {
          isp++;
          switch (proc.charAt(isp)) {
            case '|' -> {
              if (r.isFrontClear()) {
                isp = loop(proc, isp);
              } else {
                isp++;
              }
            }
          }
        }
      }
      isp++;
    }
  }

  private static int loop(String proc, int isp) {
    var closed = 1;

    for (int i = isp; i >= 0; i--) {
      switch (proc.charAt(i)) {
        case ')' -> closed++;
        case '(' -> closed--;
      }

      if (closed == 0) {
        return i;
      }
    }

    return 0;
  }
}
