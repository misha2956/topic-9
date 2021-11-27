package mail;

import client.Client;

import java.io.*;
import java.nio.charset.StandardCharsets;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText(Client client) throws IOException {
        InputStream input = getClass().getClassLoader().getResourceAsStream(filename);
        if (input != null) {
            Reader msg = new InputStreamReader(input, StandardCharsets.UTF_8);
            StringBuilder stringBuilder = new StringBuilder();
            char [] buf = new char[1024]; int bytesNum;
            while ((bytesNum = msg.read(buf, 0, 1024)) > 0) {
                stringBuilder.append(buf, 0, bytesNum);
            }
            String res = stringBuilder.toString();
            return res.replaceAll("\\{user}", client.getName());
        } else {
            throw new IOException("Cannot create InputStream");
        }
    }
}

