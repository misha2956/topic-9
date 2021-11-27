package client;

import client.enums.Sex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Mykhailo", 19, Sex.MALE);
    }

    @Test
    void getId() {
        int id = (new Client("Mykhailo", 19, Sex.MALE)).getId();
        assertEquals((new Client("Mykhailo", 19, Sex.MALE)).getId(), id + 1);
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(), Sex.MALE);
    }
}