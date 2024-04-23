package org.example;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;

class Main {

    // Simple POJO for validation
    public static class Employee {
        @jakarta.validation.constraints.NotBlank(message = "Employee Name can not be Blank")
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Employee employee = new Employee();
        employee.setName("John"); // Set a valid input

        Set<ConstraintViolation<Employee>> violations = validator.validate(employee);
        
        for (ConstraintViolation<Employee> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}