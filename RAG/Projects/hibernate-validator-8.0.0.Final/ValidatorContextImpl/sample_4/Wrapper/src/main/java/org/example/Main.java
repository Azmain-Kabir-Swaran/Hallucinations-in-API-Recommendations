package org.example;


import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.validator.internal.engine.ValidationContextImpl;

public class Main {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        ValidationContextImpl context = new ValidationContextImpl(validator);
        context.addMessage("message");
        context.addMessage("message");
        System.out.println(context.getConstraintViolations());
    }
}