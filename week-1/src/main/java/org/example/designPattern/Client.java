package org.example.designPattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Client {

    @Test
    public void test() {
        DatabaseFactory factory = new DatabaseFactory();

        Database postgres = factory.getDatabase("Postgres");
        Database mySql = factory.getDatabase("MySql");

        assertEquals("Postgres", postgres.database());
        assertEquals("MySql", mySql.database());

    }
}
