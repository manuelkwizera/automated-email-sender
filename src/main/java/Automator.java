import java.util.TimerTask;

public class Automator extends TimerTask {
    private SendMail sendMail;

    public Automator(SendMail sendMail){
        this.sendMail = sendMail;
    }
    @Override
    public void run(){
        sendMail.mail();
    }
}
