package org.example.generic;

public class Validator {

    public static <T> boolean validateData(T data, ValidationCriteria<T> criteria) {
        return criteria.test(data);
    }

    public interface ValidationCriteria<T> {
        boolean test(T data);
    }

    public static class PositiveNumberValidation implements ValidationCriteria<Number> {
        @Override
        public boolean test(Number data) {
            return data.doubleValue() > 0;
        }
    }

    public static class NonEmptyStringValidation implements ValidationCriteria<String> {
        @Override
        public boolean test(String data) {
            return !data.isEmpty();
        }
    }
}