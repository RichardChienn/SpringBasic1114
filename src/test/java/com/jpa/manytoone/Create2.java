package com.jpa.manytoone;

import com.jpa.JPATemplate;
import com.jpa.entity.manytoone.Customer;
import com.jpa.entity.manytoone.Orders;
import org.junit.Test;

public class Create2 extends JPATemplate {
    @Test
    public void t1() {
        // id =7 Mary 要加購蛋糕
        Customer c1 = (Customer)session.get(Customer.class, 7);
        Orders o1 = new Orders();
        o1.setName("Cake");
        // 配置關聯關係
        o1.setCustomer(c1);
        
        // 執行保存動作    
        session.persist(o1);
      
        System.out.println("完成");
        
    }
}
