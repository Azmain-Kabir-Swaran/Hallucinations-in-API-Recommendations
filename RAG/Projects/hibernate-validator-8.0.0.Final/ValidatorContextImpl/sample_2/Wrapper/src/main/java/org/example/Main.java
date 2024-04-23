package org.example;


import javax.validation.Configuration;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import org.hibernate.validator.internal.engine.ValidationContextImpl;

public class Main {
    public static void main(String[] args) {
        Configuration<?> configuration = Validation.byDefaultProvider().configure();
        ValidatorFactory validatorFactory = configuration.buildValidatorFactory();
        ValidationContextImpl validationContext = new ValidationContextImpl(null, null, null);
        // you can add other validations here
    }
}