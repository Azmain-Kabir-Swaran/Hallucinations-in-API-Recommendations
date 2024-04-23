package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {
    
    public static class MyBean {
        @Size(min = 10, max = 20)
        private String myProperty;

        public String getMyProperty() {
            return myProperty;
        }

        public void setMyProperty(String myProperty) {
            this.myProperty = myProperty;
        }
    }
    
    public static void main(String[] args) {
        MyBean bean = new MyBean();
        bean.setMyProperty("Hello, World!");
        
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        for (ConstraintViolation<MyBean> violation : validator.validate(bean)) {
            System.out.println(violation.getMessage());
        }
    }
}