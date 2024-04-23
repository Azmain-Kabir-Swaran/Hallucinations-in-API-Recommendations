package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.hibernate.validator.internal.engine.ValidationContext;
import org.hibernate.validator.internal.engine.ValidationDecorator;
import org.hibernate.validator.internal.engine.ValidationInterceptor;
import org.hibernate.validator.internal.engine.path.PathImpl;
import org.hibernate.validator.internal.engine.path.ValidationPathImpl;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

public class Main {
    public static void main(String[] args) {
        // Create Validator
        ValidatorFactory factory = Validation.byProvider(org.hibernate.validator.HibernateValidator.class).configure().buildValidatorFactory();
        Validator validator = factory.getValidator();

        // Define Bean to validate
        class Bean {
            @org.hibernate.validator.constraints.NotBlank
            public String field;
        }

        // Create Bean instance
        Bean bean = new Bean();

        // Validate
        ValidationDecorator decorator = new ValidationDecorator(null, null);
        decorator.setValidator(validator);
        decorator.setValidationContext(new ValidationContext(new ValidationPathImpl(PathImpl.createRootPath())));
        decorator.setValidationInterceptor(new ValidationInterceptor(new ParameterMessageInterpolator()));

        bean.field = null;
        Set<ConstraintViolation<Bean>> violations = decorator.validate(bean);

        for (ConstraintViolation<Bean> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}