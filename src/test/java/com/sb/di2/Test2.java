package com.sb.di2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void t2(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config2.xml");
        
        ctx.close();
    }
}
