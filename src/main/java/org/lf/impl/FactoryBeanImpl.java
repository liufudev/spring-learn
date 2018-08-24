package org.lf.impl;

import org.lf.pojo.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author liufu
 */
@Component
public class FactoryBeanImpl implements FactoryBean {

    public Object getObject() throws Exception {
        return new Dog();
    }

    public Class<?> getObjectType() {
        return Dog.class;
    }
}
