package org.example;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.BeanDefinitionVisitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        // do your logic
    }

    private void performBeanDefinitionParsing(String[] xmlConfigLocations) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((ConfigurableListableBeanFactory) applicationContext.getAutowireCapableBeanFactory());
        for (String configLocation : xmlConfigLocations) {
            reader.loadBeanDefinitions(configLocation);
        }
        BeanDefinitionVisitor visitor = new BeanDefinitionVisitor() {
            // your logic here
        };
        reader.getRegistry().forEach(beanName -> reader.getRegistry().getBeanDefinition(beanName).visit(visitor));
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Main main = context.getBean(Main.class);
        String[] xmlConfigLocations = {"classpath:applicationContext.xml"}; // define the location of your xml file
        main.performBeanDefinitionParsing(xmlConfigLocations);
        context.close();
    }
}