package mail;

import client.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;
}
