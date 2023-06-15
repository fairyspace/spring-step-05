package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.factory.config.BeanDefinition;
import io.github.fairyspace.beans.BeanFactory;

public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {
    @Override
    public Object getBean(String name)  {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name,Object... args) {
       return doGetBean(name,args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) {
        return (T) getBean(name);
    }

    protected <T> T doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition,Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String name);


}
