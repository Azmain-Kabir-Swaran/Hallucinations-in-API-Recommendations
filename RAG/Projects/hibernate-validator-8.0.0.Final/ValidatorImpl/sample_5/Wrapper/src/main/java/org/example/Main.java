package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {
    
    public static class MyClass {
        @Length(min = 3, max = 100)
        private String stringProp;
        private int intProp;

        public String getStringProp() {
            return stringProp;
        }

        public void setStringProp(String stringProp) {
            this.stringProp = stringProp;
        }

        public int getIntProp() {
            return intProp;
        }

        public void setIntProp(int intProp) {
            this.intProp = intProp;
        }
    }

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        MyClass myObject = new MyClass();
        myObject.setStringProp("valid");
        myObject.setIntProp(1);

        System.out.println(validator.validate(myObject).size());
    }
}