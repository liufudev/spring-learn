package org.lf.demo;

import org.lf.pojo.Dog;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author liufu
 */
public class Start {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(factory).loadBeanDefinitions(new ClassPathResource("test.xml"));
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(Dog.class);
        factory.registerBeanDefinition("dog", newsProvider);
        Object result = factory.getBean("person");
        Object dog = factory.getBean("dog");
        System.out.println(dog);
        System.out.println(result);
    }

}
