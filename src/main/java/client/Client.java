package client;

import client.enums.Sex;
import lombok.Getter;
import lombok.Setter;

public class Client {
    private static int avail_id = 0;
    private final @Getter int id;
    private @Getter @Setter Sex sex;
    private @Getter @Setter String name;
    private @Getter @Setter int age;

    public Client(String name, int age, Sex sex) {
        this.sex = sex; this.name = name; this.age = age;
        id = avail_id;
        avail_id ++;
    }
}
