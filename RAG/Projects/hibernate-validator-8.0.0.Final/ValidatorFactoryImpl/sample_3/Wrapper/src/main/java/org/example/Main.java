package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

public class Main {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        ExamplePojo examplePojo = new ExamplePojo();
        examplePojo.setData("TestData");

        Set<ConstraintViolation<ExamplePojo>> violations = validator.validate(examplePojo);

        if(!violations.isEmpty()){
            System.out.println("Validation Failed");
            violations.forEach(v -> System.out.println(v.getMessage()));
        } else {
            System.out.println("Validation Passed");
        }
    }

    static class ExamplePojo {
        @NotNull
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}