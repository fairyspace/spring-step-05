package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.factory.config.SingletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonRegistry implements SingletonRegistry {
    private Map<String,Object> singletonObjects=new HashMap<>();
    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    @Override
    public void addSingleton(String name, Object singletonObject){
        singletonObjects.put(name, singletonObject);
    }
}
