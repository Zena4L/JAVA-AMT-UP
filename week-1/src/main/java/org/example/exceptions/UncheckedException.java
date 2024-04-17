package org.example.exceptions;

public class UncheckedException {

    class Database {
        private String databaseName;

        public String getName() {
            return this.databaseName;
        }

    }

    public static String retrieveUserName(Database database) {
        String name = "";
        try {
            name = database.getName();
        } catch (NullPointerException e) {
            System.out.println("This is a null database");
        }
        return name;
    }
}
