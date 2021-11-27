package mail;

import java.util.HashMap;

public class MailBox {
    private final HashMap<Integer, MailInfo> infos;
    private static Integer availId = 0;
    private final MailSender mailSender;

    public MailBox() {
        mailSender = new MailSender();
        infos = new HashMap<>();
    }

    public Integer addMailInfo(MailInfo mailInfo) {
        Integer newId = availId ++;
        infos.put(newId, mailInfo);
        return newId;
    }

    public boolean editMailInfo(Integer id, MailInfo mailInfo) {
        infos.put(id, mailInfo);
        return true;
    }

    public MailInfo getMailInfo(Integer id) {
        return infos.get(id);
    }

    public boolean sendAll() {
        if (infos.isEmpty()) {
            return false;
        }
        for (MailInfo info: infos.values()) {
            mailSender.sendMail(info);
        }
        infos.clear();
        return true;
    }
}
