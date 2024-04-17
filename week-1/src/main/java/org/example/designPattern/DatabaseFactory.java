package org.example.designPattern;

public class DatabaseFactory {
    Database getDatabase(String type) {
        return switch (type) {
            case "Postgres" -> new Postgres();
            case "MySql" -> new MySql();
            default -> throw new IllegalArgumentException("No such database");
        };
    }
}
