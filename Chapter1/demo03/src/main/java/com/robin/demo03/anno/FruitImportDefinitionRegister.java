package com.robin.demo03.anno;

import com.robin.demo03.fruit.Apple;
import com.robin.demo03.fruit.Banana;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class FruitImportDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        registry.registerBeanDefinition("apple", new RootBeanDefinition(Apple.class));
        registry.registerBeanDefinition("banana", new RootBeanDefinition(Banana.class));
    }
}
