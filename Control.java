import java.awt.*;

public class Control {
  Robot robot;

  public Control() throws AWTException, InterruptedException {
    robot = new Robot();
  }

  public void run(int x, int y) {
    for (int i = 0; i < 10; i++) {
      robot.mouseMove(x + i, y + i);
    }
  }
}
