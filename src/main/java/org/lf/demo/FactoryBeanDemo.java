package org.lf.demo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author liufu
 */
public class FactoryBeanDemo {

    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(factory).loadBeanDefinitions(new ClassPathResource("factoryBean.xml"));
        Object dog = factory.getBean("factoryBeanImpl");
        System.out.println(dog);
        Object factoryBeanImpl = factory.getBean("&factoryBeanImpl");
        System.out.println(factoryBeanImpl);
    }
}
