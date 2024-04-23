package org.example;


import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;

public class Main {

    public static void main(String[] args) throws Exception {
        BeanA beanA = new BeanA();
        BeanB beanB = new BeanB();

        ConvertUtilsBean cvb = new ConvertUtilsBean();
        BeanUtilsBean bub = new BeanUtilsBean(cvb);

        // Fill BeanA properties...
        beanA.setName("John");
        beanA.setAge(30);

        // Copy BeanA to BeanB...
        bub.copyProperties(beanB, beanA);

        // Print BeanB properties...
        System.out.println("BeanB: " + beanB.getName() + ", " + beanB.getAge());
    }
}