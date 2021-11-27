import client.Client;
import client.enums.Sex;
import lombok.SneakyThrows;
import mail.MailBox;
import mail.MailCode;
import mail.MailInfo;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(new Client("Mykhailo", 19, Sex.MALE), MailCode.GREETINGS));
        mailBox.sendAll();
    }
}
