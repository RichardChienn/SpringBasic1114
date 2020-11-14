package com.sb.di;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext cts = new ClassPathXmlApplicationContext("beans-config.xml");
    }

}
