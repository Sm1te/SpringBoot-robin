package com.robin.demo03.anno;

import com.robin.demo03.fruit.Banana;
import com.robin.demo03.fruit.Apple;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//@Import({Apple.class, Banana.class})
//@Import({FruitImportSelector.class})
@Import({FruitImportDefinitionRegister.class})
public @interface EnableFruit {
}
