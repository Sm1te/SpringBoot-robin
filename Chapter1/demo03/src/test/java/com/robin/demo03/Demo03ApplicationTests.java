package com.robin.demo03;

import com.robin.demo03.anno.EnableFruit;
import com.robin.demo03.fruit.Banana;
import com.robin.demo03.fruit.Apple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableFruit
class Demo03ApplicationTests {

    @Autowired
    Apple apple;
    @Autowired
    Banana banana;
    @Test
    void contextLoads() {
        System.out.println("banana = " + banana);
        System.out.println("apple = " + apple);
    }

}
