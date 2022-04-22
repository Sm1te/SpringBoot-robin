package com.robin.demo03.config;

import com.robin.demo03.filter.MyExcludeFilter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.PriorityOrdered;

public class MyAppInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.addBeanFactoryPostProcessor(new MyTypeExcludeFilterPostProcessor());
    }

    private static class MyTypeExcludeFilterPostProcessor implements PriorityOrdered, BeanDefinitionRegistryPostProcessor{
        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
            beanDefinitionRegistry.registerBeanDefinition(MyExcludeFilter.class.getName(), new RootBeanDefinition(MyExcludeFilter.class));
        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        }

        @Override
        public int getOrder() {
            return HIGHEST_PRECEDENCE;
        }
    }
}
