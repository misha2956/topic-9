package mail;

import java.io.IOException;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        try {
            System.out.println(mailInfo.getMailCode().generateText(mailInfo.getClient()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
