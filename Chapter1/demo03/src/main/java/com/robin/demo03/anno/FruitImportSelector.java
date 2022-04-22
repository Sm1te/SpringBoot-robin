package com.robin.demo03.anno;

import com.robin.demo03.fruit.Apple;
import com.robin.demo03.fruit.Banana;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class FruitImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Apple.class.getName(), Banana.class.getName()};
    }
}
