package mail;

import client.Client;
import client.enums.Sex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private MailBox mailBox;

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
    }

    @Test
    void addMailInfo() {
        Integer id = mailBox.addMailInfo(new MailInfo(new Client("Mykhailo", 19, Sex.MALE), MailCode.GREETINGS));
        assertEquals(mailBox.getMailInfo(id).getClient().getName(),"Mykhailo");
    }

    @Test
    void editMailInfo() {
        Integer id = mailBox.addMailInfo(new MailInfo(new Client("Mykhailo", 19, Sex.MALE), MailCode.GREETINGS));
        mailBox.editMailInfo(id, new MailInfo(new Client("Mykhailo", 20, Sex.MALE), MailCode.GREETINGS));
        assertEquals(mailBox.getMailInfo(id).getClient().getAge(),20);
    }

    @Test
    void getMailInfo() {
        Integer id = mailBox.addMailInfo(new MailInfo(new Client("Mykhailo", 19, Sex.MALE), MailCode.GREETINGS));
        assertEquals(mailBox.getMailInfo(id).getClient().getName(),"Mykhailo");
    }

    @Test
    void sendAll() {
        Integer id = mailBox.addMailInfo(new MailInfo(new Client("Mykhailo", 19, Sex.MALE), MailCode.GREETINGS));
        assertTrue(mailBox.sendAll());
        assertFalse(mailBox.sendAll());
    }
}