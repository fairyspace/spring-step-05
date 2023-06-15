package io.github.fairyspace.beans.factory.config;

public interface SingletonRegistry {
    Object getSingleton(String name);

  void addSingleton(String name, Object bean);
}
