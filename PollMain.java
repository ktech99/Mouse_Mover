import java.awt.*;

public class PollMain {
  public static void main(String[] args) throws AWTException, InterruptedException {
    // Thread.sleep(3000); // putting thread to sleep so user has time to open pollEv
    Control ctr = new Control();
    ctr.run(510, 335);
  }
}
