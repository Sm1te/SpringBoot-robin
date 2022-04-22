package com.robin.demo03.filter;

import com.robin.demo03.service.HelloService;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;

public class MyExcludeFilter extends TypeExcludeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        return HelloService.class.getName().equals(metadataReader.getClassMetadata().getClassName());
    }
}
