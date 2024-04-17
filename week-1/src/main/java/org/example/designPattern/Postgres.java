package org.example.designPattern;

public class Postgres implements Database{

    @Override
    public String database() {
        return "Postgres";
    }
}
