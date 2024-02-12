import java.util.Timer;
import java.util.TimerTask;
public class Main {

    public static void main(String[] args) {
        SendMail sendMail = new SendMail();
        Timer timer = new Timer();
        // email will be sent every after one minute( 1000 = milliseconds = 1 second)
        // run every 3 minutes (180,000 milliseconds)
        timer.schedule(new Automator(sendMail), 0, 180000);
        try {
            Thread.sleep(600000); // Sleep for 10 minutes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Terminate the timer
        timer.cancel();
    }
}
