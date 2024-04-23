package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        MyBean myBean = new MyBean(null);
        Set<ConstraintViolation<MyBean>> violations = validator.validate(myBean);
        violations.stream().forEach(v -> System.out.println(v.getMessage()));
    }

    private static class MyBean {
        @NotNull
        private String field;

        public MyBean(String field) {
            this.field = field;
        }
    }
}