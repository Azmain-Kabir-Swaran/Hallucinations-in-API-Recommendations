package org.example;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;

class ValidationException extends Exception {
    ValidationException(String errorMessage) {
        super(errorMessage);
    }
}