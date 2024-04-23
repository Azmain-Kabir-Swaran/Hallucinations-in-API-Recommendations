package org.example;

import org.apache.commons.beanutils.PropertyUtils;
import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Main extends TestCase {

    @Test
    public void someTest() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object bean = new Object();
        PropertyUtils.setProperty(bean, "propertyName", "newValue");
        
        // Get property value from bean
        String propertyValue = (String) PropertyUtils.getProperty(bean, "propertyName");
        System.out.println(propertyValue);
        
        Properties props = new Properties();
        // Copy properties from bean to props
        PropertyUtils.copyProperties(props, bean);
    }
}